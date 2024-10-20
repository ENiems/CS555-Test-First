import java.util.ArrayList;
import java.util.List;
public class TaskList {
	List<Task> tasks;
	public TaskList() {
		this.tasks = new ArrayList<>(); //Initialize task list
	}
	public void addTask (String description) { //Function for adding new tasks
		Task newTask = new Task(description);
		tasks.add(newTask);
		System.out.println("Task added!");
	}
	public void completeTask(int taskNum) { //Function for marking task as completed
		if(taskNum >= 1 && taskNum <= tasks.size()) { //Check if task number is valid
			tasks.get((taskNum - 1)).setStatus(true); //If valid marks completion status as true
			System.out.println("Task marked as complete!");
		} else {
			System.out.println("Invalid task number");
		}
	}
	public void uncompleteTask(int taskNum) { //Function for marking task as to do
		if(taskNum >= 1 && taskNum <= tasks.size()) { //Check if task number is valid
			tasks.get((taskNum - 1)).setStatus(false); //If valid marks completion status as false
			System.out.println("Task marked as to do!");
		} else {
			System.out.println("Invalid task number");
		}
	}
	public void deleteTask(int taskNum) { //Function for deleting tasks
		if(taskNum >= 1 && taskNum <= tasks.size()) { //Check if task number is valid
			tasks.remove(taskNum - 1); //Removes task
			System.out.println("Task deleted!");
		} else {
			System.out.println("Invalid task number");
		}		
	}
	public void editTask(int taskNum, String newDesc) { //Function for editing task description
		if(taskNum >= 1 && taskNum <= tasks.size()) { //Check if task number is valid
			tasks.get((taskNum - 1)).setTask(newDesc); //Updates with input description
			System.out.println("Task updated!");
		} else {
			System.out.println("Invalid task number");
		}
	}
	public void printFullList() { //Function for printing full list
		if(tasks.isEmpty()) {
			System.out.println("You currently have no tasks!");
		} else {
			for(int i=0;i<tasks.size();i++) {
				Task curr = tasks.get(i);
				System.out.print((i+1)+". " + curr.getTask());
				if(curr.getStatus()) { //Checks if task has been completed to print accordingly
					System.out.println(" - Complete!");
				} else {
					System.out.println(" - To Do");
				}
			}
		}
	}
	public void printTodo() { //Function for printing ONLY the incomplete tasks
		if(tasks.isEmpty()) {
			System.out.println("You currently have no tasks!");
		} else {
			for(int i=0;i<tasks.size();i++) {
				Task curr = tasks.get(i);
				if(!curr.getStatus()) {
					System.out.println((i+1)+". " + curr.getTask());
				}
			}
		}
	}
	public void printComplete() { //Function for printing ONLY the complete tasks
		if(tasks.isEmpty()) {
			System.out.println("You currently have no tasks!");
		} else {
			for(int i=0;i<tasks.size();i++) {
				Task curr = tasks.get(i);
				if(curr.getStatus()) {
					System.out.println((i+1)+". " + curr.getTask());
				}
			}
		}
	}
}
