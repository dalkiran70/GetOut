package Model;

import java.util.Calendar;

public class SportEvent extends Event{

    private final String type;

    public SportEvent(String title, String place, String date, String deadline, int numberOfParticipants, String description) {
        super(title, place, date, deadline, numberOfParticipants, description);
        type = "sport";
    }

    public String getType() {
        return type;
    }
}
