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
public class TasksDisplay implements Displayable {
    
    @Override
    public void displayTasks(TaskManager manager) {
        System.out.println("                               ~~~ SCHEDULE ~~~");
        System.out.println("      Priority                        Task                        Estimated Time  ");
        System.out.println("     ---------- ------------------------------------------------ ----------------- ");
        for (Task task : manager.getTasks()) {
            
            System.out.printf("      %-10s %-48s %d''\n", task.getPriority(), task.getName(), task.getTime());
            //System.out.println(task);
            
            
            
            
            
            
        }

    }
    
    @Override
    public void displayTaskIndex(TaskManager manager) {
        //System.out.println("Index\tTask:");
        int i=0;
        System.out.println("      Index:\t                      Task:");
        System.out.println("     ---------- ------------------------------------------------");
        for (Task task : manager.getTasks()) {
            System.out.println("     "+i+". \t\t\t" + task.getName());
            i++;
        }
    }
    
    /*
        public void displayBasedOnPriority(TaskManager manager, char prio) {
            System.out.println("\t   ~~~ SCHEDULE ~~~");
            System.out.println("Priority: \tTask:\t\tEstimated Time:");
            for (Task task : manager.getTasks()) {
                if (task.getPriority()==prio) {
                    System.out.println(task);
                }
            }
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        }
    */
    
}
