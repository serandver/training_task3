package ua.kpi.tef.model.entity;

import java.util.Calendar;
import java.util.Date;

public class Note {
    private Subscriber subscriber;
    private SubscriberContacts subscriberContacts;
    private GroupContact group;
    private Address address;
    private final Date timeCreation = Calendar.getInstance().getTime();
    private Date timeLastModification;
    private String comment;
}
