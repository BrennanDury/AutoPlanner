import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class ScheduleBuilder {
    private TreeMap<LocalDate, Day> days;

	public ScheduleBuilder() {
        this.days = new TreeMap<LocalDate, Day>();
    }
    
	public void addLooseTask(String name, int durationMinutes, int deadlineYear, int deadlineMonth, int deadlineDate, int deadlineHour, int deadlineMinute) {
        LocalDate date = LocalDate.of(deadlineYear, deadlineMonth, deadlineDate);
        LocalTime time = LocalTime.of(deadlineHour, deadlineMinute);
        if (!days.containsKey(date)) {
            days.put(date, new Day());
        }
        days.get(date).addLooseTask(new LooseTask(name, time, durationMinutes));
	}

	/*public void addStrictTask(String name, int startYear, int startMonth, int startDate, int startHour, int startMinute, int endYear, int endMonth, int endDate, int endHour, int endMinute) {
		GregorianCalendar startCal = new GregorianCalendar();
		startCal.set(startYear, startMonth, startDate, startHour, startMinute, 0);
		GregorianCalendar endCal = new GregorianCalendar();
		endCal.set(endYear, endMonth, endDate, endHour, endMinute, 0);
        Date date = new Date(startCal);
        if (!days.containsKey(date)) {
            days.put(date, new Day());
        }
        days.get(date).addStrictTask(new LooseTask(name, startCal, endCal));	}*/
}