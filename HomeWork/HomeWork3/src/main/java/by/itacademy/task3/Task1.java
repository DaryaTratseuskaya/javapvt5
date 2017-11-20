package by.itacademy.task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

/**
 * Created by daryatratseuskaya on 11/14/17
 */
public class Task1 {
    public static void main(String[] args) {

        //by.itacademy.task3.Task1
/*       1. Создайте массив с 10-ю переменными типа int.
Значения необходимо вводить с клавиатуры в отдельном методе.
Затем выведите все значения на экран также в отдельном методе в виде:
"значение" | "значение 2" | "значение 3" |  и тд. -
Далее отсортируйте массив по возрастанию способами из статьи или любыми другими алгоритмами.
Результат вывести на экран:
"значение" | "значение 2" | "значение 3" |  и тд.
Далее найдите в массиве все четные числа и выведите их на экран:
"значение" | "значение 2" | "значение 3" |  и тд.

В итоге у вас должна получиться программа как минимум с 3 методами:
1- для ввода данных с клавиатуры
2 - для сортировки
3 - для вывода

Вывод значений массива на экран должен быть сделан в отдельном методе,
этот метод будет использоваться для вывода значений массива до сортировки и после сортировки.

Сортировку нужно сделать 3-мя различными способами (на ваш выбор). На следующем занятии необходимо уметь пояснить, как работает тот или иной тип сортировки, плюсы и минусы каждой из них.

*/

        int[] arr = new int[10];
        int[] n = new int[arr.length];

        String noteForBubble = " - Bubble sort";
        String noteForOriginalArr = " - Generated array";
        String noteForEven = " - Even values";
        String noteForQuickSort = " - QuickSort java.util";
        String noteForSelectionSort = " - Selection Sort";

        generateArray(arr);
        printArray(arr, noteForOriginalArr);

        sortArrayBubble(arr);
        printArray(arr, noteForBubble);

        n = findEvenElements(arr);
        printArray(n, noteForEven);

        sortArrayQuickSort(arr);
        printArray(arr, noteForQuickSort);

        selectionSort(arr);
        printArray(arr,noteForSelectionSort);


    }

    public static void generateArray(int[] anArray) {

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < anArray.length; i++) {

            System.out.println("Enter element # " + (i + 1) + ":");
            anArray[i] = input.nextInt();

        }
    }
    /**
     * Method to print array
     * @param anArray - array that is coming to method on entry
     * @param note - text note for the method of sort, printed values, etc.
     */
    public static void printArray(int[] anArray, String note) {

        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(" | ");
            }
            System.out.print(anArray[i]);
        }
        System.out.println(note);
        System.out.println();

    }

    public static void sortArrayBubble(int[] anArray) {

        for (int i = anArray.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (anArray[j] > anArray[j + 1]) {
                    int tmp = anArray[j];
                    anArray[j] = anArray[j + 1];
                    anArray[j + 1] = tmp;
                }
            }
        }
    }

    public static int[] findEvenElements(int[] anArray) {

//        for (int i = 0; i < anArray.length; i++) {
//            for (int j = 0; j < anArray.length; j++) {
//                if (anArray[i] % 2 != 0) {
//                 //   System.out.println("i = " + i);
//                    anArray = removeElement(anArray, i);
//
//                }
//            }
        int i = 0;
        do {
            if (anArray[i] % 2 != 0) {
                anArray = removeElement(anArray, i);
            } else {
                i += 1;
            }
        }   while (i < anArray.length) ;
            return anArray;
    }


    public static int[] removeElement(int[] original, int element) {
        int[] n = new int[original.length - 1];
        System.arraycopy(original, 0, n, 0, element);
        System.arraycopy(original, element + 1, n, element, original.length - element - 1);
        return n;
    }

    public static void sortArrayQuickSort(int[] anArray) {
        Arrays.sort(anArray);
    }

    public static void selectionSort(int[] anArray){
        for (int i = 0; i < anArray.length; i++) {
            int min = anArray[i];
            int min_i = i;

            for (int j = i+1; j < anArray.length; j++) {

                if (anArray[j] < min) {
                    min = anArray[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = anArray[i];
                anArray[i] = anArray[min_i];
                anArray[min_i] = tmp;
            }
        }
    }
}













