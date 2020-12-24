import java.time.LocalTime;

public class StrictTask {
	private String name;
	private LocalTime startTime;
	private LocalTime endTime;

	public StrictTask (String name, LocalTime startTime, LocalTime endTime) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getName() {
		return name;
    }

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}
}