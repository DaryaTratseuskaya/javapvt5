package by.itacademy.task6.Task1;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class Main {

    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {


       ATMPriorBank atmPriorBank= new ATMPriorBank();
       atmPriorBank.screenMenu();
        int selector = 0;
       do {

            selector = input.nextInt();
           switch (selector) {
               case 1: {

                   System.out.println("Enter $Sum you are going to push: ");
                   double orgAmount;
                   orgAmount = input.nextDouble();
                   AddCashInterface addCash = new ATMPriorBank();
                   addCash.addCash(orgAmount);
                   System.out.println();
                   System.out.println ("Please, make your choiсe: ");
                   break;
               }
               case 2: {

                   System.out.println("Enter $Amount you need to get: ");
                   double takeMoney;
                   takeMoney = input.nextDouble();
                   TakeCashInterface takeCash = new ATMPriorBank();
                   takeCash.takeCash(takeMoney);
                   System.out.println();
                   System.out.println ("Please, make your choiсe: ");
                   break;
               }
               case 3: {

                   CashAmountInterface cashAmount = new ATMPriorBank();
                   cashAmount.getCashAmount();
                   printTotal(cashAmount);
                   System.out.println();
                   System.out.println ("Please, make your choiсe: ");
                   break;
               }
               case 4: {

                   ATMProducerInterface atmProducer = new ATMPriorBank();
                   atmProducer.getATMProducer();
                   printATMProducer(atmProducer);
                   System.out.println();
                   System.out.println ("Please, make your choiсe: ");
                   break;
               }
               case 5: {

                   BankNameInterface bankName= new ATMPriorBank();
                   bankName.getBankName();
                   printBankName(bankName);
                   System.out.println();
                   System.out.println ("Please, make your choiсe: ");
                   break;
               }
               default:{
                   System.out.println("Exit");
                   break;
               }

           }
       } while (selector != 0);


    }

    public static void printTotal(CashAmountInterface cashAmountInterface){
        System.out.println("Total cash amount in the ATM: " + cashAmountInterface );
    }

    public static void printATMProducer(ATMProducerInterface atmProducerInterface){
        System.out.println("ATM Producer: " + atmProducerInterface.getATMProducer());
    }

    public static void printBankName(BankNameInterface bankNameInterface){
        System.out.println("Bank Name: " + bankNameInterface.getBankName());
    }




}






