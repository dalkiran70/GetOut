package Model;

import java.util.Calendar;

public class MealEvent extends Event{

    private final String type;

    public MealEvent(String title, String place, String date, String deadline, int numberOfParticipants, String description) {
        super(title, place, date, deadline, numberOfParticipants, description);
        type = "meal";
    }

    public String getType() {
        return type;
    }
}
