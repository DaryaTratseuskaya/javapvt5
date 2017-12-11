package by.itacademy.task9.Task1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 12/11/17
 * <p>
 * 1) Модифицируем или делаем, кто не делал задание с занятия. Создать массив с данными типа String,
 * с использованием наиболее подходящей коллекции.
 * Заполнить его данными. Данные должны вводиться с консоли,
 * массив может быть любой длины. Ввод прекратить по вводу спец.
 * команды (придумать любой символ при вводе которого прекращаем заполнение массива).
 * Далее читаем данные массива в цикле и удаляем из строки все буквы "а".
 * Затем выводим получившийся массив.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studentList = enterData();
        printData(studentList);

    }

    public static ArrayList enterData() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList();
        int selector = 0;
        do {
            System.out.println("Enter 1 for data entry else enter 0: ");
            selector = scanner.nextInt();


            System.out.println("Enter name: ");
            String name = scanner.next();


            System.out.println("Enter age: ");
            int age = scanner.nextInt();

            Student student = new Student(name, age);
            studentList.add(student);

        } while (selector != 0);

        return studentList;
    }

    public static void printData(ArrayList<Student> student) {

        for (Student student1 : student) {
            System.out.println("name = " + student1.getName());
        }
    }
}