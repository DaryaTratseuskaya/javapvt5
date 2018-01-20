package by.itacademy.task14.Task2;

/**
 * Created by daryatratseuskaya on 1/19/18
 */
public class Track {

    private String artist;
    private String album;
    private String trackName;
    private int trackDuration;
    private String trackPath;
    private String filePath;
    private String checkSum;

    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public int getTrackDuration() {
        return trackDuration;
    }

    public void setTrackDuration(int trackDuration) {
        this.trackDuration = trackDuration;
    }

    public String getTrackPath() {
        return trackPath;
    }

    public void setTrackPath(String trackPath) {
        this.trackPath = trackPath;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        if (trackDuration != track.trackDuration) return false;
        if (artist != null ? !artist.equals(track.artist) : track.artist != null) return false;
        if (album != null ? !album.equals(track.album) : track.album != null) return false;
        if (trackName != null ? !trackName.equals(track.trackName) : track.trackName != null) return false;
        return trackPath != null ? trackPath.equals(track.trackPath) : track.trackPath == null;
    }

    @Override
    public int hashCode() {
        int result = artist != null ? artist.hashCode() : 0;
        result = 31 * result + (album != null ? album.hashCode() : 0);
        result = 31 * result + (trackName != null ? trackName.hashCode() : 0);
        result = 31 * result + trackDuration;
        result = 31 * result + (trackPath != null ? trackPath.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Track{" +
                "artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", trackName='" + trackName + '\'' +
                ", trackDuration=" + trackDuration +
                ", trackPath='" + trackPath + '\'' +
                '}';
    }
}
