/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;
import java.util.*;

/**
 *
 * @author Fatem
 */
public class TaskManager {
    Scanner scan;
    
    private List<Task> tasks = new ArrayList<>();
    private TaskSorter sorter;
    private RemoveTask remover;

    public TaskManager() {
        this.scan = scan;
        sorter = new TaskSorter(scan);
        remover = new RemoveTask(scan);
    }
    
    //creating tasks
    public void addTask(Task task) {
        tasks.add(task);     
    }
    
    
    //sort by priority
    public void sortPriority(boolean order) {
        sorter.sortPriority(tasks, order);
    }
    
    //sort by time
    public void sortTime(boolean order) {
        sorter.sortTime(tasks, order);
    }
    
    //remove a task
    public void removeTask(int index) {
        remover.removeTask(tasks, index);
    }
    
    public List<Task> getTasks() {
        return tasks;
    }
    
    //for File I/O
    public void clearTasks() {
        tasks.clear();
    }
    
}
