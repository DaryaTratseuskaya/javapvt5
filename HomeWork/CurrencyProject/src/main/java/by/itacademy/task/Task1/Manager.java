package by.itacademy.task.Task1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Manager {

    public static void conversion(double firstCurrency, double secondCurrency) {


    }

    public static void downloadFile(int userSelectionDownloadMethod) {

        if (userSelectionDownloadMethod != 1) {
            Downloader.downloadXML();
        } else Downloader.downloadJSON();
    }

    public static Root parseFile(int userSelectionDownloadMethod) {
        Parsing parsing = null;

        if (userSelectionDownloadMethod != 1) {

            parsing = new ParseXML();
        } else parsing = new ParseJSON();

        Root root = parsing.parse("currency");
        List<Currency> currencyList = new ArrayList<>();
        return root;
    }


    public static void userSelection(int userSelectionOfAction, Root root) {
        if (userSelectionOfAction == 3) {
                printCurrencyList(root);
            }
        }


    public static void printCurrencyList(Root root) {
        for (int i = 0; i < root.getCurrency().size(); i++) {
            System.out.println(root.getCurrency().get(i).getName());
        }
    }

}



