package Lesson7Oop.Task1;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Здесь будем хранить основные методы
 */
public class Model {
    Input inp = new Input();

    /**
     * Метод наполнения массива рандомными числами
     * @return возвращаем массив интов
     */
    public int[] fillArray() {
        inp.setLength();
        inp.setFrom();
        inp.setTo();
        int[] array = new int[inp.getLength()];
        for (int i = 0; i < array.length; i++) {
            int rand = ThreadLocalRandom.current().nextInt(inp.getFrom(), inp.getTo());
            array[i] = rand;
        }
        return array;
    }

    /**
     * Метод для подсчета сумм необходимого кол-ва рядомстоящих элементов массива
     *
     * @param someArray принимаем на вход массив
     * @return ArrayList of Integers
     */
    public ArrayList<Integer> sumList(int[] someArray) {
        inp.setElementsToCount();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < someArray.length; i++) {
            int temp = i;
            for (int j = 0; j < inp.getElementsToCount(); j++) {
                sum += someArray[temp];
                temp++;
            }
            list.add(sum);
            sum = 0;
            if (someArray.length - i == inp.getElementsToCount()) {
                break;
            }
        }
        return list;
    }
}
