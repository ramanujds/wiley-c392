import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import controllers.TaskManager;
import models.Task;

public class App {
    

    public static void main(String[] args) throws Exception {


        Task task1 = new Task("First Task ", 10);        
        Task task2 = new Task("Second Task ", 20);   
        Task task3 = new Task("Third Task ", 30);
        
        TaskManager taskManager=new TaskManager();
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        taskManager.processTask();
        taskManager.processTask();

        taskManager.displayCompletedTask();

      
    }
}
