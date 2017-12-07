package by.itacademy.task4.Task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.*;

/**
 * Created by daryatratseuskaya on 12/4/17
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Student[] student = new Student[2];
        student [0] = new Student();
        student [1] = new Student();

        generateStudent(student);
        printStudent(student);
        averageAge(student);
    }

    public static final Scanner input = new Scanner(System.in);
    public static final String DATE_PATTERN = "dd-MM-yyyy";

    public static void generateStudent(Student[] arr) throws Exception {

        for (int i = 0; i < arr.length; i ++) {
            System.out.println("Enter student's data ");

            System.out.println("Enter student's name: ");
            arr[i].setName(input.next());

            System.out.println("Enter student's surname: ");
            arr[i].setSurname(input.next());

            System.out.println("Enter student's Date of Birth: ");
            arr[i].setDob(readDate());

        }
        }
        public static Date readDate(){
            DateFormat df = new SimpleDateFormat(DATE_PATTERN);
            String inputDate = null;
            Date date = null;


            do {
                try {
                    System.out.println("Enter date [" + DATE_PATTERN + "] ");
                    inputDate = input.next();
                    date = df.parse(inputDate);
                } catch (ParseException e) {
                    System.out.println(" Incorrect date format: " + inputDate);
                }
            } while (date == null);

        return date;
        }

        public static void printStudent(Student[] arr){
            for (int i = 0; i < arr.length; i ++){
                System.out.println(arr[i].getName() + " " + arr[i].getSurname() + " " +  arr[i].getDob());
            }
        }

        public static LocalDate toLocalDate(Date date) {
            ZoneId defaultZoneId = ZoneId.systemDefault();

            Instant instant = date.toInstant();
            LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();

            return localDate;
    }
        public static long calculateAge(LocalDate birthDate, LocalDate currentDate){
            if ((birthDate != null) && (currentDate != null)) {
                return Period.between(birthDate, currentDate).toTotalMonths();
            } else {
                return 0;
            }
        }

        public static void averageAge(Student[] arr) {
            Date date = new Date();
            int totalMonths = 0;
            int aveMonths = 0;
            int years = 0;
            int months = 0;


            for (int j = 0; j < arr.length; j++) {
                Date initialDate = arr[j].getDob();

                totalMonths += calculateAge(toLocalDate(initialDate), toLocalDate(date)); // общее количество месяцев


                aveMonths = totalMonths / arr.length; // среднее количество месяцев
                years = aveMonths / 12; // среднее количество лет
                months = aveMonths % 12;


            }
            System.out.println("Average age is " + years + " Years " + months + " Months" );

        }

}
