package main;

import controller.TaskController;
import view.TaskView;

public class Main {
    public static void main(String[] args) {
        // Initialize View and Controller
        TaskView view = new TaskView();
        TaskController controller = new TaskController(view);

        // Add tasks
        controller.addTask("Design MVC", "Design the MVC structure for a Task app.");
        controller.addTask("Implement Task", "Implement Task class and test it.");
        
        // Display all tasks
        controller.displayAllTasks();
        
        // Update a task
        controller.updateTask(1, "Design MVC Pattern", null);
        
        // Display single task
        controller.displayTaskById(1);
        
        // Mark a task as complete
        controller.markTaskComplete(2);
        
        // Display all tasks again
        controller.displayAllTasks();
    }
}
