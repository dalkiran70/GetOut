package Model;

import java.util.Calendar;

public class TransportationEvent extends Event{

    private final String type;

    public TransportationEvent(String title, String place, String date, String deadline, int numberOfParticipants, String description) {
        super(title, place, date, deadline, numberOfParticipants, description);
        type = "transportation";
    }

    public String getType() {
        return type;
    }
}
