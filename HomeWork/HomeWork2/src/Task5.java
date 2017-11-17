import java.util.Arrays;

/**
 * Created by daryatratseuskaya on 11/16/17
 */
public class Task5 {
    public static void main(String[] args) {
//        Создайте массив типа int. Отсортируйте массив любым способом (по убыванию либо по возрастанию). Результат вывести на экран.

        int arr[] = {1, 2, 3, 4, 2, 1, 2, 3, 1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr[i];
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
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
