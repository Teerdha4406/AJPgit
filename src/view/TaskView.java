package view;

import model.Task;
import java.util.List;

public class TaskView {
    // Show a single task
    public void displayTask(Task task) {
        System.out.println(task.toString());
    }

    // Show a list of tasks
    public void displayTaskList(List<Task> tasks) {
        System.out.println("Task List:");
        for (Task task : tasks) {
            System.out.println(task.toString());
            System.out.println("--------------------");
        }
    }

    // Show a message
    public void showMessage(String message) {
        System.out.println(message);
    }
}
