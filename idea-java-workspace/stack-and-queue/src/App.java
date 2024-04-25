import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import models.Task;

public class App {
    
    public void addTask(Queue<Task> taskQueue,Task task) {
        taskQueue.add(task);
    }
    public void completeTask(Queue<Task> taskQueue, Stack<Task> completedTaskStack) {
        Task task = taskQueue.poll();
        task.setStatus(Task.Status.COMPLETED);
        completedTaskStack.push(task);
    }
    public void processTask(Queue<Task> taskQueue, Stack<Task> completedTaskStack) {
        Task task = taskQueue.peek();
        System.out.println("Processing task: " + task.getDescription());
        completeTask(taskQueue, completedTaskStack);
    }
    public void displayCompletedTask(Stack<Task> completedTaskStack) {
        for (Task task : completedTaskStack) {
            System.out.println(task.getDescription());
        }
    }

    public static void main(String[] args) throws Exception {

        Queue<Task> taskQueue = new ArrayDeque<Task>();
        Stack<Task> completedTaskStack = new Stack<Task>();

        Task task1 = new Task("First Task ", 10);        
        Task task2 = new Task("Second Task ", 20);   
        Task task3 = new Task("Third Task ", 30);
        
        
        taskQueue.offer(task1);
        taskQueue.offer(task2);
        taskQueue.offer(task3);

        App app = new App();

        app.processTask(taskQueue, completedTaskStack);
        app.processTask(taskQueue, completedTaskStack);

        app.displayCompletedTask(completedTaskStack);

      
    }
}
