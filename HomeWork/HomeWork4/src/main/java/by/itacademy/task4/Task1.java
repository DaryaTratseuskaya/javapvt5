package by.itacademy.task4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by daryatratseuskaya on 11/21/17
 */
public class Task1 {

    final static char dm = (char) 34;

    public static void main(String[] args) {

        Patient[] patientsArray = new Patient[3];
        patientsArray [0] = new Patient();
        patientsArray [1] = new Patient();
        patientsArray [2] = new Patient();


        enterPatientData(patientsArray);
        printPatients(patientsArray);
        searchPatient(patientsArray);


    }

    public static void enterPatientData(Patient[] arr){

        Scanner input = new Scanner(System.in);


          for (int i = 0; i < arr.length; i++){

              if (i > 0 && i < 2) {
                  System.out.println("Введите данные второго пациента: ");
              }  else if (i > 1) {
                  System.out.println("Введите данные третьего пациента: ");
              } else
                  System.out.println("Введите данные первого пациента: ");


        System.out.println("Имя пациента: ");
        arr[i].setFirstName(input.next());

        System.out.println("Фамилия пациента: ");
        arr[i].setLastName(input.next());

        System.out.println("Возраст пациента: ");
        arr[i].setAge(input.nextInt());

        System.out.println("Диагноз пациента: ");
        arr[i].setDiagnosis(input.next());

        System.out.println("Введите  - 1, если пациент резидент, введите - 0, если пациент не резидент: ");
             arr[i].setOnFile(false);
              if (input.nextInt() == 1)
                  arr[i].setOnFile(true);

          }

    }

    public static void printPatients(Patient[] arr){

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Пациент " + dm + arr[i].getFirstName() + " " + arr[i].getLastName() + dm + "  -  Возраст = " + dm + arr[i].getAge() + dm);
                System.out.println();
            }
    }

    public static void searchPatient(Patient[] arr){

        Scanner input = new Scanner(System.in);
        int inputValue = 0;


        System.out.println("Нажмите 1 для поиска по имени, нажмите 2 для поиска по возрасту:");
        inputValue = input.nextInt();

        if (inputValue == 1) {
            System.out.println("Введите имя: ");
            String name = input.next();
            for (int i = 0; i < arr.length; i++){
                if (arr[i].getFirstName().equals(name)){
                    System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName() + " , " + arr[i].getAge()+ " - " + arr[i].getDiagnosis());
                }
            }
        }else {
            System.out.println("Введите возраст: ");
            int ageSearch = input.nextInt();
            for (int i = 0; i < arr.length; i++){
                if (arr[i].getAge() == ageSearch){
                    System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName()+ " , " + arr[i].getAge()+ " - " + arr[i].getDiagnosis());

                }
            }
        }



    }
}
