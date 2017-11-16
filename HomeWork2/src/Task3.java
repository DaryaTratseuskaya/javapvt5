import java.util.Arrays;

/**
 * Created by daryatratseuskaya on 11/16/17
 */
public class Task3 {
    public static void main(String[] args) {
        /*Напишите программу, которая печатает массив, затем инвертирует
        (то есть меняет местами первый элемент с последним, второй — с предпоследним и т.д.), и вновь печатает.
*/

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));



        for (int i = 0, j = arr.length - 1; i < arr.length / 2 && j / 2 >= 0; i++, j--)
        {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }

        System.out.println(Arrays.toString(arr));

    }
}
