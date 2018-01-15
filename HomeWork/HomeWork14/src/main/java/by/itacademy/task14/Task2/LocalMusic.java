package by.itacademy.task14.Task2;

import java.io.File;

/**
 * Created by daryatratseuskaya on 1/12/18
 * Написать каталогизатор mp3-файлов, который сканирует перечень указанных в командной строке каталогов и выводит их на экран
 */
public class LocalMusic {
    public static void main(String[] args) {
        // check we are good with cmd line arguments
        if (!(args != null && args.length > 0)) {
            System.err.println("Invalid arguments");
            printHelp();
            return;
        }

        for (String argument: args) {
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
                    }
                }
            }
        }
    }

    private static void printHelp() {
        System.out.println("***             List Music Files Awesome Utility                ***");
        System.out.println("*** Usage: java LocalMusic [MusicDir1] [MusicDir2] [...]        ***");
    }
}
