package by.itacademy.task3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by daryatratseuskaya on 11/20/17
 */
public class Task1Test {
    @Test
    public void removeElement() throws Exception {
        int[] arrTest = {21, 21, 22, 43, 45, 47, 64, 64, 67, 67, 80};
        int[] arrExpected = {22, 64, 64, 80};

        int[] arrActual = Task1.findEvenElements(arrTest);
        assertTrue(isArrayEqualTo(arrExpected, arrActual));

    }

    private boolean isArrayEqualTo(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    @Test
    public void removeElement2() throws Exception {
        int[] arrTest = {1, 1, 4, 3, 5, 6, 8, 9, 0, 4};
        int[] arrExpected = {4, 6, 8, 0, 4};

        int[] arrActual = Task1.findEvenElements(arrTest);
        assertTrue(isArrayEqualToNew(arrExpected, arrActual));

    }

    private boolean isArrayEqualToNew(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    @Test
    public void removeElement3() throws Exception {
        int[] arrTest = {0, 1, 4, 3, 5, 6, 8, 9, 0, 4};
        int[] arrExpected = {0, 4, 6, 8, 0, 4};

        int[] arrActual = Task1.findEvenElements(arrTest);
        assertTrue(isArrayEqualToNew(arrExpected, arrActual));

    }


}

