import java.util.*;
import java.time.LocalTime;

public class LooseTask {
    private String name;
    private LocalTime time;
    private int durationMinutes;
    
    public LooseTask(String name, LocalTime time, int durationMinutes) {
        this.name = name;
        this.time = time;
        this.durationMinutes = durationMinutes;
    }
    
    public String getName() {
        return name;
    }
    
    public LocalTime getTime() {
        return time;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
    

    public StrictTask toStrictTask(Calendar startTime, int duration) {
        GregorianCalendar endTime = (GregorianCalendar) startTime.clone();
        endTime.add(Calendar.MINUTE, duration);
        return new StrictTask(this.name, startTime, endTime);
    }
}

