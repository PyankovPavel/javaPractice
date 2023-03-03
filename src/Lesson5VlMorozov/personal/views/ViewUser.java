package Lesson5VlMorozov.personal.views;

import Lesson5VlMorozov.personal.controllers.UserController;
import Lesson5VlMorozov.personal.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private final UserController userController;

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com;

        while (true) {
            String command = prompt("Введите команду, а если не знаете команд, то напишите 'Help': ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case HELP -> help();
                    case CREATE -> createUser();
                    case READ -> readUser();
                    case LIST -> listUsers();
                    case UPDATE -> updateUser();
                    case DELETE -> deleteUser();
                }
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
    }

    private void help() {
        String command1 = "Create - создать пользователя\n";
        String command2 = "Read - получить данные о пользователе\n";
        String command3 = "List - список всех пользователей\n";
        String command4 = "Update - отредактировать данные пользователя\n";
        String command5 = "Delete - удалить пользователя\n";
        String command6 = "Exit - выход из программы\n";
        System.out.printf("Список комманд: %s %s %s %s %s %s",
                command1, command2, command3, command4, command5, command6);
    }

    private void deleteUser() {
        String readId = getID("Введите ID юзера для удаления: ");
        userController.deleteUser(readId);
    }

    private void updateUser() throws Exception {
        String readId = getID("Введиет редактируемый ID юзера: ");
        userController.updateUser(readId, inputUser());
    }

    private String getID(String message) {
        return prompt(message);
    }

    private void listUsers() {
        List<User> listUsers = userController.readAllUsers();
        for (User user : listUsers) {
            System.out.println(user + "\n");
        }
    }

    private void readUser() throws Exception {
        String id = getID("Идентификатор пользователя: ");

        User user = userController.readUser(id);
        System.out.println(user);

    }

    private User inputUser() {
        String firstName = prompt("Имя: ");
        String lastName = prompt("Фамилия: ");
        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    private void createUser() throws Exception {
        userController.saveUser(inputUser());
    }


    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
