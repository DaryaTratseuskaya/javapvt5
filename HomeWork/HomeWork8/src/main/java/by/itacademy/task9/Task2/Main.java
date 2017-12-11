package by.itacademy.task9.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/7/17
 */
public class Main {
   public final static Scanner input = new Scanner(System.in);



    public static void main(String[] args) throws UnexpectedUserInput {

        ZeroException zeroException = new ZeroException();
        zeroException.setErrorCode(9000);
        InputException inputException = new InputException();
        inputException.setErrorText("AAAAAAAAAAAAAAAAAAAA");

        screenMenu();
        int selector = 0;

        do{
            selector = input.nextInt();

            boolean success = false;
                switch (selector) {
                    case (1): {
                        while (!success) {
                            try {
                                System.out.println("Enter arguments for summing. Numbers should be from 1 to 9 : ");
                                Calculator.sum(input.nextInt(), input.nextInt());
                                success = true;
                            } catch (InputException e) {
                                System.out.println("Numbers should be from 1 to 9: " + inputException.getErrorText() + " " + e.toString());
                            }
                            catch (InputMismatchException e) {
                                input.next();
                                System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                            }
                        }
                        System.out.println("Please, make your choice: ");
                        break;
                    }
                    case (2): {
                        while (!success) {
                            try {
                                System.out.println("Enter arguments for subtraction: ");
                                Calculator.subtraction(input.nextLong(), input.nextLong());
                                success = true;
                            } catch (Exception e) {
                                input.next();
                                System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                            }
                        }
                        System.out.println("Please, make your choice: ");
                        break;
                    }
                    case (3):{
                        while (!success) {
                            try {
                                System.out.println("Enter arguments for multiply: ");
                                Calculator.multiply(input.nextInt(), input.nextInt());
                                success = true;
                            } catch (Exception e) {
                                input.next();
                                System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                            }
                        }
                        System.out.println("Please, make your choice: ");
                        break;
                    }
                    case (4):{
                        while (!success) {
                            try {
                                System.out.println("Enter arguments for divide: ");
                                Calculator.divide(input.nextDouble(), input.nextDouble());
                                success = true;
                            } catch (ZeroException e){
                                System.out.println("Forbidden to divide on zero. Error code " + zeroException.getErrorCode()+ " " + e.toString());
                            }
                            catch (Exception e){
                                input.next();
                                System.out.println("Invalid entry: " + e.toString() + " Enter Integer");
                            }
                        }
                        System.out.println("Please, make your choice: ");
                        break;
                    }

                }
        }while (selector != 0);

    }

    public static boolean screenMenu() throws UnexpectedUserInput{

        System.out.println("Select action you want perform: ");
        System.out.println ("1 - Sum");
        System.out.println ("2 - Subtract") ;
        System.out.println ("3 - Multiply") ;
        System.out.println ("4 - Divide") ;
        System.out.println ("Please, make your choice: ");

        return true;
    }

}
