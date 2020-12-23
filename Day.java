import java.util.HashSet;

public class Day{
    private int minutes;
    private HashSet<LooseTask> looseTasksEndingToday;
    private HashSet<StrictTask> strictTasksStartingToday;

    public Day() {
        this.looseTasksEndingToday = new HashSet<LooseTask>();
        this.strictTasksStartingToday = new HashSet<StrictTask>();
    }

    public int getMinutes() {
        return minutes;
    }

    public HashSet<LooseTask> getlooseTasksEndingToday() {
        return looseTasksEndingToday;
    }

    public HashSet<StrictTask> getStrictTasksStartingToday() {
        return strictTasksStartingToday;
    }

    public void addStrictTaskMinutes(int minutes) {
        this.minutes += minutes;
    }

    public void addStrictTask(StrictTask task) {
        strictTasksStartingToday.add(task);
    }

    public void addLooseTask(LooseTask task) {
        looseTasksEndingToday.add(task);
    }
}
