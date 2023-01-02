package Lesson7Oop.Homework;


import java.io.IOException;

public class View {
    public static void viewOfPhonebook() {
        for (Contacts contacts : Model.phonebook) {
            System.out.printf("%d %s %s %s\n", contacts.getId(), contacts.getName(),
                    contacts.getSurname(), contacts.getPhone_number());
        }
    }


    static void mainMenu() throws IOException {
        System.out.print("\nMain menu\n" +
                "1. Add contact\n" +
                "2. Delete contact\n" +
                "3. Edit contact\n" +
                "4. Show contacts \n" +
                "5. Contacts search\n" +
                "6. Save file\n" +
                "7. Export file to csv\n" +
                "8. Close program\n");
        int select = Input.setSelect();
        while (true) {
            switch (select) {
                case 1:
                    Controller.addContact();
                    break;
                case 2:
                    Controller.removeContact();
                    mainMenu();
                    break;
                case 3:
                    Controller.changeContact();
                    mainMenu();
                    break;
                case 4:
                    viewOfPhonebook();
                    mainMenu();
                    break;
                case 5:
                    Controller.search();
                    mainMenu();
                    break;
                case 6:
                    Controller.overwriteFile();
                    mainMenu();
                    break;
                case 7:
                    Model.exportCsv();
                    mainMenu();
                    break;
                case 8:
                    System.out.println("Program successfully closed.");
                    System.exit(0);
                    break;
            }
        }

    }
}
