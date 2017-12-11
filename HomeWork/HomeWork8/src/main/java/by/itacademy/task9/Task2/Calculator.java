package by.itacademy.task9.Task2;

/**
 * Created by daryatratseuskaya on 12/7/17
 */
public class Calculator {

    public static void main(String[] args) {

    }


    public static  int sum(int a, int b) throws InputException{
        if ((a > 9) && (b > 9)){
            throw  new InputException();
        }
         int   sumN = a + b;
            System.out.println("Result of sum is: " + a + " + " + b + " = " + sumN);
        return sumN;
    }

    public static long subtraction (long a, long b) {
        long subN = Math.subtractExact(a,b);
            System.out.println("Result of subtraction is: " + a + " - " + b + " = " + subN);
        return subN;
        }

    public static int multiply(int a, int b){
          int mult = a * b;
            System.out.println("Result of multiply is: " + a + " * " + b + " = " + mult);
        return mult;
    }

    public static double divide(double a, double b) throws ZeroException{
        if (b == 0){
            throw new ZeroException();
        }
        double div = a / b;
            System.out.println("Result of divide is: " + a + " / " + b + " = " + div);
        return div;
    }





}



