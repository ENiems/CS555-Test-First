import org.junit.Test;
import static org.junit.Assert.*;

public class TaskListTest {

    @Test
    public void testAddAndCompleteTask() {
        // Add a task and verify it is incomplete by default
        TaskList taskList = new TaskList();
        taskList.addTask("Study for exam");
        // Verify the task is added and the list contains 1 task
        assertEquals(1, taskList.tasks.size());
        // Verify the task description
        assertEquals("Study for exam", taskList.tasks.get(0).getTask());
        // Verify the task is incomplete by default
        assertFalse(taskList.tasks.get(0).getStatus());
        //  Mark the task as complete
        
        ////// TASKS IN LIST ARE OFFSET BY 1 ////////////
        taskList.completeTask(1);
        // Verify the task is now marked as complete
        assertTrue(taskList.tasks.get(0).getStatus());
    }
    
    @Test
    public void testEditTask() {
        // Add a task
        TaskList taskList = new TaskList();
        taskList.addTask("Study for Exam");
        // Verify the task is added
        assertEquals(1, taskList.tasks.size());
        // Verify the task description
        assertEquals("Study for Exam", taskList.tasks.get(0).getTask());
        // Edit the task description
        taskList.editTask(1, "Study for CS-555 Exam");
        // Verify the updated task description
        assertEquals("Study for CS-555 Exam", taskList.tasks.get(0).getTask());
    }

    @Test
    public void testMultipleTaskDeletion() {
        // Add three tasks
        TaskList taskList = new TaskList();
        taskList.addTask("Study for Exam");
        taskList.addTask("Go for a run");
        taskList.addTask("Complete project");

        // Verify all tasks are added
        assertEquals(3, taskList.tasks.size());
        assertEquals("Study for Exam", taskList.tasks.get(0).getTask());
        assertEquals("Go for a run", taskList.tasks.get(1).getTask());
        assertEquals("Complete project", taskList.tasks.get(2).getTask());

        // Delete the second task
        taskList.deleteTask(2);
        // Verify the task list contains the correct remaining tasks
        assertEquals(2, taskList.tasks.size());
        assertEquals("Study for Exam", taskList.tasks.get(0).getTask());
        assertEquals("Complete project", taskList.tasks.get(1).getTask());

        // Delete the third task
        taskList.deleteTask(2);
        // Verify only the first task remains
        assertEquals(1, taskList.tasks.size());
        assertEquals("Study for Exam", taskList.tasks.get(0).getTask());

        // Delete the first task
        taskList.deleteTask(1);
        // Verify the task list is now empty
        assertEquals(0, taskList.tasks.size());
    }
    
    @Test
    public void testAddCompleteAndUncompleteTask() {
        // Add a task and verify it is incomplete by default
        TaskList taskList = new TaskList();
        taskList.addTask("Study for exam");
        // Verify the task is added and the list contains 1 task
        assertEquals(1, taskList.tasks.size());
        // Verify the task description
        assertEquals("Study for exam", taskList.tasks.get(0).getTask());
        // Verify the task is incomplete by default
        assertFalse(taskList.tasks.get(0).getStatus());
        //  Mark the task as complete
        
        ////// TASKS IN LIST ARE OFFSET BY 1 ////////////
        taskList.completeTask(1);
        // Verify the task is now marked as complete
        assertTrue(taskList.tasks.get(0).getStatus());
        
        // Now, mark task as not complete
        taskList.uncompleteTask(1);
        //Verify task is now marked as incomplete
        assertFalse(taskList.tasks.get(0).getStatus());
    }
    
    @Test
    public void testEmptyListErrors() {
    	TaskList taskList = new TaskList();
    	//Attempt to complete a non-existing task 1
    	taskList.completeTask(1);
    	//Check that task list remains empty afterwards
    	assertEquals(0, taskList.tasks.size());
    	//Attempt to mark a non-existing task 1 as to do
    	taskList.uncompleteTask(1);
    	//Check that task list remains empty afterwards
    	assertEquals(0, taskList.tasks.size());
    	//Attempt to edit a non-existing task 1
    	taskList.editTask(1, "Add an item to my to do list");
    	//Check that task list remains empty afterwards
    	assertEquals(0, taskList.tasks.size());
    }

}