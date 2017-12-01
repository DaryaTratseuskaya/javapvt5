package by.itacademy.task6.Task1;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public class ATMPriorBank extends BaseATM implements AddCashInterface, TakeCashInterface,
        CashAmountInterface, BankNameInterface, ATMProducerInterface {



    public boolean screenMenu() {

        System.out.println(" Select action you want perform: ");
        System.out.println ("1 - Push money to the ATM");
        System.out.println ("2 - Take money from the ATM") ;
        System.out.println ("3 - Check total ATM amount") ;
        System.out.println ("4 - Print ATM Producer") ;
        System.out.println ("5 - Print Bank Name");
        System.out.println ("Please, make your choiсe: ");

        return true;
        }


 //    *  метод возвращает производителя банкомата

//    public String getATMProducer() {
//
//        super.setATMProducer("Belarus, Minsk, LLC Horizon, Kylman 26 - 709 ");
//        return super.getATMProducer();
//
//   }

 //     метод возвращает название банка

//    public String getBankName() {
//
//        setBankName("PriorBank");
//            return super.getBankName();
//    }
            public ATMPriorBank(){
                setBankName("Prior");
                setATMProducer("Belarus, Minsk, LLC Horizon, Kylman 26 - 709 ");
            }

    private int total;
    /**
     * @return метод рассчитывает количество купюр и номинал при добавлении денег в банкомат
     */
    public boolean addCash(double sum){
        DenominationData denomination = new DenominationData(0, 0, 0);
        int hundreds;
        int fifties, twenties;
        boolean success;
        if ( sum <= 0 ) {
            success = false;
            System.out.println("Warn.Incorrect amount.");
        } else {
            hundreds = (int) sum / 100;
            sum = sum % 100;
            int nw = denomination.getHundreds() + hundreds;
            System.out.println("Current number of hundreds: " + nw);

            fifties = (int) sum / 50;
            sum = sum % 50;
            int nw2 = denomination.getFifties() + fifties;
            System.out.println("Current number of fifties: " + nw2);

            twenties = (int) sum / 20;
            sum = sum % 20;
            int nw3 = denomination.getTwenties() + twenties;
            System.out.println("Current number of twenties: " + nw3);

            success = true;
        }

        return success;
    }
    /**
     * @return метод рассчитывает количество купюр и номинал, которым необходимо выдать деньги из банкомата
     */
    public int takeCash(double amount){

        DenominationData denomination = new DenominationData(10, 10, 10);
        int hundreds;
        int fifties, twenties;
        hundreds = (int) amount / 100;
        amount = amount % 100;
        int nw = denomination.getHundreds() - hundreds;
        System.out.println("Quantity of 100: " + hundreds);
//        System.out.println("Current number of hundreds: " + nw );

        fifties = (int) amount / 50;
        amount = amount % 50;
        nw = denomination.getFifties() - fifties;
        System.out.println("Quantity of 50: " + fifties);
//        System.out.println("Current number of fifties: " + nw2);

        twenties = (int) amount / 20;
        amount = amount % 20;
        nw = denomination.getTwenties() - twenties;
        System.out.println("Quantity of 20: " + twenties);
//        System.out.println("Current number of twenties: " + nw3);

        return nw;


    }
    /**
     * @return метод рассчитывает общее количество денег в банкомате
     */
    public boolean getCashAmount() {

        DenominationData denomination = new DenominationData(10, 10, 10);
        int hundreds = denomination.getHundreds() * 100;
        int fifties = denomination.getFifties() * 50;
        int twenties = denomination.getTwenties() * 20;

        total = hundreds + fifties + twenties;
        return true;

    }
    public String toString(){
        return new String ("total " + this.total);
    }


}
