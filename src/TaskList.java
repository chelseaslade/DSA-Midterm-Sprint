//Represents the to-do list for a user.
//Includes methods to add a task, mark a task as completed, and print all tasks.

public class TaskList {
    protected class Node {
        Task task;
        Node next;

        protected Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    protected Node head;
    public TaskList() {
        head = null;
    }

    public void addTask(Task task) {
        Node addedNode = new Node(task);
        if (head == null) {
            head = addedNode;
        }
        else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = addedNode;
        }
    }

    public void removeTask(Task task) {}

    public Task getTask(int index) {
        return null;
    }

    public void getAllTasks() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.next;
        }
    }

    public void markCompleted() {

    }
}

