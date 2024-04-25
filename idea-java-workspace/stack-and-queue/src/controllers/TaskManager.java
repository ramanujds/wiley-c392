package controllers;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import models.Task;

public class TaskManager {

    private Queue<Task> taskQueue = new ArrayDeque<>();
    private Stack<Task> completedTaskStack = new Stack<>();

    public void addTask(Task task) {
        taskQueue.add(task);
    }

    public void completeTask() {
        Task task = taskQueue.poll();
        task.setStatus(Task.Status.COMPLETED);
        completedTaskStack.push(task);
    }

    public void processTask() {
        Task task = taskQueue.peek();
        System.out.println("Processing task: " + task.getDescription());
        completeTask();
    }

    public void displayCompletedTask() {
        for (Task task : completedTaskStack) {
            System.out.println(task.getDescription());
        }
    }

}
