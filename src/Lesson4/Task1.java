package Lesson4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = createArr(0, 5, 10);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        countElements(arr);
    }

    public static int[] createArr(int from, int to, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int rand = ThreadLocalRandom.current().nextInt(from, to + 1);
            arr[i] = rand;
        }
        return arr;
    }

    public static void countElements(int[] someArr) {
        Arrays.sort(someArr);
        for (int i = 0; i < someArr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < someArr.length; j++) {
                if (someArr[i] == someArr[j]) {
                    count++;
                    i = j;
                }
            }
            System.out.printf("%d occurs %d times \n", someArr[i], count);
        }
    }
}
