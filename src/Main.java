import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Inits
        Scanner sc = new Scanner(System.in);
        User testUser = new User("johnnyDoe");

        //Loop
        boolean mainLoop = true;

        //Menu
        while (mainLoop) {
            System.out.println("To-Do List Manager");
            System.out.println("1. Add User");
            System.out.println("2. Select Existing User");
            System.out.println("3. Exit");

            switch (sc.nextInt()) {
                //Add User
                case 1: {
                    System.out.println("Enter a unique username");
                    String username = sc.next();
                    User newUser = new User(username);
                    break;
                }
                //Login and access user menu
                case 2: {
                    System.out.println("Enter username: ");
                    String username = sc.next();

                    //User Menu Loop
                    boolean userLoop = true;
                    while (userLoop) {

                        System.out.println("User Menu: ");
                        System.out.println("1. Add Task");
                        System.out.println("2. View Existing Tasks");
                        System.out.println("3. Logout");

                        switch (sc.nextInt()) {
                            case 1:
                            {
                                System.out.println("Describe your task: ");
                                String description = sc.next();

                                break;

                            }
                            case 2:
                            {
                                System.out.println("Current Tasks for" + username + ": ");

                                break;

                            }
                            case 3:
                            {
                                userLoop = false;
                            }
                        }
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