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
        TaskManager taskManager = new TaskManager();
        Menu menu = new Menu(scan);
        InputTask inputTask = new InputTask(scan);
        TasksDisplay taskDisplay = new TasksDisplay();
        FileManager fileManager = new FileManager();
        int input;
        /*
        //TESTING TASKS
        t.addTask(new Task("make tasks input/output on a txt.file", 40, 'A'));
        t.addTask(new Task("make a removeTask() function", 120 , 'B'));
        t.addTask(new Task("writing", 20, 'C'));
        */
        
        do {
            menu.displayMenu();


            input = menu.getInput();

            switch (input) {
                case 1: // ADD A TASK

                    //making the task
                    Task task = inputTask.createTask();
                    taskManager.addTask(task);

                    taskDisplay.displayTasks(taskManager);
                    fileManager.saveToFile("tasks.txt", taskManager);
                    System.out.println("");
                    break;


                case 2: // REMOVE A TASK

                    int remove;

                    taskDisplay.displayTaskIndex(taskManager);

                    //ask for desired index to remove
                    System.out.println("What task would you like to remove?\ninput Index");

                    //remove that task of desired index
                    remove = scan.nextInt();
                    scan.nextLine();

                    //removeTask(index);
                    taskManager.removeTask(remove);
                    taskDisplay.displayTasks(taskManager);
                    System.out.println("");
                    break;


                case 3: //VIEWING THE TASKS

                    // Load tasks from the file
                    fileManager.loadFromFile("tasks.txt", taskManager);

                    // Display the loaded tasks
                    taskDisplay.displayTasks(taskManager);

                    break;


                case 4: //SORT BY PRIORITY

                    int priorityOrder;

                    // choose ascending or descending
                    System.out.println("In what order of priority would you like to sort your tasks?\n1. Ascending\n2. Descending\nUser input: ");
                    priorityOrder = scan.nextInt();

                    // sorting
                    if (priorityOrder==1) { //sort by ascending
                        taskManager.sortPriority(true);
                    } else if (priorityOrder==2) { //sort by descending
                        taskManager.sortPriority(false);
                    }

                    // displayTasks();
                    taskDisplay.displayTasks(taskManager);

                    break;



                case 5: //SORT BY TIME
                    int timeOrder;

                    // choose ascending or descending
                    System.out.println("In what order of time would you like to sort your tasks?\n1. Ascending\n2. Descending\nUser input: ");
                    timeOrder = scan.nextInt();

                    //sorting
                    if (timeOrder==1) { // sort by ascending
                        taskManager.sortTime(false);
                    } else if (timeOrder==2) { //sort by descending
                        taskManager.sortTime(true);
                    }

                    // displayTasks();
                    taskDisplay.displayTasks(taskManager);

                    break;


                case 6: //save to file
                    //save method
                    fileManager.saveToFile("tasks.txt", taskManager);

                    System.out.println("Tasks have been saved.\n");
                    break;
                    
                case 7: //EXIT
                    System.out.println("Closing...");
                    break;
                    
                default:
                    System.out.println("Invalid input.");
                    break;

            } 
        } while (input!=7);
        
        scan.close();
        

        
    }
    
}
