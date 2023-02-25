package Lesson5VlMorozov.personal;

import Lesson5VlMorozov.personal.controllers.UserController;
import Lesson5VlMorozov.personal.model.FileOperation;
import Lesson5VlMorozov.personal.model.FileOperationImpl;
import Lesson5VlMorozov.personal.model.Repository;
import Lesson5VlMorozov.personal.model.RepositoryFile;
import Lesson5VlMorozov.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
