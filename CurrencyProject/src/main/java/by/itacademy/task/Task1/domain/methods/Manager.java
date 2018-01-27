package by.itacademy.task.Task1;

import by.itacademy.task.Task1.data.downloader.Downloader;
import by.itacademy.task.Task1.data.parser.Parsing;
import by.itacademy.task.Task1.data.parser.json.ParseJSON;
import by.itacademy.task.Task1.data.parser.xml.ParseXML;
import by.itacademy.task.Task1.domain.entity.Root;

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
        return root;
    }


    public static void userSelection(int userSelectionOfAction, Root root) {
        switch (userSelectionOfAction){
            case (1): {

            }
            case (2): {

            }
            case (3): {
                addFullCurrencyName();
                break;

            }

        }
    }


    public static void addFullCurrencyName() {


        List<String> currencyList = new ArrayList<>();
        currencyList.add("USD – United States Dollar");
        currencyList.add("EUR – Euro Member Countries");
        currencyList.add("CZK – Czech Republic Koruna");
        currencyList.add("HUF – Hungary Forint");
        currencyList.add("CAD – Canada Dollar");
        currencyList.add("ILS – Israel Shekel");


        for (int i = 0; i < currencyList.size(); i++) {

            System.out.println(currencyList.get(i));
        }


    }


}



