//Represents the to-do list for a user.
//Includes methods to add a task, mark a task as completed, and print all tasks.

public class TaskList {
    protected static class Node {
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

    public void removeTask(Task task) {
        Node removedNode = head;
        while (removedNode.next != null) {
            if (removedNode.task.equals(task)) {
                removedNode.next = null;
            }
            else {
                removedNode = removedNode.next;
            }
        }
    }

    public Task getTask(int index) {
        Task selectedTask = null;
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        selectedTask = currentNode.task;
        System.out.println(selectedTask);
        return selectedTask;
    }

    public void getAllTasks() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.next;
        }
    }

    public void markCompleted(Task task) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.task.equals(task)) {
                currentNode.task.setCompletion(true);
                System.out.println("Task marked as complete!");
                return;
            }
            currentNode = currentNode.next;
            System.out.println("Could not find selected task.");
        }
    }
}

