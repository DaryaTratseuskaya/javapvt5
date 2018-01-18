package by.itacademy.task14.Task2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by daryatratseuskaya on 1/15/18
 */
public class AudioMetadataExtractorDemo {

    public static void main(String[] args) {
        Logger.getLogger("org.jaudiotagger").setLevel(Level.OFF);

        // check we are good with cmd line arguments
        if (!(args != null && args.length > 0)) {
            System.err.println("Invalid arguments");
            printHelp();
            return;
        }

        for (String argument : args) {
            File f = new File(argument);
            if (f.isDirectory() && f.canRead()) {
                traverseDirAndPrintAudioFiles(f);

            } else {
                System.err.println("Directory " + argument + " specified, " +
                        "but it is not accessible (please make sure the name is correct");
            }
        }
    }

    private static void traverseDirAndPrintAudioFiles(File parentDir) {
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
                        getMp3MetaData(f);
                    }

                }
            }
        }
    }

    private static void printHelp() {
        System.out.println("***             List Music Files Awesome Utility                ***");
        System.out.println("*** Usage: java LocalMusic [MusicDir1] [MusicDir2] [...]        ***");
    }

    public static void getMp3MetaData(File file) {


        int duration;
        String artist, album, title;

        try {
            AudioFile audioFile = AudioFileIO.read(file);
            AudioHeader audioHeader = audioFile.getAudioHeader();

            artist = audioFile.getTag().getFirst(FieldKey.ARTIST);
            album = audioFile.getTag().getFirst(FieldKey.ALBUM);
            title = audioFile.getTag().getFirst(FieldKey.TITLE);
            duration = audioHeader.getTrackLength();


            System.out.println("Artist: " + artist);
            System.out.println("\t" + "Album: " + album);
            System.out.println("\t" + "Title: " + title + ". Duration: " + duration + "sec. (" + file.getAbsolutePath() + ")");
            System.out.println();


        } catch (CannotReadException | TagException | InvalidAudioFrameException | IOException | ReadOnlyFileException e) {
            e.printStackTrace();
        }


    }


}

