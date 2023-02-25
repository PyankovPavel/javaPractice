package Lesson5VlMorozov.OOP_Lesson5_MVC.src.personal.model;

import java.util.List;

public interface FileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
