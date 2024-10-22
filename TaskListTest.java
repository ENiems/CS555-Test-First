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


}

