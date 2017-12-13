package by.itacademy.task9.Task1.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/13/17
 */
public class StringArrayModification {
    public static void main(String[] args) {

        List<String> lines = readLines();

        System.out.println("Lines before modification");
        printLines(lines);

        modifyLines(lines);
        System.out.println("Lines after modification");
        printLines(lines);

    }

    private static List<String>readLines(){
        List<String> lines = new ArrayList<>();
        int code = 0;
        do{
            code = readInt("1 for data entry, 0 for exit: ");
            if (code != 0){
                String line = readString("Enter next line: ");
                lines.add(line);

            }
        }while (code != 0);

        return lines;
    }

    private static int readInt(String message){
        Integer result = null;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print(message);
            String input = scanner.next();

            try {
                result = Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Please give me a number");
            }

        }while (result == null);


        return result;
    }

    private static String readString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String result = scanner.nextLine();
        return result;
    }

    private static void printLines(List<String> lines){
        if (lines != null){
            for (int i = 0; i < lines.size(); i++) {
                System.out.println("Line #: " + i + " = " + lines.get(i));
            }
        }else System.out.println("<null>");
    }

    private static String doLinesModification(String sourceLine){
        if (sourceLine != null){
            return sourceLine.replaceAll("a","");
        }
        return null;
    }

    private static void modifyLines(List<String> lines){
        for (int i = 0; i < lines.size(); i++){
            String modifiedLine = doLinesModification(lines.get(i));
            lines.set(i,modifiedLine);
        }
    }
}

