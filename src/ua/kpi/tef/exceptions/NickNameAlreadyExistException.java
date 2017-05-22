package ua.kpi.tef.exceptions;

import ua.kpi.tef.model.entity.Note;

public class NickNameAlreadyExistException extends Exception {
    private Note note;

    public NickNameAlreadyExistException(Note note) {
        this.note = note;
    }
}
