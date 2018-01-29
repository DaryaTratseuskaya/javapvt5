package by.itacademy.task.Task1.domain.methods;


import java.util.InputMismatchException;
import by.itacademy.task.Task1.domain.entity.Currency;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 1/29/18
 */
public class SearchRates extends Search{
    @Override
    public void searchSmth(List<Currency> list) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency code for searching ");
            String currencyCode = input.next();
            for (Currency code : list){
                if (code.getName()==currencyCode){
                    System.out.println("Currency Code " + code.getCode() + " - Currency name: " + code.getName() );
                }
            }



    }


}
