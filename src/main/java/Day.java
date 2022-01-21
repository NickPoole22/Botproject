import java.util.ArrayList;
import java.util.List;

public class Day {
    String month;
    Integer day;
    List<Reminder> reminders = new ArrayList<>();

    public Day(String month, Integer day) {
        this.month = month;
        this.day = day;
    }

    public void addReminder(Reminder r) {
        reminders.add(r);
    }

    @Override
    public String toString() {
        return "Day{" +
                "month='" + month + '\'' +
                ", day=" + day +
                ", reminders=" + reminders +
                '}';
    }
}
