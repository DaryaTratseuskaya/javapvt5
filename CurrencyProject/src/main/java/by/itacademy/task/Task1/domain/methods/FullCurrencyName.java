package by.itacademy.task.Task1.domain.methods;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 1/27/18
 */
public class FullCurrencyName {
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
