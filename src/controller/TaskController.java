package controller;

import model.Task;
import view.TaskView;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> tasks; // List to hold tasks
    private TaskView view;
    private int taskIdCounter = 1;

    // Constructor
    public TaskController(TaskView view) {
        this.tasks = new ArrayList<>();
        this.view = view;
    }

    // Add a new task
    public void addTask(String title, String description) {
        Task task = new Task(taskIdCounter++, title, description);
        tasks.add(task);
        view.showMessage("Task '" + title + "' has been added successfully.\n");
    }

    // Update a task
    public void updateTask(int id, String newTitle, String newDescription) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                if (newTitle != null) task.setTitle(newTitle);
                if (newDescription != null) task.setDescription(newDescription);
                view.showMessage("Task ID " + id + " has been updated.\n");
                return;
            }
        }
        view.showMessage("Task ID " + id + " not found.\n");
    }

    // Mark task as complete
    public void markTaskComplete(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markComplete();
                view.showMessage("Task ID " + id + " marked as complete.\n");
                return;
            }
        }
        view.showMessage("Task ID " + id + " not found.\n");
    }

    // Display all tasks
    public void displayAllTasks() {
        if (tasks.isEmpty()) {
            view.showMessage("No tasks available.\n");
        } else {
            view.displayTaskList(tasks);
        }
    }

    // Display a single task
    public void displayTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                view.displayTask(task);
                return;
            }
        }
        view.showMessage("Task ID " + id + " not found.\n");
    }
}
