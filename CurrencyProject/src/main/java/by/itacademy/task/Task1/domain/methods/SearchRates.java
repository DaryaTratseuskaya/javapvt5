package by.itacademy.task.Task1.domain.methods;


import java.util.InputMismatchException;

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
        System.out.println("Enter currency code for searching ");
        String currencyName = input.next();
        boolean result = false;
        for (Currency name : list) {
            if (name.getName().toLowerCase().equals(currencyName)) {
                System.out.println("| Currency name: " + name.getName() + " | Code: " + name.getCode()
                        + " | Rate: " + name.getRate() + " |");
                result = true;
            }
        } if (!result){
            printNotFound();
        }

    }

    public void printNotFound(){
        System.out.println(" Currency Not found.");
    }
}
