import java.util.ArrayList;

public class TaskList {
    ArrayList<Task> tasks = new ArrayList<Task>();

    //Constructor
    public TaskList() {
        tasks = new ArrayList<>();
        }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}

