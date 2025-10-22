class TaskService {

    private TaskRepository repo;

    private TaskPrinter printer;

    public TaskService() {
        this.repo = new TaskRepository();
        this.printer = new TaskPrinter();
    }

    // Ajouter une nouvelle tâche
    public void addTask(String title, String description) {
        this.repo.add(new Task(title, description));
    }

    // Marquer une tâche comme terminée
    public void markTaskAsComplete(int index) {
        this.repo.markAsComplete(index);
    }

    // Générer un rapport des tâches terminées
    public void printCompletedTasks() {
       this.printer.printCompletedTasks(this.repo.getTasks());
    }

    // Générer un rapport des tâches non terminées
    public void printPendingTasks() {
        this.printer.printPendingTasks(this.repo.getTasks());
    }


}