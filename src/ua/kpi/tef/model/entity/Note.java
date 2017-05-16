package ua.kpi.tef.model.entity;

import java.util.Calendar;
import java.util.Date;

public class Note {
    private Subscriber subscriber;
    private SubscriberContacts subscriberContacts;
    private Group group;
    private Address address;
    private final Date timeCreation = Calendar.getInstance().getTime();
    private Date timeLastModification = Calendar.getInstance().getTime();
    private String comment;

    public Note() {
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }
    public SubscriberContacts getSubscriberContacts() {
        return subscriberContacts;
    }
    public Group getGroup() {
        return group;
    }
    public Address getAddress() {
        return address;
    }
    public Date getTimeCreation() {
        return timeCreation;
    }
    public Date getTimeLastModification() {
        return timeLastModification;
    }
    public String getComment() {
        return comment;
    }


    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
        timeLastModification = Calendar.getInstance().getTime();
    }

    public void setSubscriberContacts(SubscriberContacts subscriberContacts) {
        this.subscriberContacts = subscriberContacts;
        timeLastModification = Calendar.getInstance().getTime();
    }

    public void setGroup(Group group) {
        this.group = group;
        timeLastModification = Calendar.getInstance().getTime();
    }

    public void setAddress(Address address) {
        this.address = address;
        timeLastModification = Calendar.getInstance().getTime();
    }

    public void setComment(String comment) {
        this.comment = comment;
        timeLastModification = Calendar.getInstance().getTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (!subscriber.equals(note.subscriber)) return false;
        if (!subscriberContacts.equals(note.subscriberContacts)) return false;
        if (group != note.group) return false;
        if (!address.equals(note.address)) return false;
        if (!timeCreation.equals(note.timeCreation)) return false;
        if (!timeLastModification.equals(note.timeLastModification)) return false;
        return comment.equals(note.comment);
    }

    @Override
    public int hashCode() {
        int result = subscriber.hashCode();
        result = 31 * result + subscriberContacts.hashCode();
        result = 31 * result + group.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + timeCreation.hashCode();
        result = 31 * result + timeLastModification.hashCode();
        result = 31 * result + comment.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Note{" + "\n" +
                "subscriber=" + subscriber + ",\n" +
                "subscriberContacts=" + subscriberContacts + ",\n" +
                "group=" + group.toString() + ",\n" +
                "address=" + address + ",\n" +
                "timeCreation=" + timeCreation + ",\n" +
                "timeLastModification=" + timeLastModification + ",\n" +
                "comment='" + comment + '\'' + "\n" +
                '}';
    }
}
