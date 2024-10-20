import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add task");
            System.out.println("2. Mark task as complete");
            System.out.println("3. Mark task as incomplete");
            System.out.println("4. Update task");
            System.out.println("5. Delete task");
            System.out.println("6. View all tasks");
            System.out.println("7. View complete tasks");
            System.out.println("8. View incomplete tasks");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    break;
                case 2:
                	taskList.printTodo();
                	if(taskList.tasks.size() > 0) {
                		System.out.println("\nWhich task should be marked complete? ");
                		int taskNum = scanner.nextInt();
                		scanner.nextLine();
                		taskList.completeTask(taskNum);
                	}
                	break;
                case 3:
                	taskList.printComplete();
                	if(taskList.tasks.size() > 0) {
                		System.out.println("\nWhich task should be marked incomplete? ");
                		int taskNum = scanner.nextInt();
                		scanner.nextLine();
                		taskList.uncompleteTask(taskNum);
                	}
                	break;
                case 4:
                	taskList.printFullList();
                	if(taskList.tasks.size() > 0) {
                		System.out.println("\nWhich task should be updated? ");
                		int taskNum = scanner.nextInt();
                		scanner.nextLine();
                		System.out.println("\nInput new description: ");
                		String newDesc = scanner.nextLine();
                		taskList.editTask(taskNum, newDesc);
                	}
                	break;
                case 5:
                	taskList.printFullList();
                	if(taskList.tasks.size() > 0) {
                		System.out.println("Which task should be deleted? ");
                		int taskNum = scanner.nextInt();
                		scanner.nextLine();
                		taskList.deleteTask(taskNum);
                	}
                	break;
                case 6:
                	System.out.println("Task list:");
                	taskList.printFullList();
                	break;
                case 7:
                	System.out.println("Complete Tasks:");
                	taskList.printComplete();
                	break;
                case 8:
                	System.out.println("Incomplete Tasks:");
                	taskList.printTodo();
                	break;
                case 9:
                	System.out.print("Exiting");
                	scanner.close();
                	return;
                default:
                	System.out.println("Invalid action");
            }
        }
    }
}