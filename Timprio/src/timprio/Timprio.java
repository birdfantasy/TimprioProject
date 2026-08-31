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
        
        Scanner scan = new Scanner(System.in);
        TaskManager t = new TaskManager();
        int input;
        
        /*
        //TESTING TASKS
        t.addTask(new Task("make tasks input/output on a txt.file", 40, 'A'));
        t.addTask(new Task("make a removeTask() function", 120 , 'B'));
        t.addTask(new Task("writing", 20, 'C'));
        */
        

        displayMenu();
        
        
        input = getInput();
        
        switch (input) { //ALL OF THESE COULD BE THEIR OWN METHODS
            case 1: // ADD A TASK
                
                //making the task
                Task task = input.createTask();
                t.addTask(task);
                
                System.out.println("");
                break;
                
                
            case 2: // REMOVE A TASK
                
                int remove;
                
                t.displayTaskIndex();
                
                //ask for desired index to remove
                System.out.println("What task would you like to remove?\ninput Index");
                
                //remove that task of desired index
                remove = scan.nextInt();
                scan.nextLine();
                
                //removeTask(index);
                t.removeTask(remove);
                t.displayTasks();
                System.out.println("");
                break;
                
                
            case 3: //VIEWING THE TASKS
                
                // Load tasks from the file
                t.loadFromFile("tasks.txt");

                System.out.println("Tasks loaded from file:");

                // Display the loaded tasks
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
                t.saveToFile("tasks.txt");
        
                System.out.println("Tasks have been saved.\n");
                break;
            
        } while (input!=7);
        

        
    }
    
}
