/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;
import java.util.List;
/**
 *
 * @author Fatem
 */
public class TasksDisplay {
    
    public void displayTasks(TaskManager manager) {
        System.out.println("\t   ~~~ SCHEDULE ~~~");
        System.out.println("Priority: \tTask:\t\tEstimated Time:");
        for (Task task : manager.getTasks()) {
            System.out.println(task);
        }
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
    }
    
    public void displayTaskIndex(TaskManager manager) {
        //System.out.println("Index\tTask:");
        int i=0;
        for (Task task : manager.getTasks()) {
            System.out.println(i+". " + task.getName());
            i++;
        }
    }
    
}
