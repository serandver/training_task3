package ua.kpi.tef.model;

import ua.kpi.tef.exceptions.NickNameAlreadyExistException;
import ua.kpi.tef.model.entity.Note;
import ua.kpi.tef.model.entity.NoteBook;

public class Model {

    private NoteBook noteBook;
    private Note note;

    public Model() {
        noteBook = new NoteBook();
    }

    public boolean saveNote(Note note) throws NickNameAlreadyExistException {
        return noteBook.addNewNote(note);
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(NoteBook noteBook) {
        this.noteBook = noteBook;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
