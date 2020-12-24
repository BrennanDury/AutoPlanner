import java.util.TreeMap;
import java.util.TreeSet;

public class SolvedDay {
    private TreeMap<LooseTask, Integer> minutesEachTask;
    private TreeSet<StrictTask> strictTasks;

    public SolvedDay() {
        this.minutesEachTask = new TreeMap<LooseTask, Integer>();
        this.strictTasks = new TreeSet<StrictTask>();
    }
    public void addMinutesOfTask(LooseTask task, int minutes) {
        if (!minutesEachTask.containsKey(task)) {
            minutesEachTask.put(task, minutes);
        } else {
            minutesEachTask.put(task, minutesEachTask.get(task) + minutes);
        }
    }

    public void addStrictTask(StrictTask task) {
        strictTasks.add(task);
    }

    public TreeMap<LooseTask, Integer> getMinutesEachTask() {
        return minutesEachTask;
    }

    public TreeSet<StrictTask> getStrictTasks() {
        return strictTasks;
    }
}
