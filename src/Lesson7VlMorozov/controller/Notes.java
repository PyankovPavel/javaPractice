package Lesson7VlMorozov.controller;

import Lesson7VlMorozov.model.Note;
import java.util.List;

public interface Notes {
    void saveNote(Note note) throws Exception;
    Note readNote(String noteId) throws Exception;
    Note searchNote(String noteId, List<Note> notes) throws Exception;
    List<Note> readAllUsers();
    void updateNote(String noteId, Note newNote) throws Exception;
    void deleteNote(String noteID) throws Exception;

}
