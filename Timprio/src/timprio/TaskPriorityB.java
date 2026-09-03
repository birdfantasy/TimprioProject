/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;

/**
 *
 * @author Fatem
 */
public class TaskPriorityB extends Task {
    
    public TaskPriorityB(String name, int time) {
        super(name, time, 'B');
    }
    
    @Override
    public String getType() {
        return "Task Priority: Normal.";
    }
    

}
