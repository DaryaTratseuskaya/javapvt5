package by.itacademy.task5.Task2;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class Main {

    public static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        Denomination denomination = new Denomination(0, 0, 0);

        System.out.println("Enter $sum: ");
        double orgAmount;
        orgAmount = input.nextDouble();

        int hundreds;
        int fifties, twenties;
        hundreds = (int) orgAmount / 100;
        orgAmount = orgAmount % 100;
        int nw = denomination.getHundreds() + hundreds;
        System.out.println("Current number of hundreds: " + nw);


        fifties = (int) orgAmount / 50;
        orgAmount = orgAmount % 50;
        int nw2 = denomination.getFifties() + fifties;
        System.out.println("Current number of fifties: " + nw2);


        twenties = (int) orgAmount / 20;
        orgAmount = orgAmount % 20;
        int nw3 = denomination.getTwenties() + twenties;
        System.out.println("Current number of twenties: " + nw3);

    }

}






