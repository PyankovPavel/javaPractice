package Lesson7Oop.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int select;
    static String searchLine;

    public static int setSelect() throws IOException {
        System.out.println("Input a number: ");
        try {
            select = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            System.out.println("Wrong input. Please input a number.");
            setSelect();
        }
        return select;
    }
    public static String searching() throws IOException {
        System.out.println("Input smth you want to find: ");
        try {
            searchLine = br.readLine();
        } catch (NumberFormatException | IOException e) {
            System.out.println("Wrong input. Please input smth.");
            searching();
        }
        return searchLine;
    }
}
