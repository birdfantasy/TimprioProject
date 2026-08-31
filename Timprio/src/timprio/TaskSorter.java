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
public class TaskSorter {
    
    
    //sort by priority
    public void sortPriority(List <Task> tasks, boolean order) {
        if (order) {
            tasks.sort((a,c) -> a.getPriority() - c.getPriority());
        } else {
            tasks.sort((a,c) -> c.getPriority() - a.getPriority());
        }
    }
    
    //sort by time
    public void sortTime(List <Task> tasks, boolean order) {
        if (order) {
            tasks.sort((a, b) -> Integer.compare(a.getTime(), b.getTime()));
        } else {
            tasks.sort((a, b) -> Integer.compare(b.getTime(), a.getTime()));
        }
    }
    
}
