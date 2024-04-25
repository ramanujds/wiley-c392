package models;
/**
 * Task
 */
public class Task {

    private String description;
    private int duration;
    public enum Status {
        PENDING, COMPLETED
    }
    private Status status;
    
    public Task(String description, int duration) {
        this.description = description;
        this.duration = duration;
        this.status = Status.PENDING;
    }

    // getter and setter 
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}