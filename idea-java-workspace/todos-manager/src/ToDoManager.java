import model.Task;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ToDoManager {

    Queue<Task> taskQueue;
    Stack<Task> completedTask;

    public ToDoManager(){
        this.taskQueue = new LinkedList<>();
        this.completedTask = new Stack<>();
    }

    public void addNewTask(Task task){
        taskQueue.offer(task);
        System.out.println("Task Added : "+task);
    }

    public void processTasks(){
        while (!taskQueue.isEmpty()){
            Task task = taskQueue.poll();
            System.out.println("Processing Task : "+task.description());
            Task completed = completedTask.push(new Task(task.description(), task.duration(),"Completed"));
            System.out.println("Task Completed : "+completed);
        }
    }

    public void showCompletedTask(){
        System.out.println("Completed Tasks : ");
        for (Task task:completedTask){
            System.out.println(task);
        }
    }


    public static void main(String[] args) {
        ToDoManager toDoManager = new ToDoManager();
        toDoManager.addNewTask(new Task("Learn Java",10));
        toDoManager.addNewTask(new Task("Gain Weight",30));
        toDoManager.addNewTask(new Task("Learn React JS",45));
        toDoManager.addNewTask(new Task("Learn Swimming",30));

        toDoManager.processTasks();

        toDoManager.showCompletedTask();

    }

}
