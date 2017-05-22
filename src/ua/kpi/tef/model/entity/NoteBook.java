package ua.kpi.tef.model.entity;

import ua.kpi.tef.exceptions.NickNameAlreadyExistException;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    private List<Note> notes = new ArrayList<>();



    public NoteBook() {
        initWithFakeNote();
    }

    private void initWithFakeNote() {
        Note note = new Note();
        note.setNickName("nick");
        note.setAddress(new Address("65443", "Kiev", "Street", "43", "432"));
        note.setComment("Blah");
        note.setGroup(Group.FAMILY);
        note.setSubscriber(new Subscriber("Dad", "Dadov", "Fres"));
        note.setSubscriberContacts(new SubscriberContacts("07654543", "+3(076)4324333", "+3(076)4324333", "serg@io.ua", "skype" ));
        notes.add(note);
    }

    //only add note operation.
    public boolean addNewNote(Note note) throws NickNameAlreadyExistException {
        for (Note n: notes) {
            if (n.getNickName().equals(note.getNickName())) {
                throw new NickNameAlreadyExistException(note);
            }
        }
        return notes.add(note);
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
