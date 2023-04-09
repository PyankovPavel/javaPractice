package Lesson7VlMorozov.controller;

import Lesson7VlMorozov.logs.Logger;
import Lesson7VlMorozov.model.Note;

import java.util.List;

public class NotesContLogger implements Notes {
    private NotesController notesController;
    private Logger log;

    public NotesContLogger(NotesController notesController, Logger log) {
        this.notesController = notesController;
        this.log = log;
    }

    @Override
    public void saveNote(Note note) throws Exception {
        log.saveToLog("New note has been saved \n" + note);
        notesController.saveNote(note);
    }

    @Override
    public Note readNote(String noteId) throws Exception {
        log.saveToLog("The note # " + noteId + " was read");
        return notesController.readNote(noteId);
    }

    @Override
    public Note searchNote(String noteId, List<Note> notes) throws Exception {
        log.saveToLog("The note # " + noteId + " was found");
        return notesController.searchNote(noteId, notes);
    }

    @Override
    public List<Note> readAllUsers() {
        log.saveToLog("All users read");
        return notesController.readAllUsers();
    }

    @Override
    public void updateNote(String noteId, Note newNote) throws Exception {
        log.saveToLog("Note # " + noteId + " was updated");
        notesController.updateNote(noteId, newNote);

    }

    @Override
    public void deleteNote(String noteID) throws Exception {
        log.saveToLog("Note # " + noteID + " was deleted");
        notesController.deleteNote(noteID);
    }
}
