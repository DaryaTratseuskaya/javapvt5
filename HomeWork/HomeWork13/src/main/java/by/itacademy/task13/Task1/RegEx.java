package by.itacademy.task13.Task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by daryatratseuskaya on 1/9/18
 * 1. Задание по регуляркам:
 С помощью регулярных выражений осуществить сжатие английского текста,
 заменив каждую группу из двух или более рядом стоящих символов,
 на один символ, за которым следует количество его вхождений в группу.
 К примеру, строка hellowoooorld должна сжиматься в hel2owo4rld. Задание не простое :).
 */
public class RegEx {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String text = input.next();

        String result = zip(text);
        System.out.println(result);


    }
    public static String zip(String text){

        String result = "";
        Pattern pattern = Pattern.compile("(.)\\1{0,}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            result += matcher.group(1);
            int length = matcher.group().length();
            if (length > 1)
                result += length;
        }
        return result;
    }




    }

