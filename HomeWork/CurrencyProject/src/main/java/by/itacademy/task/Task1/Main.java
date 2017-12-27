package by.itacademy.task.Task1;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Main {
    public final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean checkParse = false;

       int userSelectionForParseMethods = startScreenMenu();
        checkParse = selectParseWay(userSelectionForParseMethods);
        if (checkParse) {
            int userSelector = selectActionMenu();
            if (userSelector != 0) {
                 userSelection(userSelector);

            }

        }


    }


    public static int startScreenMenu() {
        int userSelectionForParseMethods = 0;

        System.out.println("Please, make your choice: ");
        System.out.println("1 - Download XML");
        System.out.println("2 - Download JSON");
        System.out.println("0 - Exit application");
        System.out.println("Please, make your choice: ");
        userSelectionForParseMethods = input.nextInt();

        return userSelectionForParseMethods;
    }

    public static int selectActionMenu() {
        int userSelector = 0;

        System.out.println();
        System.out.println("Select action you want perform: ");
        System.out.println("1 - Convert currency");
        System.out.println("2 - Search for Exchange Rates");
        System.out.println("3 - Print the full Currency List");
        System.out.println("4 - Sort by Currency Name");
        System.out.println("Please, make your choice: ");
        userSelector = input.nextInt();

        return userSelector;
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

    public static boolean selectParseWay(int userSelectionForParseMethods) {


        boolean success = false;

        do {

//            userSelectionForParseMethods = input.nextInt();

            switch (userSelectionForParseMethods) {
                case 1: {
                    while (!success) {
                        try {

                            Downloader.downloadXML();
                            Parsing parsing = null;
                            parsing = new ParseXML();
                            Root root = parsing.parse("currency.xml");
                            success = true;
                        } catch (Exception e) {
                            input.next();
                            System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                        }

                    }
                    break;
                }
                case 2: {
                    while (!success) {
                        try {
                            Downloader.downloadJSON();
                            Parsing parsing = null;
                            parsing = new ParseJSON();
                            Root root = parsing.parse("currency.json");
                            success = true;

                        } catch (Exception e) {
                            input.next();
                            System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                        }
                    }
                }
            }
        }
        while (!success);

        return success;
    }

    public static void userSelection(int select) {
        Integer selector = null;
        boolean success = false;

        do {

//            selector = input.nextInt();

            switch (select) {
                case 1: {
                    while (!success) {
                        try {
//call for convert method
                            System.out.println("Base currency is EUR: Enter the sum you want to convert:");
                            double sum = 0;
                            sum = input.nextDouble();
                            System.out.println("Enter currency you want to convert:");


                            success = true;
                        } catch (Exception e) {
                            input.next();
                            System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                        }

                    }
                    break;
                }
                case 2: {
                    while (!success) {
                        try {

//call for search currency
                            success = true;
                        } catch (Exception e) {
                            input.next();
                            System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                        }

                    }
                    break;
                }
                case 3: {
                    while (!success) {
                        try {
//                            Manager manager = new Manager();
//                            manager.printAllCurrencies();
//call for print

//                            for (int i = 0; i < root.getCurrency().size(); i++) {
//                                System.out.println( root.getCurrency().get(i).getName());
//                            }


                            success = true;
                        } catch (Exception e) {
                            input.next();
                            System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                        }

                    }
                    break;
                }
                case 4: {
                    while (!success) {
                        try {

//call for sorting
                            success = true;
                        } catch (Exception e) {
                            input.next();
                            System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                        }

                    }
                    break;
                }

            }

        } while (!success);
    }
}

