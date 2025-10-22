import java.util.List;

public class TaskPrinter {
    public void printCompletedTasks(List<Task> tasks) {
        System.out.println("Taches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    public void printPendingTasks(List<Task> tasks) {
        System.out.println("Taches non terminees :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
