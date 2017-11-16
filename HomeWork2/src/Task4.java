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

        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.println("Enter your number: ");
        num = scanner.nextInt();

        int num1 = num % 10;
        int num2 = num /10 % 10;
        int num3 = num /100 % 10;


        if (num1 > num2 && num2 > num3){
            System.out.println("true");
        } else
            System.out.println("false");

        scanner.close();

    }
}
