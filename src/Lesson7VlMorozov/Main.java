package Lesson7VlMorozov;

import Lesson7VlMorozov.logs.Logger;
import Lesson7VlMorozov.controller.*;
import Lesson7VlMorozov.model.*;
import Lesson7VlMorozov.view.ViewNotes;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger("src/Lesson7VlMorozov/logger.txt");
        FileOperation fileOperation = (new FileOperations("src/Lesson7VlMorozov/notes.txt"));
        Repository repository = new RepositoryFile(fileOperation);
        NotesController controller = new NotesController(repository);
        Notes cont = new NotesContLogger(controller, logger);
        ViewNotes view = new ViewNotes(cont);
        view.run();
    }
}
