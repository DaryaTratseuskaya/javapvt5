package by.itacademy.task5.Task2;

/**
 * Created by daryatratseuskaya on 11/28/17
 */
public class Manager {


   public boolean addCash(double sum){
        Denomination denomination = new Denomination(0, 0, 0);
        int hundreds;
        int fifties, twenties;
        boolean success;
        if ( sum <= 0 ) {
            success = false;
            System.out.println("Warn.Incorrect amount.");
        } else {
            hundreds = (int) sum / 100;
            sum = sum % 100;
            int nw = denomination.getHundreds() + hundreds;
            System.out.println("Current number of hundreds: " + nw);

            fifties = (int) sum / 50;
            sum = sum % 50;
            int nw2 = denomination.getFifties() + fifties;
            System.out.println("Current number of fifties: " + nw2);

            twenties = (int) sum / 20;
            sum = sum % 20;
            int nw3 = denomination.getTwenties() + twenties;
            System.out.println("Current number of twenties: " + nw3);

            success = true;
        }

        return success;
    }

    public static void takeCash(double amount){

        Denomination denomination = new Denomination(10, 10, 10);
        int hundreds;
        int fifties, twenties;
        hundreds = (int) amount / 100;
        amount = amount % 100;
        int nw = denomination.getHundreds() - hundreds;
        System.out.println("Quantity of 100: " + hundreds);
//        System.out.println("Current number of hundreds: " + nw );

        fifties = (int) amount / 50;
        amount = amount % 50;
        int nw2 = denomination.getFifties() - fifties;
        System.out.println("Quantity of 50: " + fifties);
//        System.out.println("Current number of fifties: " + nw2);

        twenties = (int) amount / 20;
        amount = amount % 20;
        int nw3 = denomination.getTwenties() - twenties;
        System.out.println("Quantity of 20: " + twenties);
//        System.out.println("Current number of twenties: " + nw3);


    }



}

