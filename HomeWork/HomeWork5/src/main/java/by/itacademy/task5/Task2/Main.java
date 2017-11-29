package by.itacademy.task5.Task2;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class Main {

    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter $sum: ");
        double orgAmount;
        orgAmount = input.nextDouble();


        Manager manager = new Manager();
        manager.addCash(orgAmount);
    }


/*
Методы снятия денег:
При снятии денег функция должна распечатывать, каким количеством купюр, какого номинала выдается сумма.
 */

//    public static int takeCash(double sum){
//
//        Denomination denomination = new Denomination(10, 10, 10);
//
//
//        return 1;
//    }

}






