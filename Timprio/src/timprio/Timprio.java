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
        
        Menu menu = new Menu(scan);
        TaskManager taskManager = new TaskManager();
        InputTask inputTask = new InputTask(scan);
        RemoveTask removeTask = new RemoveTask(scan);
        TasksDisplay taskDisplay = new TasksDisplay();
        TaskSorter taskSorter = new TaskSorter(scan);
        FileManager fileManager = new FileManager();
        int input;
        /*
        //TESTING TASKS
            t.addTask(new Task("test name 1", 40, 'A'));
            t.addTask(new Task("test name 2", 120 , 'B'));
            t.addTask(new Task("test name 3", 20, 'C'));
        */
        fileManager.loadFromFile("tasks.txt", taskManager);
        do {
            menu.displayMenu();


            input = menu.getIntInput();

            switch (input) {
                case 1: // ADD A TASK

                    //making the task
                    Task task = inputTask.createTask();
                    taskManager.addTask(task);

                    //display and save
                    taskDisplay.displayTasks(taskManager);
                    fileManager.saveToFile("tasks.txt", taskManager);
                    System.out.println("");
                    menu.returnToMenu();
                    break;


                case 2: // REMOVE A TASK

                    // display tasks based on index
                    taskDisplay.displayTaskIndex(taskManager);

                    //ask for desired index to remove
                    System.out.println("What task would you like to remove?\ninput Index");
                    int remove = removeTask.getRemoveIndex();
                    
                    //removeTask(index);
                    taskManager.removeTask(remove);
                    
                    //display and save
                    taskDisplay.displayTasks(taskManager);
                    fileManager.saveToFile("tasks.txt", taskManager);
                    System.out.println("");
                    menu.returnToMenu();
                    
                    break;


                case 3: //VIEWING THE TASKS

                    // Load tasks from the file
                    fileManager.loadFromFile("tasks.txt", taskManager);

                    // Display the loaded tasks
                    taskDisplay.displayTasks(taskManager);
                    menu.returnToMenu();
                    break;


                case 4: //SORT BY PRIORITY

                    int priorityOrder;

                    // choose ascending or descending
                    System.out.println("In what order of priority would you like to sort your tasks?\n1. Ascending\n2. Descending\nUser input: ");
                    priorityOrder = taskSorter.chooseOrder(taskManager, 1);

                    // display
                    taskDisplay.displayTasks(taskManager);
                    System.out.println("");
                    menu.returnToMenu();
                    break;



                case 5: //SORT BY TIME
                    int timeOrder;

                    // choose ascending or descending
                    System.out.println("In what order of time would you like to sort your tasks?\n1. Ascending\n2. Descending\nUser input: ");
                    timeOrder = taskSorter.chooseOrder(taskManager, 2);

                    // display
                    taskDisplay.displayTasks(taskManager);
                    System.out.println("");
                    menu.returnToMenu();
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
