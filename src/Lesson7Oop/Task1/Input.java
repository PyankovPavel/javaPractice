package Lesson7Oop.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Класс для взаимодействия с пользователем через консоль.
 * Пользователь вводит необходимые параметры.
 */
public class Input {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private int length;
    private int from;
    private int to;
    private int elementsToCount;

    public int getElementsToCount() {
        return elementsToCount;
    }

    public void setElementsToCount() {
        System.out.println("Input number of elements to sum: ");
        try {
            this.elementsToCount = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getFrom() {
        return from;
    }

    public void setFrom() {
        System.out.println("Input a from_number of random: ");
        try {
            this.from = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getTo() {
        return to;
    }

    public void setTo() {
        System.out.println("Input a to_number of random: ");
        try {
            this.to = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength() {
        System.out.println("Input a size of array: ");
        try {
            this.length = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
