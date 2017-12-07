package by.itacademy.task8.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/7/17
 */
public class TakeInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            try {
                System.out.print("Enter an integer: ");
                int num = s.nextInt();
                System.out.println("You entered " + num);
                success = true;
            } catch (InputMismatchException e) {
                s.next();
                System.out.println("You have entered invalid data");
            }
        }
    }
}
