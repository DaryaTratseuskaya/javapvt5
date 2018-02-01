package by.itacademy.task.Task1.domain.methods;

import by.itacademy.task.Task1.Main;
import by.itacademy.task.Task1.domain.entity.Currency;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 1/29/18
 */
public class ConvertCurrency {
    /**
     * base currency = EUR
     * 1. From base to target:
     * When amount in EUR should be converted to Target Currency
     * [Amount Target Currency] = Rate * [Amount in Base Currency]
     * [11,215 USD] = USD rate (1,1215) * [10 EUR]
     * ==========================================================================
     * 2. When NOT Base Currency should be converted to Target Currency
     * [Amount Target Currency2] = [Amount Target Currency1] * [Rate2] / [Rate1]
     * [CZK] = [10 USD] * [27,43 CZK Rate] / [1,1215 USD Rate]
     *
     * @param list
     */

    double finalAmount = 0;


    public void convertCurrency(List<Currency> list, String sourceCurrencyName, String targetCurrencyName, double sourceAmount) {

        CalculateAmount calculateAmount = new CalculateAmount();

        double targetCurrencyRate = calculateAmount.getTargetRate(targetCurrencyName, list);
//TODO сделать нормальную проверку на базовую валюту
        if (sourceCurrencyName.equals("EUR")) {
            double result = calculateAmount.baseToTargetCurrencyConvertCalc(sourceAmount, targetCurrencyRate);

            Main.printBaseToTargetCurConvertResult(targetCurrencyName, sourceAmount, targetCurrencyRate,
                    sourceCurrencyName, result);
        } else {
            double baseRate = calculateAmount.getBaseRate(list);
            double result2 = calculateAmount.targetToTargetCurrencyConvertCalc(sourceAmount, targetCurrencyRate, baseRate);

            Main.printTargetToTargetCurConvertResult(targetCurrencyName, sourceAmount, targetCurrencyRate,
                    sourceCurrencyName, result2);
        }
    }

    // inner class to calculate result amount
    public class CalculateAmount {

        /**
         * method to calculate result amount for conversion #1
         * [Amount Target Currency] = Rate * [Amount in Base Currency]
         * Example:  [11,215 USD] = USD rate (1,1215) * [10 EUR]
         *
         * @param sourceAmount
         * @param targetCurrencyRate
         * @return finalAmount
         */
        public double baseToTargetCurrencyConvertCalc(double sourceAmount, double targetCurrencyRate) {
            return finalAmount = targetCurrencyRate * sourceAmount;
        }

        /**
         * [Amount Target Currency2] = [Amount Target Currency1] * [Rate2] / [Rate1]
         * Example: [CZK] = [10 USD] * [27,43 CZK Rate] / [1,1215 USD Rate]
         *
         * @param sourceAmount
         * @param targetCurrencyRate
         * @return finalAmount
         */
        public double targetToTargetCurrencyConvertCalc(double sourceAmount, double targetCurrencyRate, double baseCurrencyRate) {
            return finalAmount = (sourceAmount * targetCurrencyRate) / baseCurrencyRate;
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
                    System.out.println("[INFO] Target currency = " + name.getName() + ", Rate = " + name.getRate());
                    targetCurrencyRate = name.getRate();
                    searchResult = true;
                }

            }
            if (!searchResult) {
                Main.printNotFound();

            }
            return targetCurrencyRate;
        }

        public double getBaseRate(List<Currency> list) {
            double baseCurrencyRate = 0;
            for (Currency id : list) {
                if (id.getId() == 1) {
                    System.out.println("[INFO] Base currency = " + id.getName() + ", Rate = " + id.getRate());
                    baseCurrencyRate = id.getRate();

                }
            }
            return baseCurrencyRate;
        }
    }
}
