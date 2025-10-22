import java.util.List;

public class TaskRepository {
    private List<Task> tasks;

    public TaskRepository() {
        this.tasks = new java.util.ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public void markAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }
}
