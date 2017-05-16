package ua.kpi.tef.model;

import ua.kpi.tef.model.entity.Note;
import ua.kpi.tef.model.entity.NoteBook;

public class Model {

    private NoteBook noteBook;

    public Model() {
        noteBook = new NoteBook();
    }

    public void saveNote(Note note) {
        noteBook.addNewNote(note);
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }
}
