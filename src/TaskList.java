//Represents the to-do list for a user.
//Includes methods to add a task, mark a task as completed, and print all tasks.

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

    public void addTask(Task task) {
        tasks.add(task);
    }
}

