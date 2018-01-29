package by.itacademy.task.Task1;

import by.itacademy.task.Task1.domain.entity.Root;
import by.itacademy.task.Task1.domain.methods.FullCurrencyName;
import by.itacademy.task.Task1.domain.methods.Manager;

import java.util.*;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Main {
    public final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        boolean checkParse = false;
        Root root = new Root();
//      user selects what type of file to download
        int userSelectionDownloadMethod = selectFileTypeForDownload();
//      call method to download file
        Manager.downloadFile(userSelectionDownloadMethod);
//      call method to parse file
        root = Manager.parseFile(userSelectionDownloadMethod);
//      call user menu to select action with data from the file
        int userSelectionOfAction = selectActionMenu();
//      call method to work with file
        Manager.userSelection(userSelectionOfAction, root);

//

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

            switch (userSelectionOfAction){
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
            }
        } while (userSelectionOfAction!=0);

        return userSelectionOfAction;
    }

    public static void userMenu(){

        System.out.println();
        System.out.println("Select action you want to perform: ");
        System.out.println("1 - Convert currency");
        System.out.println("2 - Search for Exchange Rates");
        System.out.println("3 - Print the full Currency List");
        System.out.println("4 - Sort by Currency Name");
        System.out.println("Please, make your choice: ");

    }
}

