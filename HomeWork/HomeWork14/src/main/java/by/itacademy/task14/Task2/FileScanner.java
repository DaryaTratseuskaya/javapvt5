package by.itacademy.task14.Task2;

import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.TagException;

import javax.lang.model.type.ArrayType;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Created by daryatratseuskaya on 1/19/18
 */
public class FileScanner {
    private List<Track> trackList = new ArrayList<>();

    public List<Track> getTrackList() {
        return trackList;
    }

    private Artist getOrCreateNewArtist(List<Artist> artists, String artistName) {

        for (Artist a : artists) {
            if (a.getNameArtist().equals(artistName)) {
                return a;
            }
        }
        Artist a = new Artist();
        a.setNameArtist(artistName);
        artists.add(a);
        return a;
    }

    private Album getOrCreateNewAlbum(Artist artist, String albumName) {

        for (Album a : artist.getAlbums()) {
            if (a.getNameAlbum().equals(albumName)) {
                return a;

            }
        }
        Album a = new Album();
        a.setNameAlbum(albumName);
        artist.getAlbums().add(a);
        return a;
    }

    public List<Artist> getArtists() {

        List<Artist> result = new ArrayList<>();

        if (trackList != null && trackList.size() > 0) {

            for (Track m : trackList) {

                String albumName = m.getAlbum();
                String artistName = m.getArtist();

                Artist artist = getOrCreateNewArtist(result, artistName);
                Album album = getOrCreateNewAlbum(artist, albumName);

                album.getTracks().add(m);
            }
            return result;
        }
        return null;
    }

    public static void printMusicData(List<Artist> artists) {

        for (int i = 0; i < artists.size(); i++) {
            System.out.println("Artist: " + artists.get(i).getNameArtist());

            for (int j = 0; j < artists.get(i).getAlbums().size(); j++) {
                System.out.println("Album: " + artists.get(i).getAlbums().get(j).getNameAlbum());

                for (int k = 0; k < artists.get(i).getAlbums().get(j).getTracks().size(); k++) {
                    System.out.println("Track #" + k + ": " + artists.get(i).getAlbums().get(j).getTracks().get(k).getTrackName() + ", duration: "
                            + artists.get(i).getAlbums().get(j).getTracks().get(k).getTrackDuration() + " sec,  "
                            + artists.get(i).getAlbums().get(j).getTracks().get(k).getTrackPath());

                    int d = 0;
                }
            }
        }
    }

    public FileScanner(String musicDirPath) {
        this.trackList = trackList;
        File f = new File(musicDirPath);
        if (f.isDirectory() && f.canRead()) {

            traverseDirAndPrintAudioFiles(f);
        } else {
            System.err.println("Directory " + musicDirPath + " specified, " +
                    "but it is not accessible (please make sure the name is correct");
        }
    }

    private void traverseDirAndPrintAudioFiles(File parentDir) {
        if (parentDir != null && parentDir.isDirectory() && parentDir.canRead()) {
            for (File f : parentDir.listFiles()) {
                if (f.isDirectory()) {
                    // recursive call
                    traverseDirAndPrintAudioFiles(f);
                } else {
                    if (f.getName().endsWith(".mp3") ||
                            f.getName().endsWith(".ogg") ||
                            f.getName().endsWith(".flac") ||
                            f.getName().endsWith(".aac")) {

                        Track track = extractMp3MetaData(f);
                        trackList.add(track);

                    }
                }
            }
        }
    }

    public Track extractMp3MetaData(File file) {
        Track trackResult = new Track();


        int duration;
        String artist, album, title;

        try {
            AudioFile audioFile = AudioFileIO.read(file);
            AudioHeader audioHeader = audioFile.getAudioHeader();

            artist = audioFile.getTag().getFirst(FieldKey.ARTIST);
            album = audioFile.getTag().getFirst(FieldKey.ALBUM);
            title = audioFile.getTag().getFirst(FieldKey.TITLE);
            duration = audioHeader.getTrackLength();

            trackResult.setArtist(artist);
            trackResult.setAlbum(album);
            trackResult.setTrackName(title);
            trackResult.setTrackDuration(duration);
            trackResult.setTrackPath(file.getPath());

            FileInputStream fis = new FileInputStream(file);
            String md5 = org.apache.commons.codec.digest.DigestUtils.md5Hex(fis);
            fis.close();

            trackResult.setCheckSum(md5);


        } catch (CannotReadException | TagException | InvalidAudioFrameException | IOException | ReadOnlyFileException e) {
            e.printStackTrace();
        }
        return trackResult;

    }

    public void checkSumIdentical(List<Artist> artists) {

        Set s = new HashSet();
        Set <String> dups = new HashSet();
        List<Artist> result = new ArrayList<>();
        String checkSum = null;

        for (int i = 0; i < artists.size(); i++) {
            for (int j = 0; j < artists.get(i).getAlbums().size(); j++) {
                for (int k = 0; k < artists.get(i).getAlbums().get(j).getTracks().size(); k++) {
                    checkSum = artists.get(i).getAlbums().get(j).getTracks().get(k).getCheckSum();
                    if (!s.add(checkSum)) dups.add(checkSum);
                }
            }
        }
        for (String checkSumDup : dups){
            for (Track t : trackList){
                if (t.getCheckSum().equals(checkSumDup)){
                    System.out.println("Set :- " + dups + ", path = " + t.getTrackPath());

                }
            }

        }


    }

    public List<Track> getIdenticalFiles() {

        List<Track> result = new ArrayList<>();
        Map<String, MusicDataIdentical> mapCheckSum = new HashMap<>();

        for (Track m : trackList) {
            String checkSum = m.getCheckSum();
            MusicDataIdentical identicalFiles = mapCheckSum.containsKey(checkSum) ? mapCheckSum.get(checkSum) : new MusicDataIdentical();

            identicalFiles.increment();
            identicalFiles.getTrackList().add(m);

            if (!mapCheckSum.containsKey(checkSum)) {
                mapCheckSum.put(checkSum, identicalFiles);
            }
        }
        for (String checkSum : mapCheckSum.keySet()) {
            MusicDataIdentical identical = mapCheckSum.get(checkSum);
            if (identical.count > 1) {
                result.addAll(identical.getTrackList());

            }
        }
        return result;
    }

    private static class MusicDataIdentical {
        private List<Track> trackList = new ArrayList<>();
        private int count = 0;

        public List<Track> getTrackList() {
            return trackList;
        }

        public void setTrackList(List<Track> trackList) {
            this.trackList = trackList;
        }

        public int getCount() {
            return count;
        }

        public void increment() {
            this.count += 1;
        }
    }
}



