package by.itacademy.task8.Task3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/7/17
 */
/*

3. Так как задания простые дополнительно предлагаю изучить достаточно простую тему по записи и чтению файлов в Java:
http://devcolibri.com/1141
http://metanit.com/java/tutorial/6.8.php
Попробуйте создать файл .txt с какими-нибудь записями, потом прочитать его в программе и вывести данные в консоль.
+ попробуйте создать свой файл и записать туда информацию, введенную с консоли.
Мы еще будем рассматривать эту тему в рамках чтения xml и json, так что все вопросы разберем.

 */
public class File {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FileIn.txt", false))
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter text: ");
            // запись всей строки
            String text = input.next();
            writer.write(text);
            // запись по символам
//            writer.append('\n');
//            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FileIn.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

