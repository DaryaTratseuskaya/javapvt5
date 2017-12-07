package by.itacademy.task8.Task1;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/7/17
 */
public class Calculator {

/*
1. Делаем вот это задание:
Написать простой калькулятор в консоли, который будет уметь складывать, отнимать, умножать и делить числа, и выводить результат.
Числа вводить в консоли и проверять на корректность + проверять во время операций сложения, вычитания и тд.
Выбор оператора (+, -  и т. д.) можно спрашивать у пользователя в виде:
- введите 1, чтобы сложить 2 числа
- введите 2, чтобы умножить 2 числа
- и т. д.
Но возможно вы сможете придумать более крутое решение по вводу данных ) это только приветствуется.

 */

    public static void main(String[] args) {

    }


    public static  int sum(int a, int b){
        int sumN = 0;
        try {
            sumN = a + b;
            System.out.println("Result of sum is: " + a + " + " + b + " = " + sumN);
        }catch (RuntimeException e){
            System.out.println("RuntimeException " + e.toString());
        }
        return sumN;
    }

    public static long subtraction(long a, long b){
        long subN = 0;
        try{
            subN = Math.subtractExact(a,b);
            System.out.println("Result of subtraction is: " + a + " - " + b + " = " + subN);
        }catch (RuntimeException e){
            System.out.println("RuntimeException " + e.toString());
        }
        return subN;
        }

    public static int multiply(int a, int b){
        int mult = 0;
        try{
            mult = a * b;
            System.out.println("Result of multiply is: " + a + " * " + b + " = " + mult);
        }catch (RuntimeException e){
            System.out.println("RuntimeException " + e.toString());
        }
        return mult;
    }

    public static double divide(double a, double b){
        double div = 0;
        try{
            div = a / b;
            System.out.println("Result of divide is: " + a + " / " + b + " = " + div);
        }catch (RuntimeException e){
            System.out.println("RuntimeException " + e.toString());
        }
        return div;
    }




    }



