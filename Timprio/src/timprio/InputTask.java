/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;

import java.util.InputMismatchException;
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
    
    public char scanCharInput() {
        char prio = scan.nextLine().charAt(0);
        
        if (prio!='A'&& prio!='a' && prio!='B' && prio!='b' && prio!='C' && prio!='c') {
            System.out.println("     Invalid input! Please try again:");
            prio = scanCharInput();
        } else if (prio=='a' || prio=='b' || prio=='c') {
            prio= Character.toUpperCase(prio);
        }
        
        return prio;
    }
    
    public Task createTask() {
        String name;
        int tim=0;
        char prio;
        
        // input a name of task
        System.out.println("     What is your task? \nYour input: ");
        name = scan.nextLine();
        
        //input time expect
        System.out.println("     How many minutes do you estimate that it will take you?\nYour input: ");
        
        while (true) {
            
            if (tim > 0) {
                break;
            }
            
            try {
                tim = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("     Invalid input, please input an integer:");
                scan.nextLine();
            }
        }
                                
        //input priority A is hightest-C is lowest
        System.out.println("     From A being the hightest, to C the lowest, what is the level of priority of this task?\nYour input: ");
        prio = scanCharInput();
        
        
        //making the task
        if (prio=='A') {
            return new TaskPriorityA(name,tim);
        } else if (prio=='B') {
            return new TaskPriorityB(name, tim);
        } else if (prio=='C'){
            return new TaskPriorityC(name, tim);
        } else {
            System.out.println("     Something went wrong...");
            return null;
        }
    }
}
