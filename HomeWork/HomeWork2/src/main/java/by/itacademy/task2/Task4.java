package by.itacademy.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/16/17
 */
public class Task4 {
    public static void main(String[] args) {
//        Написать программу, определяющую, образуют ли цифры некоторого числа
// строго возрастающую последовательность. Например: 123 – образуют, 212 – не образуют.



       Scanner input = new Scanner(System.in);
                String num = input.next();

                checkIncrease(num);
                System.out.println("Number " + num + " contains only increasing digits ? - " + checkIncrease(num));



    }
    public static boolean checkIncrease(String num){

        if (num != null && num.length()>0){
            if (num.length() == 1){
                return true;
            }
        }
        for (int i = 0; i < num.length() - 2; i ++){
            if (num.charAt(i) >= num.charAt(i+1)){
                return false;
            }
        }
        return true;
    }


}

