package to_do_list;

import java.util.ArrayList;

public class ToDoList{
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String description){
        tasks.add(new Task(description));
    }

    public void viewTasks(){
        for(int i = 0; i < tasks.size(); i++){
            System.out.println((i+1)+"."+tasks.get(i));
        }
    }

    public void markAsCompleted(int index){
        if ( index >=0 && index <= (tasks.size()-1)) {
            tasks.get(index).markAsCompleted();
        }
    }

    public void deleteTask(int index){
        if ( index >=0 && index <= (tasks.size()-1)) {
            tasks.remove(index);
        }
    }
}