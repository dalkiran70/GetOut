package Model;

import java.util.Calendar;
/**
 * @author Muhammed Naci Dalkıran
 */
public class GroupWorkEvent extends Event{

    private final String type;

    public GroupWorkEvent(String title, String place, String date, String deadline, int numberOfParticipants, String description) {
        super(title, place, date, deadline, numberOfParticipants, description);
        type = "groupWork";
    }

    public String getType() {
        return type;
    }
}
