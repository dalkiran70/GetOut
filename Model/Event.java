package Model;
/**
 * @author Sena Korkut
 */
public abstract class Event {
    private String title;
    private String place;
    private String date;
    private String deadline;
    private int numberOfParticipants;
    private String description;

    public Event(String title, String place, String date, String deadline, int numberOfParticipants, String description) {
        this.title = title;
        this.place = place;
        this.date = date;
        this.deadline = deadline;
        this.numberOfParticipants = numberOfParticipants;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
