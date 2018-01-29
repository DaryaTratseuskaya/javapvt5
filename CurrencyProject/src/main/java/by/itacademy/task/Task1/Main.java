package by.itacademy.task.Task1;

import by.itacademy.task.Task1.domain.entity.Root;
import by.itacademy.task.Task1.domain.methods.ParseThreadJSON;
import by.itacademy.task.Task1.domain.methods.FullCurrencyName;
import by.itacademy.task.Task1.domain.methods.ParseThreadXML;

import java.util.*;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Main {
    public final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        ParseThreadXML parseThreadXML;
        ParseThreadJSON parseThreadJSON;

// calling method for user to make a selection what file type he wants to download
//        and writing it to variable
        int userSelectionDownloadMethod = selectFileTypeForDownload();

// starting different threads to parse file according to user selection
        if (userSelectionDownloadMethod == 1) {
            parseThreadXML = new ParseThreadXML(userSelectionDownloadMethod);
            Thread pThread = new Thread(parseThreadXML);
            pThread.start();
            try {
                pThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (userSelectionDownloadMethod == 2) {
            parseThreadJSON = new ParseThreadJSON(userSelectionDownloadMethod);
            Thread pThread = new Thread(parseThreadJSON);
            pThread.start();
            try {
                pThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



            Root root = new Root();


//      user selects what type of file to download
//        int userSelectionDownloadMethod = selectFileTypeForDownload();
//      call method to download file
//        Manager.downloadFile(userSelectionDownloadMethod);
//      call method to parse file
//        root = Manager.parseFile(userSelectionDownloadMethod);
//      call user menu to select action with data from the file
//        int userSelectionOfAction = selectActionMenu();
//      call method to work with file


        }
    }

    /**
     * Select type of file to Download
     *
     * @return
     */
    public static int selectFileTypeForDownload() {

        int userSelectionDownloadMethod = 0;

        System.out.println("Please, make your choice: ");
        System.out.println("1 - Download XML");
        System.out.println("2 - Download JSON");
        while (!input.hasNextInt()) {
            System.out.println("Enter 1 or 2 ");
            input.next();
        }
        try {
            userSelectionDownloadMethod = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Incorrect entry " + e.toString() + " Enter Integer");
        }
        return userSelectionDownloadMethod;
    }


    public static int selectActionMenu() {
        userMenu();
        int userSelectionOfAction = 0;

        do {
            while (!input.hasNextInt()) {
                System.out.println("Enter Integer from 1 to 4, please, make your choice:");
                input.next();
            }
            userSelectionOfAction = input.nextInt();

            switch (userSelectionOfAction) {
                case (1): {
                    System.out.println("entered 1");

                    break;
                }
                case (2): {
                    System.out.println("entered 2");
                    break;
                }
                case (3): {
                    FullCurrencyName.addFullCurrencyName();
                    break;
                }
                case (4): {
                    System.out.println("entered 4");
                    break;
                }
                case (0): {
                    System.out.println("Exit");
                    break;
                }
            }
        } while (userSelectionOfAction != 0);

        return userSelectionOfAction;
    }

    public static void userMenu() {

        System.out.println();
        System.out.println("Select action you want to perform: ");
        System.out.println("1 - Convert currency");
        System.out.println("2 - Search for Exchange Rates");
        System.out.println("3 - Print the full Currency List");
        System.out.println("4 - Sort by Currency Name");
        System.out.println("0 - Exit");
        System.out.println("Please, make your choice: ");

    }
}

