//Stores the name of the user and their to-do list (a single linked list of tasks).
//Includes methods to add a task, mark a task as completed, and print all tasks.

import java.util.ArrayList;

public class User {
    protected int id;
    protected String name;
    protected static int serial = 1;
    protected ArrayList<Task> tasks;

    //Constructors
    public User(String name) {
        this.id = serial++;
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Task> getTasks() {
        return this.tasks;
    }
}
