package by.itacademy.task8.Task4;

import java.io.*;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/8/17
 */
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();

        File f = new File("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FileOut.txt");
        if(f.exists() && !f.isDirectory()) {
            System.out.println( f.getName() + " file exists.");
        }


//        generateData(students);

    }

    public static void readFromFile() throws IOException {


        Scanner reader = new Scanner("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FileOut.txt");
        String text;
        Student[] students;
        while ((reader.hasNext())){
            text = reader.nextLine();

            System.out.println();
        }



    }

// запись в файл с консоли с сохранением
    public static void generateData(Student[] arr) {

        Scanner input = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FileOut.txt", true);


        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && i < 2) {
                System.out.println("Введите данные второго пациента. ");
            } else if (i > 1) {
                System.out.println("Введите данные третьего пациента. ");
            } else
                System.out.println("Введите данные первого пациента. ");


            System.out.println("Имя пациента: ");
            arr[i].setFirstName(input.next());
            writer.write(arr[i].getFirstName() + ",");

            System.out.println("Отчество пациента: ");
            arr[i].setSecondName(input.next());
            writer.write(arr[i].getSecondName() + ",");

            System.out.println("Фамилия пациента: ");
            arr[i].setLastName(input.next());
            writer.write(arr[i].getLastName() + ",");

            System.out.println("Возраст пациента: ");
            while (!input.hasNextInt()) {
                System.out.println("Проверьте правильность ввода и введите целое число: ");
                input.next();
            }
            arr[i].setAge(input.nextInt());
            writer.write(arr[i].getAge() + ",");

            System.out.println("Диагноз пациента: ");
            arr[i].setDiagnosis(input.next());
            writer.write(arr[i].getDiagnosis() + ",");

            System.out.println("Введите  - 1, если пациент резидент, введите - 0, если пациент не резидент: ");
            arr[i].setOnFile(false);
            if (input.nextInt() == 1)
                arr[i].setOnFile(true);
            writer.write(String.valueOf(arr[i].isOnFile()) + "\n");


            writer.flush();

        }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



}
