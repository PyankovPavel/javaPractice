package Lesson7Oop.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contacts {
    private int id;
    private String name;
    private String surname;

    private String phone_number;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = Model.phonebook.size() + 1;
    }

    public String getName() {
        return name;
    }

    public Contacts(int id, String name, String surname, String phone_number) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
    }

    public Contacts() {

    }


    public void setName() throws IOException {
        System.out.println("Input name: ");
        this.name = br.readLine().toLowerCase();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() throws IOException {
        System.out.println("Input surname: ");
        this.surname = br.readLine().toLowerCase();
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number() throws IOException {
        System.out.println("Input phone number: ");
        this.phone_number = br.readLine();
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone_number='" + phone_number + '\'';
    }
}
