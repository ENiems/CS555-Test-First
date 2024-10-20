public class Task {
	private String description; //Description of task
	private boolean status; //Completion status of task
	
	public Task(String input) {
		this.description = input; //Sets description as input
		this.status = false; //By default status is false for incomplete
	}
	
	public String getTask() {
		return description;
	}
	public void setTask(String input) {
		this.description = input;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean input) {
		status = input;
	}
}
