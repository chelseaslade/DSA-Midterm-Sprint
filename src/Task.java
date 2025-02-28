//Stores the description and completion status of a task.
//Includes a method to mark a task as completed.

public class Task {
    protected String description;
    protected boolean completed = false;
    protected int id;
    protected static int serial = 1;


    public Task(String description) {
        this.description = description;
        this.id = serial++;
    }

    public String getDescription() {
        return this.description;
    }

    public int getID() {
        return this.id;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public String toString() {
        String taskCompletion = null;
        if (this.completed) {
            taskCompletion = "Completed!";
        }
        else {
            taskCompletion = "Incomplete.";
        }

        return "ID: " + this.id + this.description + " Task Progress:  " + taskCompletion;
    }

    public void setCompletion(boolean completed) {
        this.completed = completed;
    }
}
