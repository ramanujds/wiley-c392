package model;

public record Task(String description, int duration, String status) {

    public Task(String description, int duration){
        this(description,duration,"Pending");
    }

}
