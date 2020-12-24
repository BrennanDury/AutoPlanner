import java.util.HashSet;

public class Day{
    private int minutes;
    private HashSet<LooseTask> looseTasksEndingToday;
    private HashSet<StrictTask> strictTasks;

    public Day() {
        this.looseTasksEndingToday = new HashSet<LooseTask>();
        this.strictTasks = new HashSet<StrictTask>();
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
}
