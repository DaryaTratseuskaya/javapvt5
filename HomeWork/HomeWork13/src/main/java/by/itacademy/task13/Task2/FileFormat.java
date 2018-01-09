package by.itacademy.task13.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by daryatratseuskaya on 1/9/18
 * С помощью регулярных выражений написать функцию, которая будет выводить формат файла:
 * например ввел kjhkj.xml  - в итоге нам выведет формат xml.
 * Это задание можно будет использовать в итоговом проекте.

 */
public class FileFormat {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");

        String text = input.next();

        String result = fileFormat(text);
        System.out.println(result);
    }

    public static String fileFormat(String text){
        String result ="";


        Pattern pattern = Pattern.compile(".+\\.(\\w+)$");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            result = matcher.group(1);

        }

        return result;
    }
}
