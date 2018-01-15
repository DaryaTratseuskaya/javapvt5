package by.itacademy.task14.Task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by daryatratseuskaya on 1/15/18
 */
public class AudioMetadataExtractorDemo {

    public static void main(String[] args) {

// This audio file has metadata embedded in XMP (Extensible Metadata Platform) standard
// created by Adobe Systems Inc. XMP standardizes the definition, creation, and
// processing of extensible metadata.
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
                        // you can adjust output format here
                        System.out.println("Found audio file " + f.getAbsolutePath());
                        getMetaData(f);
                    }
                }
            }
        }
    }

    private static void printHelp() {
        System.out.println("***             List Music Files Awesome Utility                ***");
        System.out.println("*** Usage: java LocalMusic [MusicDir1] [MusicDir2] [...]        ***");
    }

    public static void getMetaData(File file) {

        try {

            InputStream input = new FileInputStream(new File(String.valueOf(file)));
            ContentHandler handler = new DefaultHandler();
            Metadata metadata = new Metadata();
            Parser parser = new Mp3Parser();
            ParseContext parseCtx = new ParseContext();
            parser.parse(input, handler, metadata, parseCtx);
            input.close();

// List all metadata
//            String[] metadataNames = metadata.names();
//
//            for (String name : metadataNames) {
//                System.out.println(name + ": " + metadata.get(name));
//            }

// Retrieve the necessary info from metadata
// Names - title, xmpDM:artist etc. - mentioned below may differ based
// on the standard used for processing and storing standardized and/or
// proprietary information relating to the contents of a file.

            System.out.println("Title: " + metadata.get("title"));
            System.out.println("Artists: " + metadata.get("xmpDM:artist"));
            System.out.println("Genre: " + metadata.get("xmpDM:genre"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (TikaException e) {
            e.printStackTrace();
        }
    }
}

