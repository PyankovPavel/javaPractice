package Lesson5VlMorozov.OOP_Lesson5_MVC.src.personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
}
