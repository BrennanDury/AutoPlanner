import java.time.LocalDateTime;

public class LooseTask implements Comparable<LooseTask> {
    private String name;
    private LocalDateTime deadline;
    private int durationMinutes;
    
    public LooseTask(String name, LocalDateTime deadline, int durationMinutes) {
        this.name = name;
        this.deadline = deadline;
        this.durationMinutes = durationMinutes;
    }
    
    public String getName() {
        return name;
    }
    
    public LocalDateTime getDeadline() {
        return deadline;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public int compareTo(LooseTask other) {
        return deadline.compareTo(other.deadline);
    }
}

