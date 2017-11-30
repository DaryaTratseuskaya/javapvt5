package by.itacademy.task6.Task2;

/**
 * Created by daryatratseuskaya on 11/29/17
 */
public class ArrayCopy {
    /*
    Сделать задание с массивами и System.arraycopy. Создать массив из 10 переменных любого типа данных.
    Создать другой массив с 20-ю переменными такого же типа данных, как и первый.
    Далее скопировать первый массив во второй в середину.

Пример:
[1,1,1,1,1,1,1,1,1,1]
Итоговый массив должен быть:
[0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0]

     */

    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2 = new int[20];

        for (int i = 0; i < array1.length; i ++){
            array1[i] = 1;
            System.out.print(array1[i]);
        }

        System.out.println();
        for (int i = 0; i < array2.length; i ++){
            array2[i] = 0;
            System.out.print(array2[i]);
        }

         System.arraycopy(array1, 0, array2, 5, array1.length);

        System.out.println();
        for (int i = 0; i < array2.length; i ++){
            System.out.print(array2[i]);
        }

    }


}
