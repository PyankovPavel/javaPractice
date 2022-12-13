package Lesson7Oop.Task1;

import java.util.Arrays;

/**
 * Написать программу, считающую сумму каждый трех элементов массива
 */

public class Program {
    public static void main(String[] args) {
        Model md = new Model();
        int[] array = md.fillArray();
        System.out.println(Arrays.toString(array));
        System.out.println(md.sumList(array));
    }
}
