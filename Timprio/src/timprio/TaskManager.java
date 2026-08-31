/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author Fatem
 */
public class TaskManager {
    
    private List<Task> tasks = new ArrayList<>();
    private TaskSorter sorter = new TaskSorter();
    
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
        int i=0;
        
        if (index>=0 && index<tasks.size()) {
            tasks.remove(index);
        }
        
    }
    
    public List<Task> getTasks() {
        return tasks;
    }
    
    //for File I/O
    public void clearTasks() {
        tasks.clear();
    }
    
}
