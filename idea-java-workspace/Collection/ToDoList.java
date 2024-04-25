import java.util.*;

public class ToDoList {

    private static Stack<Task> stack = new Stack<>();

    private static Queue<Task> queue= new LinkedList<>();


    public static void addNewTask(Task task) {
        task.status="pending";
        queue.add(task);
    }


    public static void processTask(){
        while(!queue.isEmpty()){
            Task ts=queue.poll();
            System.out.println("Processing the task: "+ts.describtion);
            ts.status="completed";
            Task pus = stack.push(ts);
        }

    }

    private static void displayTask() {
        System.out.println("completed tasks: ");
        for(Task t:stack){
            if(t.status=="completed"){
                System.out.println(t.describtion);
            }
        }
    }
    public static void main(String[] args) {
        Task tsk1=new Task("Task1",2,"Started");
        addNewTask(tsk1);
        Task tsk2=new Task("Task2",2,"Started");
        addNewTask(tsk2);
        Task tsk3=new Task("Task3",2,"Started");
        addNewTask(tsk3);

        processTask();

        displayTask();

    }


}
