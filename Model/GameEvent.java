package Model;

import java.util.Calendar;
/**
 * @author Muhammed Naci Dalkıran
 */
public class GameEvent extends Event{

    private final String type;

    public GameEvent(String title, String place, String date, String deadline, int numberOfParticipants, String description) {
        super(title, place, date, deadline, numberOfParticipants, description);
        type = "game";
    }

    public String getType() {
        return type;
    }
}
