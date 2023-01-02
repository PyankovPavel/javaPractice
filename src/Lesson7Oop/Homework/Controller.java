package Lesson7Oop.Homework;

import java.io.*;


public class Controller {
    public static void addContact() throws IOException {
        Contacts c = new Contacts();
        c.setId();
        c.setName();
        c.setSurname();
        c.setPhone_number();
        Model.phonebook.add(c);
        System.out.printf("Contact %s %s %s created.\n", c.getName(), c.getSurname(), c.getPhone_number());
        View.mainMenu();
    }


    public static void startApp() throws IOException {
        Model.fromFileToList();
        View.mainMenu();
    }

//    public static void openFile() {
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(Model.fileOfPhonebook));
//            while (true) {
//                String line = reader.readLine();
//                if (line == null) {
//                    break;
//                }
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public static void saveFile() throws IOException {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(Model.fileOfPhonebook, true));
//            writer.write(Model.print(Model.phonebook));
//            writer.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void overwriteFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(Model.fileOfPhonebook));
            writer.write(Model.print(Model.phonebook));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void removeContact() throws IOException {
        View.viewOfPhonebook();
        System.out.println("Input Id of Contact you want to delete.");
        int select = Input.setSelect();
        for (int i = 0; i < Model.phonebook.size(); i++) {
            if (Model.phonebook.get(i).getId() == select) {
                Model.phonebook.remove(i);
            }
        }
        View.viewOfPhonebook();
        overwriteFile();
    }

    public static void changeContact() throws IOException {
        View.viewOfPhonebook();
        System.out.println("Input Id of Contact you want to change.");
        int select = Input.setSelect();
        System.out.println("What need to be changed? Input: 0 - to change Name, 1 - Surname, 2 - phone number.");
        int innerSelect = Input.setSelect();
        for (int i = 0; i < Model.phonebook.size(); i++) {
            if (Model.phonebook.get(i).getId() == select) {
                if (innerSelect == 0) {
                    Model.phonebook.get(i).setName();
                } else if (innerSelect == 1) {
                    Model.phonebook.get(i).setSurname();
                } else if (innerSelect == 2) {
                    Model.phonebook.get(i).setPhone_number();
                } else {
                    System.out.println("Wrong input. Please set number from 0 to 2.");
                }
            }
        }
        View.viewOfPhonebook();
        overwriteFile();
    }

    public static void search() throws IOException {
        System.out.println("Where do you want to search? Input 1 - to search in Names, 2 - in Surnames, " +
                "3 - in phone numbers: ");
        int select = Input.setSelect();
        switch (select) {
            case 1:
                String searchLine = Input.searching();
                for (int i = 0; i < Model.phonebook.size(); i++) {
                    if (Model.phonebook.get(i).getName().contains(searchLine)) {
                        System.out.println(Model.phonebook.get(i).toString());
                    }
                }
                break;
            case 2:
                searchLine = Input.searching();
                for (int i = 0; i < Model.phonebook.size(); i++) {
                    if (Model.phonebook.get(i).getSurname().contains(searchLine)) {
                        System.out.println(Model.phonebook.get(i).toString());
                    }
                }
                break;
            case 3:
                searchLine = Input.searching();
                for (int i = 0; i < Model.phonebook.size(); i++) {
                    if (Model.phonebook.get(i).getPhone_number().contains(searchLine)) {
                        System.out.println(Model.phonebook.get(i).toString());
                    }
                }

        }
    }

}
