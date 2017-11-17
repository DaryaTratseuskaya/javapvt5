package by.itacademy.task2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by daryatratseuskaya on 11/14/17
 */
public class Task1 {
    public static void main(String[] args) {

        //by.itacademy.task2.Task1
/*        1. Создайте массив с 10-ю переменными типа int. Используя оператор "for" найдите и выведите на экран наименьшее и наибольшее значение в массиве.
        min value =  "значение которое у вас получилось".
        max value =  "значение которое у вас получилось".
        Далее замените наименьшее значение на 0, а наибольшее значение на 99 и выведите получившийся массив на экран в виде: [23, 0, 34, 99, 43534].

*/
        int array [] = new int [10];
        array[0] = 7;
        array[1] = 8;
        array[2] = 9;
        array[3] = 4;
        array[4] = 11;
        array[5] = 12;
        array[6] = 13;
        array[7] = 21;
        array[8] = 15;
        array[9] = 16;


        int min = array[0];
        int imin = 0;

        for (int i = 0; i < array.length; i ++) {
            if ( min > array[i] ) {
                    min = array[i];
                    imin = i;
            }
        }
        array[imin] = 0;

        System.out.println("min value = " + min);


        int max = array[0];
        int jmax = 0;
        for (int j =0;  j < array.length ; j ++){
            if ( max < array[j]) {
                    max = array[j];
                    jmax = j;
            }
        }
        array[jmax] = 99;

        System.out.println("max value = " + max);


          System.out.println(Arrays.toString(array));



    }
}










