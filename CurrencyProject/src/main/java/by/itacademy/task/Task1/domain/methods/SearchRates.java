package by.itacademy.task.Task1.domain.methods;


import java.util.InputMismatchException;

import by.itacademy.task.Task1.Main;
import by.itacademy.task.Task1.domain.entity.Currency;

import java.util.List;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 1/29/18
 */
public class SearchRates extends Search {
    /**
     * Inherited class that overrides abstract method from Search.class
     * to search for currency by name.
     * Cae register of input does not matter.
     *
     * @param list
     */
    @Override
    public void searchSmth(List<Currency> list) {

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter currency name for searching: ");
        String currencyName = input.next();
        boolean result = false;
        for (Currency name : list) {
            if (name.getName().equals(currencyName)) {
                Main.printSearchCurrencyResult(list, currencyName);
                result = true;
            }
        }
        if (!result) {
            Main.printNotFound();
        }
    }
}
