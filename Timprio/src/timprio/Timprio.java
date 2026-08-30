/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timprio;

import java.util.Scanner;

/**
 *
 * @author Fatem
 */
public class Timprio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        TaskManager t = new TaskManager();
        int input;
        
        //TESTING TASKS
        t.addTask(new Task("make tasks input/output on a txt.file", 40, 'A'));
        t.addTask(new Task("make a removeTask() function", 120 , 'B'));
        t.addTask(new Task("writing", 20, 'C'));
        
        
        
        
        System.out.println("~~~ TIMPRIO ~~~");
        System.out.println("1. I want to add a task");
        System.out.println("2. I have completed a task");
        System.out.println("3. View my tasks");
        System.out.println("4. Sort my tasks by priority");
        System.out.println("5. Sort my tasks by time");
        System.out.println("6. SAVE \t 7. EXIT");
        
        System.out.println("Your Input: ");
        input = scan.nextInt();
        
        switch (input) {
            case 1: // ADD A TASK
                
                String name;
                int tim;
                char prio;
                
                // input a name of task
                System.out.println("What is your task? \nYour input: ");
                name = scan.nextLine();
                scan.nextLine();
                
                //input time expect
                System.out.println("How many minutes do you estimate that it will take you?\nYour input: ");
                tim = scan.nextInt();
                scan.nextLine();
                                
                //input priority A is hightest-C is lowest
                System.out.println("From A being the hightest, to C the lowest, what is the level of priority of this task?\nYour input: ");
                prio = scan.nextLine().charAt(0);
                
                //making the task
                t.addTask(new Task(name, tim, prio));
                
                t.displayTasks();
                break;
                
                
            case 2: // REMOVE A TASK
                
                int remove;
                
                t.displayTaskindex();
                
                //ask for desired index to remove
                System.out.println("What task would you like to remove?\ninput Index");
                
                //remove that task of desired index
                remove = scan.nextInt();
                scan.nextLine();
                
                //removeTask(index);
                t.removeTask(remove);
                t.displayTasks();
                break;
                
                
            case 3: //VIEWING THE TASKS
                t.displayTasks();
                break;
                
                
            case 4: //SORT BY PRIORITY
                
                int priorityOrder;
                
                // choose ascending or descending
                System.out.println("In what order of priority would you like to sort your tasks?\n1. Ascending\n2. Descending\nUser input: ");
                priorityOrder = scan.nextInt();
                
                // sorting
                if (priorityOrder==1) { //sort by ascending
                    t.sortPriority(true);
                } else if (priorityOrder==2) { //sort by descending
                    t.sortPriority(false);
                }
               
                // displayTasks();
                t.displayTasks();
                
                break;

                
                
            case 5: //SORT BY TIME
                int timeOrder;
                
                // choose ascending or descending
                System.out.println("In what order of time would you like to sort your tasks?\n1. Ascending\n2. Descending\nUser input: ");
                timeOrder = scan.nextInt();
                
                //sorting
                if (timeOrder==1) { // sort by ascending
                    t.sortTime(false);
                } else if (timeOrder==2) { //sort by descending
                    t.sortTime(true);
                }
                
                // displayTasks();
                t.displayTasks();
                
                break;
                
                
            case 6: //save to file
                //save method
                break;
            
        } while (input!=7);
        

        
    }
    
}
