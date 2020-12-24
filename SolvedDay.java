import java.util.TreeMap;
import java.util.TreeSet;

public class SolvedDay {
    private TreeMap<LooseTask, Integer> minutesEachTask;
    private TreeSet<StrictTask> strictTasks;

    public void addMinutesOfTask(LooseTask task, int minutes) {

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
