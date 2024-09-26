package to_do_list;

import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while(running) {
            System.out.println("\nChoose and option: ");
            System.out.println("1. Add Task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark as complete");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("----->");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1: 
                    System.out.println("Enter task description");
                    String des = scanner.nextLine();
                    toDoList.addTask(des);
                    break;
                
                case 2:                    
                    toDoList.viewTasks();
                    break;
                case 3:
                    System.out.print("Enter task number to mark complete: ");
                    int n = scanner.nextInt();
                    toDoList.markAsCompleted(n-1);
                    break;
                
                case 4:
                    System.out.println("Enter task number to delete:");
                    int deleteNumber = scanner.nextInt();
                    toDoList.deleteTask(deleteNumber - 1);
                    break;
                
                case 5:
                    running = false;
                    break;
                
                default:
                    System.out.println("Invalid option");                
                
            }


        }

        scanner.close();

    }
}
