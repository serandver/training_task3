package ua.kpi.tef.model.entity;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Note> notes = new ArrayList<>();

    //only add note operation.
    public void addNewNote(Note note) {
        notes.add(note);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("My noteBook:");

        for (Note note: notes) {
            result.append("\n");
            result.append(note);
        }

        return result.toString();
    }
}
