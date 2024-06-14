package TaskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<Task> tasklist;

    public TaskList() {
        this.tasklist = new ArrayList<>();
    }

    public void addTask(String description){
        tasklist.add(new Task(description));
    }

    public void deleteTask(String description){
        List<Task> taskToRemove = new ArrayList<>();
        for(Task task : tasklist){
            if(task.getDescription().equalsIgnoreCase(description)){
                taskToRemove.add(task);
            }
        }
    tasklist.removeAll(taskToRemove);
    }

    public int numberOfTasks(){
       return tasklist.size();
    };

    public void allTaskDescriptions(){
        System.out.println(tasklist.toString());
    };
}
