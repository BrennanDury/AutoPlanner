import java.time.LocalTime;

public class LooseTask implements Comparable<LooseTask> {
    private String name;
    private LocalTime deadline;
    private int durationMinutes;
    
    public LooseTask(String name, LocalTime deadline, int durationMinutes) {
        this.name = name;
        this.deadline = deadline;
        this.durationMinutes = durationMinutes;
    }
    
    public String getName() {
        return name;
    }
    
    public LocalTime getDeadline() {
        return deadline;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int compareTo(LooseTask other) {
        return deadline.compareTo(other.deadline);
    }
}

