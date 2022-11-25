package Lesson2;

import java.util.Random;

/**
 * app ru.wikipedia.org/wiki/Javadoc
 */

public class Lesson2 {
    /**
     * // Задача 1: Задайте массив из 12 элементов,
     * // заполненный случайными числами из промежутка [-9, 9].
     * // Найдите сумму отрицательных и положительных
     * // элементов массива.
     */

    public static void main(String[] args) {
        Exercise.Ex01();
    }

    /**
     * Решение
     * всех
     * задач
     */
    class Exercise {

        /**
         * Вызов метода
         * решения первой задачи
         */
        public static void Ex01() {

            int[] col = Library.createArray(12);
            System.out.println(Library.printGood(col));
            // Library.printBad(col);

            Library.fillRandom(col, -9, 9);
            // System.out.println(Library.printGood(col));
            Library.printBad(col);
            int pos = Library.sumPositive(col);
            System.out.printf(">0 %d\n", pos);
            int neg = Library.sumNegative(col);
            System.out.printf("<0 %d\n", neg);

        }
    }

    /**
     * Библиотека
     * с методами
     */
    class Library {

        /**
         * Печать массив. Хорошая
         *
         * @param numbers массив, который нужно распечатать
         * @return Возвращает строку,
         * содержащую элементы массива
         */
        public static String printGood(int[] numbers) {
            int size = numbers.length;
            int i = 0;
            String result = "[ ";

            while (i < size) {
                result += String.format("%4d", numbers[i]);
                i++;
            }
            return result + "]";
        }

        public static void printBad(int[] numbers) {
            int size = numbers.length;
            int i = 0;
            System.out.printf("[ ");

            while (i < size) {
                System.out.printf("%4d", numbers[i]);
                i++;
            }
            System.out.println("]");
        }

        /**
         * Метод, который
         * создаёт массив
         */
        public static int[] createArray(int count) {
            return new int[count];
        }

        /**
         * Метод заполнения
         * массива
         */
        public static void fillRandom(int[] array, int min, int max) {
            int size = array.length;
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(min, max + 1);
            }
        }

        /**
         * Метод поиска
         * суммы положительных
         */
        public static int sumPositive(int[] numbers) {
            int result = 0;
            int size = numbers.length;
            for (int i = 0; i < size; i++) {
                if (numbers[i] > 0)
                    result += numbers[i];
            }
            return result;
        }

        /**
         * Метод поиска
         * суммы отрицательных
         */
        public static int sumNegative(int[] numbers) {
            int result = 0;
            int size = numbers.length;
            for (int i = 0; i < size; i++) {
                if (numbers[i] < 0)
                    result += numbers[i];
            }
            return result;
        }
    }


}



