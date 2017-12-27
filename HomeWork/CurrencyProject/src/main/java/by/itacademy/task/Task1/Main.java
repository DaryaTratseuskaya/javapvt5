package by.itacademy.task.Task1;

import java.util.Scanner;

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
        System.out.println("0 - Exit application");
        System.out.println("Please, make your choice: ");
        userSelectionDownloadMethod = input.nextInt();

        return userSelectionDownloadMethod;
    }


    public static int selectActionMenu() {
        int userSelectionOfAction = 0;

        System.out.println();
        System.out.println("Select action you want perform: ");
        System.out.println("1 - Convert currency");
        System.out.println("2 - Search for Exchange Rates");
        System.out.println("3 - Print the full Currency List");
        System.out.println("4 - Sort by Currency Name");
        System.out.println("Please, make your choice: ");
        userSelectionOfAction = input.nextInt();

        return userSelectionOfAction;
    }

    private static int readInt(String message) {
        Integer result = null;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print(message);
            String input = scanner.next();

            try {
                result = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Please give me a number");
            }

        } while (result == null);


        return result;
    }


}

