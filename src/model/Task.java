package model;

public class Task {
    private int id;
    private String title;
    private String description;
    private boolean completed;

    // Constructor
    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markComplete() {
        this.completed = true;
    }

    // Display task details
    @Override
    public String toString() {
        String status = completed ? "Completed" : "Pending";
        return "Task ID: " + id + "\nTitle: " + title + "\nDescription: " + description + "\nStatus: " + status + "\n";
    }
}
