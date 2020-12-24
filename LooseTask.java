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
}

