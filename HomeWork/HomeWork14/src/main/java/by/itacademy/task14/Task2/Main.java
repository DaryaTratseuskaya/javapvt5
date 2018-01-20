package by.itacademy.task14.Task2;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by daryatratseuskaya on 1/15/18
 */
public class Main {


    public static void main(String[] args) {
        Logger.getLogger("org.jaudiotagger").setLevel(Level.OFF);


        // check we are good with cmd line arguments
        if (!(args != null && args.length > 0)) {
            System.err.println("Invalid arguments");
            printHelp();
            return;
        }

        for (String argument : args) {
            FileScanner fileScanner = new FileScanner(argument);
            List<Artist> m = fileScanner.getArtists();
            FileScanner.printMusicData(m);

            fileScanner.checkSumIdentical(m);
        }

    }

    private static void printHelp() {
        System.out.println("***             List Music Files Awesome Utility                ***");
        System.out.println("*** Usage: java LocalMusic [MusicDir1] [MusicDir2] [...]        ***");
    }

}

