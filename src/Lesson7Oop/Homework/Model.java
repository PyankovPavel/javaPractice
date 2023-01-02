package Lesson7Oop.Homework;


import java.io.*;
import java.util.ArrayList;


public class Model {
    static String fileOfPhonebook = "src/Lesson7Oop/Homework/phonebook.txt";
    static ArrayList<Contacts> phonebook = new ArrayList<>();

    public static int count() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(Model.fileOfPhonebook));
        int count = 0;
        while (null != input.readLine()) {
            count++;
        }
        return count;
    }

    public static void fromFileToList() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(Model.fileOfPhonebook));
        int count = count();
        for (int i = 0; i < count; i++) {
            String[] line = input.readLine().split(" ");
            int id = Integer.parseInt(line[0]);
            String name = line[1];
            String surname = line[2];
            String number = line[3];
            Contacts cont = new Contacts(id, name, surname, number);
            phonebook.add(cont);
        }
    }

    public static void exportCsv() throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(Model.fileOfPhonebook));
        Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("src/Lesson7Oop/Homework/Output/Contacts.csv")));
        int count = count();
        for (int i = 0; i < count; i++) {
            String line = input.readLine().replace(" ", ",");
            writer.write(line + "\n");
        }
        input.close();
        writer.close();
    }

    public static String print(ArrayList<Contacts> someArraylist) {
        StringBuilder contact = new StringBuilder();
        for (int i = 0; i < someArraylist.size(); i++) {
            contact.append(someArraylist.get(i).getId()).append(" ")
                    .append(someArraylist.get(i).getName()).append(" ")
                    .append(someArraylist.get(i).getSurname()).append(" ")
                    .append(someArraylist.get(i).getPhone_number()).append("\n");
        }
        return contact.toString();
    }
}
