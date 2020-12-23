import java.util.*;

public class ScheduleBuilder {
	private HashMap<String, HashSet<StrictTask>> strictTasks;
	private HashMap<String, HashSet<LooseTask>> looseTasks;


	public ScheduleBuilder() {
		this.strictTasks = new HashMap<String, HashSet<StrictTask>>();
	}

	public void removeStrictTask(StrictTask task) {
		strictTasks.get(task.getName()).remove(task);
	}

	public void removeLooseTask(LooseTask task) {
		looseTasks.get(task.getDeadlineKey()).remove(task);
	}

	public HashMap<String, HashSet<StrictTask>> getStrictTasks() {
		return strictTasks;
	}

	public HashMap<String, HashSet<LooseTask>> getLooseTasks() {
		return looseTasks;
	}

	public void addLooseTask(String name, int durationMinutes, int deadlineYear, int deadlineMonth, int deadlineDate, int deadlineHour, int deadlineMinute) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(deadlineYear, deadlineMonth, deadlineDate, deadlineHour, deadlineMinute, 0);
		//addLooseTask(new LooseTask(name, cal, durationMinutes));	
	}

	public void addStrictTask(String name, int startYear, int startMonth, int startDate, int startHour, int startMinute, int endYear, int endMonth, int endDate, int endHour, int endMinute) {
		GregorianCalendar startCal = new GregorianCalendar();
		startCal.set(startYear, startMonth, startDate, startHour, startMinute, 0);
		GregorianCalendar endCal = new GregorianCalendar();
		endCal.set(endYear, endMonth, endDate, endHour, endMinute, 0);
		//addStrictTask(new StrictTask(name, startCal, endCal));
	}
}