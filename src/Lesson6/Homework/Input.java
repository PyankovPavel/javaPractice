package Lesson6.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private String search;

    public String getSearch() {
        return search;
    }

    public String setSearch() {
        System.out.println("Input smth to find: ");
        try {
            this.search = bf.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return this.search;
    }
}
