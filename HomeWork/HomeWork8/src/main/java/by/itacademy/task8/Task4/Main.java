package by.itacademy.task8.Task4;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/8/17
 */
public class Main {
    final static char dm = (char) 34;

    public static void main(String[] args) throws IOException {

        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();

        File f = new File("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FileOut.txt");
        if (f.exists() && !f.isDirectory()) {
            System.out.println(f.getName() + " file exists.");
        } else {
            System.out.println(f.getName() + "file does not exist");
            generateData(students);
        }

        String[] data = readFromFile();
        Student[] students1 = dataToStudents(data);
        searchStudent(students1);

    }


    public static String[] readFromFile() throws IOException {
        String[] data = new String[2];
        try{
            File file = new File("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FileOut.txt");
            Scanner inFile = new Scanner(file);
            for(int i=0; i<data.length; i++){
                data[i] = (inFile.next());
            }
            inFile.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Cannot find file.");
        }
        return data;

    }

    public static Student[] dataToStudents(String[] data) throws IOException{

        Student[] students = new Student[data.length];

        for (int i = 0 ; i < data.length; i++) {
            students[i] = stringToStudent(data[i]);
        }

        return students;
    }

    public static Student stringToStudent(String record) {

        String[] fields = record.split(",");
        Student student = new Student();
        student.setFirstName(fields[0]);
        student.setLastName(fields[1]);
        student.setSecondName(fields[2]);
        student.setAge(Integer.parseInt(fields[3]));
        student.setFaculty(fields[4]);
        student.setOnFile(Boolean.parseBoolean(fields[5]));
        return student;
    }


// запись в файл с консоли с сохранением
    public static void generateData(Student[] arr) {

        Scanner input = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FileOut.txt", true);


        for (int i = 0; i < arr.length; i++) {

            if (i > 0 && i < 2) {
                System.out.println("Введите данные второго студента. ");
            } else if (i > 1) {
                System.out.println("Введите данные третьего студента. ");
            } else
                System.out.println("Введите данные первого студента. ");


            System.out.println("Имя студента: ");
            arr[i].setFirstName(input.next());
            writer.write(arr[i].getFirstName() + ",");

            System.out.println("Отчество студента: ");
            arr[i].setSecondName(input.next());
            writer.write(arr[i].getSecondName() + ",");

            System.out.println("Фамилия студента: ");
            arr[i].setLastName(input.next());
            writer.write(arr[i].getLastName() + ",");

            System.out.println("Возраст студента: ");
            while (!input.hasNextInt()) {
                System.out.println("Проверьте правильность ввода и введите целое число: ");
                input.next();
            }
            arr[i].setAge(input.nextInt());
            writer.write(arr[i].getAge() + ",");

            System.out.println("Факультет: ");
            arr[i].setFaculty(input.next());
            writer.write(arr[i].getFaculty() + ",");

            System.out.println("Введите  - 1, если студент очник, введите - 0, если студент заочник: ");
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

    public static void printStudents(Student[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Студент " + dm + arr[i].getFirstName() + " " + arr[i].getSecondName() + " " + arr[i].getLastName() + dm + "  -  Возраст = " + dm + arr[i].getAge() + dm);
            System.out.println();
        }
    }

    public static void searchStudent(Student[] arr) {

        Scanner input = new Scanner(System.in);
        int inputValue = 0;

        boolean found = false;
        do{
            System.out.println("Нажмите 1 для поиска по имени, нажмите 2 для поиска по возрасту:");
            inputValue = input.nextInt();
            boolean matchFound = false;
            if (inputValue == 1) {
                System.out.println("Введите имя: ");
                String name = input.next();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].getFirstName().equals(name)) {
                        String output = arr[i].getFirstName() + " " + arr[i].getSecondName() + " " + arr[i].getLastName() + " , " + arr[i].getAge() + " - " + arr[i].getFaculty();
                        printSearchResults(output);
                        matchFound = true;
                        found = true;
                    }
                }
                if (!matchFound) {
                    System.out.println("Студента с таким именем не найдено");
                }
            } else {
                System.out.println("Введите возраст: ");
                int ageSearch = input.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].getAge() == ageSearch) {
                        String output = arr[i].getFirstName() + " " + arr[i].getSecondName() + " " + arr[i].getLastName() + " , " + arr[i].getAge() + " - " + arr[i].getFaculty();
                        printSearchResults(output);
                        matchFound = true;
                        found = true;
                    }
                }
                if (!matchFound) {
                    System.out.println("Студента такого возраста не найдено");
                }
            }
        } while(!found);

    }
    public static void printSearchResults(String string) {
        System.out.println(string);
    }
}



