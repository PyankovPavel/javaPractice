package Lesson7VlMorozov.view;

import Lesson7VlMorozov.controller.Notes;
import Lesson7VlMorozov.model.Note;

import java.util.List;
import java.util.Scanner;

public class ViewNotes {
    private final Notes noteController;

    public ViewNotes(Notes noteController) {
        this.noteController = noteController;
    }

    public void run() {

        Commands com;
        while (true) {
            String command = prompt("Input a command from the list \n" +
                    "CREATE/READ/LIST/UPDATE/DELETE or input EXIT to close program: ");
            try {
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createNote();
                        break;
                    case READ:
                        readNote();
                        break;
                    case LIST:
                        listNote();
                        break;
                    case UPDATE:
                        updateNote();
                        break;
                    case DELETE:
                        deleteNote();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteNote() throws Exception {
        String deleteId = prompt("Input id of a note to delete: ");
        noteController.deleteNote(deleteId);
        System.out.println("Note deleted successfully");
    }

    private void updateNote() throws Exception {
        String readId = prompt("Input id of a note to edit: ");
        noteController.updateNote(readId, inputNote());
    }

    private void listNote() {
        List<Note> listNotes = noteController.readAllUsers();
        for (Note note : listNotes) {
            System.out.println(note + "\n");
        }
    }

    private void readNote() throws Exception {
        String id = prompt("Note id: ");
        Note note = noteController.readNote(id);
        System.out.println(note);

    }

    private Note inputNote() {
        String heading = prompt("Note's header : ");
        String body = prompt("Note's text: ");
        return new Note(heading, body);
    }

    private void createNote() throws Exception {
        noteController.saveNote(inputNote());
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
