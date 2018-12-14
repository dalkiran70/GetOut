package Model;

public class Profile {
    private Event event;
    private User user;
    private EventList attendedEvents;
    private EventList createdEvent;

    public Profile(User user){
        this.user = user;
    }

    public EventList getAttendedEvents() {
        //TODO
        return attendedEvents;
    }

    public EventList getCreatedEvent() {
        //TODO
        return createdEvent;
    }

}
