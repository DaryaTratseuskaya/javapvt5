package by.itacademy.task3;

import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/20/17
 */
public class Task2 {

    /*2. Представьте, что вам необходимо написать метод, определяющий количество страниц для вывода N новостей с учетом того,
     что на одной странице помещается 10 записей. В итоге у вас будет метод, который возвращает количество страниц, а на вход
      принимает количество новостей. Помните, что тут округлять нужно всегда к большему.
*/
    public static void main(String[] args) {

    int a = enterNumberOfNews();
    newsBrain(a);

    }

    public static int enterNumberOfNews(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of news: ");
        int numberOfNews = scanner.nextInt();

        return numberOfNews;

    }

    public static int newsBrain(double numberOfNews){

        int numberPerPage = 10;
        double numberOfPages1 = 0;

        numberOfPages1 =  numberOfNews / numberPerPage ;
        int numberOfPages = (int)Math.ceil(numberOfPages1);

        if (numberOfPages > 1) {
            System.out.println("It should be " + numberOfPages + " pages to print the news.");
        }
        else {
            System.out.println("It should be " + numberOfPages + " page to print the news.");
        }
        return numberOfPages;
    }

}
