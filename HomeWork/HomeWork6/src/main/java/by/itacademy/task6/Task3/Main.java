package by.itacademy.task6.Task3;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Shape shape = null;
        int selection = 0;

        System.out.println("Enter 1 - for Circle, 2 - for Rectangle, 3 - for Square, 4 - for Triangle. Please, make your choice: ");

 //       for ( selection = input.nextInt() ; input.hasNext();input.nextInt() ) {

        selection = input.nextInt();

        switch(selection){
            case 1:{
                shape = new Circle(2);
                break;
            }
            case 2:{
                shape = new Rectangle(2,3);
                break;
            }
            case 3:{
                shape = new Square(5);
                break;
            }
            case 4: {
                shape = new Triangle(3,3);
                break;
            }
            default:{
                System.out.println("Incorrect input");
                break;
            }

        }
        printShape(shape);

        }


    private static void printShape(Shape shape){

        System.out.println("Square of circle is : " + Math.round(shape.getSqr()));

    }
}

