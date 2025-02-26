public class Task {
    protected String description;
    protected boolean completed = false;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public String toString() {
        String taskCompletion = null;
        if (this.completed) {
            taskCompletion = "Completed!";
        }

        return this.description + " Task Progress:  " + taskCompletion;
    }

    public void setCompletion(boolean completed) {
        this.completed = completed;
    }
}
