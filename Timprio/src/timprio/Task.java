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

//git test commment
public class Task {

    private String name;
    private int time;
    private char priority;
  
    
    
    // Constructor
    public Task(String name, int time, char priority) {
        this.name = name;
        this.time = time;
        this.priority = priority;
    }

    // Get and methods for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // Get and methods for time
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    // Get and set methods for priority
    public char getPriority() {
        return priority;
    }
    public void setPriority(char priority) {
        this.priority = priority;
    }
    
    
    

    public String toString() {
        return this.getPriority() + "\t\t" + this.getName() + "\t\t" + this.getTime() +"''";
    }
}
