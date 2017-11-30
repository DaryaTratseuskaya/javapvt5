package by.itacademy.task6.Task1;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class Main {

    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter $Sum you are going to push: ");
        double orgAmount;
        orgAmount = input.nextDouble();

        Manager manager = new Manager();


        AddCashInterface addCashInterface = new Manager();
        addCashInterface.addCash(orgAmount);

        System.out.println();
        System.out.println("Enter $Amount you need to get: ");
        double takeMoney;

        takeMoney = input.nextDouble();

        TakeCashInterface takeCashInterface = new Manager();
        takeCashInterface.takeCash(takeMoney);
        System.out.println();

        CashAmountInterface cashAmountInterface = new Manager();
        cashAmountInterface.getCashAmount();
        printTotal(cashAmountInterface);

    }

    public static void printTotal(CashAmountInterface cashAmountInterface){
        System.out.println("Total cash amount in the ATM: " + cashAmountInterface );
    }

        BankName bankName = new ATMPriorBank();



}






