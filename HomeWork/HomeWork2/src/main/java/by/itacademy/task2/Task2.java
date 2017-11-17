package by.itacademy.task2;

import java.util.Arrays;

/**
 * Created by daryatratseuskaya on 11/15/17
 */
public class Task2 {
    public static void main(String[] args) {
        /*Создайте массив с 10-ю переменными типа float. Далее найдите дубликаты и выведите их количество.
Пример: есть массив {2, 3, 5, 7, 6, 5, 7, 3, 7, 20} - в данном массиве цифра 3 и 7 повторяются.
В результате выполнения программы на экран должно вывести:
[3] - повторений 2
[7] - повторений 3
*/

        float arr[] = {1, 2, 3, 4, 2, 1, 2, 3, 1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            double min = arr[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < arr.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                float tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));


        int counter = 0;
        float elementNumber = 0;


        for (int j = 1; j < arr.length; j++) {
            if (arr[j-1] == arr[j]) {
                if (counter == 0) {
                    elementNumber = arr[j];
                }
                counter += 1;
                if (j == arr.length - 1) {
                    System.out.println("[" + elementNumber + "]" + " - повторений " + (counter + 1));
                }
            }
            else {
                if (counter > 0) {
                    System.out.println("[" + elementNumber + "]" + " - повторений " + (counter + 1));
                    counter = 0;
                }
            }
        }
    }
}

