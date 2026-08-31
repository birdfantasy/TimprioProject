/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;

import java.util.Scanner;

/**
 *
 * @author Fatem
 */
public class InputTask {
    private Scanner scan;
    
    public InputTask(Scanner scan) {
        this.scan = scan;
    }
    
    public Task createTask() {
        String name;
        int tim;
        char prio;
        
        // input a name of task
        System.out.println("What is your task? \nYour input: ");
        name = scan.nextLine();
        
        //input time expect
        System.out.println("How many minutes do you estimate that it will take you?\nYour input: ");
        tim = scan.nextInt();
        scan.nextLine();
                                
        //input priority A is hightest-C is lowest
        System.out.println("From A being the hightest, to C the lowest, what is the level of priority of this task?\nYour input: ");
        prio = scan.nextLine().charAt(0);
                
        //making the task
        return new Task(name, tim, prio);
            
    }
}
