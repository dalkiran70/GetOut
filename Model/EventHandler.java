package Model;
/**
 * @author Sena Korkut
 */
public class EventHandler {

    private EventList topFive;
    private EventList runOutOfParticipant;
    private EventList allEvents;
    private User user;
    private UserList userList;

    public EventList getTopFive() {
        return topFive;
    }

    public EventList getRunOutOfParticipant() {
        return runOutOfParticipant;
    }

    public EventList getAllEvents() {
        return allEvents;
    }

    public boolean addEvent(){
        return true;
    }
    public boolean joinEvent(){
        return true;
    }
    public boolean dropEvent(){
        return true;
    }
    public boolean editEvent(){
        return true;
    }
    public boolean deleteEvent(){
        return true;
    }
}
