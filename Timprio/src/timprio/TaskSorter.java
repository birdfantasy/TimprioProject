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
    
    public int chooseOrder(TaskManager manager, int type) {
        int order=0;
        
        while (true) {
            
            try {
                order = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.print("     Invalid input. ");
                scan.nextLine();
            }
            
            switch (order) {
                case 1 -> {
                    //sort by ascending
                    if (type==1) {
                        manager.sortPriority(true);
                    } else if (type==2) {
                        manager.sortTime(true);
                    }
                    return order;
                }
                case 2 -> {
                    //sort by descending
                    if (type==1) {
                        manager.sortPriority(false);
                    } else if (type==2) {
                        manager.sortTime(false);
                    }
                    return order;
                }
                default -> System.out.println("     Please, 1 or 2:");
            }
            
           
        }
        
        //return order;
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
