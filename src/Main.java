import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Inits
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        System.out.println("Testing Classes & Methods: \n");
        User testUser = new User("johnnyDoe");
        Task testTask = new Task("Testing my tasks!");
        users.add(testUser);
        testUser.addTask(testTask);

        testUser.addTask(new Task("DSA Midterm Sprint"));
        testUser.printTaskList();
        testUser.markCompleted("DSA Midterm Sprint");
        testUser.printTaskList();

        //Loop
        boolean mainLoop = true;

        //Menu
        while (mainLoop) {
            System.out.println(" \n To-Do List Manager");
            System.out.println("1. Add User");
            System.out.println("2. Select Existing User");
            System.out.println("3. Exit");

            switch (sc.nextInt()) {
                //Add User
                case 1: {
                    System.out.println("Enter a unique username");
                    String username = sc.next();
                    User newUser = new User(username);
                    users.add(newUser);
                    break;
                }
                //Login and access user menu
                case 2: {
                    User loggedInUser = null;
                    System.out.println("Enter username: ");
                    String username = sc.next();

                    for (User user : users) {
                        if (user.getName().equals(username)) {
                            loggedInUser = user;
                            break;
                        }
                    }

                    if (loggedInUser != null) {
                        //User Menu Loop
                        boolean userLoop = true;
                        while (userLoop) {

                            System.out.println("User Menu: ");
                            System.out.println("1. Add Task");
                            System.out.println("2. View Existing Tasks");
                            System.out.println("3. Logout");

                            switch (sc.nextInt()) {
                                case 1: {
                                    System.out.println("Describe your task: ");
                                    String description = sc.next();

                                    Task task = new Task(description);
                                    loggedInUser.addTask(task);
                                    break;

                                }
                                case 2: {
                                    //Loop
//                                    boolean taskLoop = true;
//                                    while (taskLoop) {
                                        System.out.println("Current Tasks for" + username + ": ");
                                        loggedInUser.printTaskList();
//
//                                        System.out.println("Would you like to mark a task as marked as completed? (Y/N)");
//                                        String option = sc.next().toUpperCase();
//
//                                        if (option.equals("Y")) {
//                                            System.out.println("Enter Task ID: ");
//                                            int selectedID = sc.nextInt();
//                                        }
//                                        else if (option.equals("N")) {
//                                            taskLoop = false;
//                                        }
//                                    }

                                }
                                case 3: {
                                    userLoop = false;
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("User not found");
                    }
                }
                //Exit Program
                case 3: {
                    mainLoop = false;
                }
            }
        }
    }
}