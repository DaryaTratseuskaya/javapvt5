package by.itacademy.task.Task1.domain.methods;

import by.itacademy.task.Task1.Main;
import by.itacademy.task.Task1.domain.entity.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 1/29/18
 */
public class ConvertCurrency {

    public void convertCurrency(List<Currency> list) {

        // user input currency name he want to change FROM
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency source currency name:  ");
        String sourceCurrencyName = input.next();
        boolean searchResult = false;
        // searching for entered currency in the Currency list
        for (Currency name : list) {
            if (name.getName().equals(sourceCurrencyName)) {
                System.out.println("Source currency – " + name.getName());
                searchResult = true;
            }
        }
        if (!searchResult) {
            Main.printNotFound();
            System.out.println("Enter currency source currency name:  ");
            input.next();
        }
        // user input currency name he want to change TO
        System.out.println("Enter target currency name: ");
        String targetCurrencyName = input.next();

        // searching for entered currency in the Currency list and getting currency.name.Rate
//        for (Currency name : list) {
//            if (name.getName().toLowerCase().equals(targetCurrencyName)) {
//                System.out.println("Target currency – " + name.getName() + " Rate " + name.getRate());
//                double targetCurrencyRate = name.getRate();
//            }
//
//        }

        // user input AMOUNT he wants to change
        System.out.println("Enter amount ");
        double sourceAmount = input.nextDouble();


        CalculateAmount calculateAmount = new CalculateAmount();

        double targetCurrencyRate = calculateAmount.getTargetRate(targetCurrencyName, list);
        double result = calculateAmount.calculateAmountMethod(sourceAmount, targetCurrencyRate);
        System.out.println(result);

    }

    // inner class to calculate result amount
    public class CalculateAmount {

//        List<Currency> currencyList = new ArrayList<>();

        /**
         * method to calculate result amount for conversion
         *
         * @param sourceAmount
         * @param targetCurrencyRate
         * @return totalAmount
         */
        public double calculateAmountMethod(double sourceAmount, double targetCurrencyRate) {
            double totalAmount = 0;
            return totalAmount = sourceAmount * targetCurrencyRate;
        }

        /**
         * method to get Rate for target currency
         *
         * @param targetCurrencyName
         * @param list
         * @return targetCurrencyRate
         */
        public double getTargetRate(String targetCurrencyName, List<Currency> list) {
            double targetCurrencyRate = 0;
            boolean searchResult = false;
            for (Currency name : list) {
                if (name.getName().equals(targetCurrencyName)) {
                    System.out.println("Target currency" + name.getName() + " Rate " + name.getRate());
                    targetCurrencyRate = name.getRate();
                    searchResult = true;
                }

            }
            if (!searchResult) {
                Main.printNotFound();

            }
            return targetCurrencyRate;
        }
    }

}
