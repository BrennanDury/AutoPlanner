import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class Day implements Comparable<Day> {
    private Calendar date; 
    private int minutes;
    private HashSet<LooseTask> looseTasksEndingToday;
    private HashSet<StrictTask> strictTasks;

    public Day(Calendar date) {
        Calendar cal = new GregorianCalendar();
        cal.set(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DATE), 0, 0, 0);
        this.date = cal;
        this.looseTasksEndingToday = new HashSet<LooseTask>();
    }

    public Calendar getDate() {
        return date;
    }

    public int getMinutes() {
        return minutes;
    }

    public HashSet<LooseTask> getlooseTasksEndingToday() {
        return looseTasksEndingToday;
    }

    public HashSet<StrictTask> getStrictTasks() {
        return strictTasks;
    }
    
    public void addStrictTaskMinutes(int minutes) {
        this.minutes += minutes;
    }

    public void addStrictTask(StrictTask task) {
        strictTasks.add(task);
    }

    public void addLooseTask(LooseTask task) {
        looseTasksEndingToday.add(task);
    }

    public int compareTo(Day other) {
        int cmp = Integer.compare(this.date.get(Calendar.YEAR), other.getDate().get(Calendar.YEAR));
        if (cmp != 0) {
            return cmp;
        }
        cmp = Integer.compare(this.date.get(Calendar.MONTH), other.getDate().get(Calendar.MONTH));
        if (cmp != 0) {
            return cmp;
        }
        cmp = Integer.compare(this.date.get(Calendar.DATE), other.getDate().get(Calendar.DATE));
        return cmp;
    }
}
