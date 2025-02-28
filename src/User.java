//Stores the name of the user and their to-do list (a single linked list of tasks).
//Includes methods to add a task, mark a task as completed, and print all tasks.

public class User {
    protected int id;
    protected String name;
    protected static int serial = 1;;
    protected TaskList userTasks = new TaskList();

    //Constructors
    public User(String name) {
        this.id = serial++;
        this.name = name;
        this.userTasks = new TaskList();
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

    public void addTask(Task task) {
        this.userTasks.addTask(task);
    }

    public void markCompleted(Task task) {
        userTasks.markCompleted(task);
    }

    public void printTaskList() {
        System.out.println(userTasks);
    }
}
