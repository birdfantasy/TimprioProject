/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Fatem
 */
public class TaskSorter implements Sortable{
    
    private Scanner scan;
    
    
    
    public TaskSorter(Scanner scan) {
        this.scan = scan;
    }
    
    public int chooseOrder(TaskManager manager) {
        int order=0;
        
        while (true) {
            
            if (order==1 || order==2) {
                break;
            }
            
            if (order==1) { //sort by ascending
                manager.sortPriority(true);
            } else if (order==2) { //sort by descending
                manager.sortPriority(false);
            }
            
            try {
                order = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please 1 or 2:");
                scan.nextLine();
            }
        }
        
        return order;
    }
    
    //sort by priority
    @Override
    public void sortPriority(List <Task> tasks, boolean order) {
        if (order) {
            tasks.sort((a,c) -> a.getPriority() - c.getPriority());
        } else {
            tasks.sort((a,c) -> c.getPriority() - a.getPriority());
        }
    }
    
    //sort by time
    @Override
    public void sortTime(List <Task> tasks, boolean order) {
        if (order) {
            tasks.sort((a, b) -> Integer.compare(a.getTime(), b.getTime()));
        } else {
            tasks.sort((a, b) -> Integer.compare(b.getTime(), a.getTime()));
        }
    }
    
}
