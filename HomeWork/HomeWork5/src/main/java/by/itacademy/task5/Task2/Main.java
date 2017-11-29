package by.itacademy.task5.Task2;

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
        manager.addCash(orgAmount);

        System.out.println();
        System.out.println("Enter $Amount you need to get: ");
        double takeMoney;

        takeMoney = input.nextDouble();
        manager.takeCash(takeMoney);

    }


/*
Методы снятия денег:
При снятии денег функция должна распечатывать, каким количеством купюр, какого номинала выдается сумма.
 */



}






