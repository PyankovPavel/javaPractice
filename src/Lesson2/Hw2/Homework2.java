package Lesson2.Hw2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Реализовать алгоритм сортировки массива слиянием
 */

public class Homework2 {
    public static void main(String[] args) {
        int[] arr1 = createArr(-10, 10, 10);
        int[] arr2 = createArr(-10, 10, 10);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));

    }

    /**
     * Создаем массив из рандомных чисел
     * @param from начало границы рандома
     * @param to конец границы рандома
     * @param size размер массива
     * @return созданный массив int[] arr
     */
    public static int[] createArr(int from, int to, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int rand = ThreadLocalRandom.current().nextInt(from, to + 1);
            arr[i] = rand;
        }
        return arr;
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] b = new int[a1.length + a2.length];
        int positionA1 = 0;
        int positionA2 = 0;

        for (int i = 0; i < b.length; i++) {
            if (positionA1 == a1.length) {
                b[i] = a2[positionA2];
                positionA2++;
            } else if (positionA2 == a2.length) {
                b[i] = a1[positionA1];
                positionA1++;
            } else if (a1[positionA1] < a2[positionA2]) {
                b[i] = a1[positionA1];
                positionA1++;
            } else {
                b[i] = a2[positionA2];
                positionA2++;
            }
        }
        return b;
    }
}
