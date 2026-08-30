/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author Fatem
 */
public class TaskManager {
    
    private List<Task> tasks = new ArrayList<>();
    
    //creating tasks
    public void addTask(Task task) {
        tasks.add(task);
    }
    
    
    //sort by priority
    public void sortPriority(boolean order) {
        if (order) {
            tasks.sort((a,c) -> a.getPriority() - c.getPriority());
        } else {
            tasks.sort((a,c) -> c.getPriority() - a.getPriority());
        }
    }
    
    //sort by time
    public void sortTime(boolean order) {
        if (order) {
            tasks.sort((a, b) -> Integer.compare(a.getTime(), b.getTime()));
        } else {
            tasks.sort((a, b) -> Integer.compare(b.getTime(), a.getTime()));
        }
    }
    
    
    //showing tasks
    public void displayTasks() {
        System.out.println("Priority: \tTask:\t\tEstimated Time:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    
    public void displayTaskIndex() {
        //System.out.println("Index\tTask:");
        int i=0;
        for (Task task : tasks) {
            System.out.println(i+". " + task.getName());
            i++;
        }
    }
    
    
    //remove a task
    public void removeTask(int index) {
        int i=0;
        for (Task task : tasks) {
            
            if (i==index) {
                tasks.remove(i);
            }
            
            i++; 
            
        }
    }
    
    //FILE I/O
    public void saveToFile(String fileName) { // File input

        try {
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));

            for (Task task : tasks) {
                writer.println(task.getName() + "," +
                               task.getTime() + "," +
                               task.getPriority());
            }

            writer.close();

            System.out.println("Tasks saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
    public void loadFromFile(String fileName) { // File output

        tasks.clear();

        try {

            Scanner fileScanner = new Scanner(new File(fileName));

            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();

                String[] data = line.split(",");

                String name = data[0];
                int time = Integer.parseInt(data[1]);
                char priority = data[2].charAt(0);

                Task task = new Task(name, time, priority);

                tasks.add(task);
            }

            fileScanner.close();

            System.out.println("Tasks loaded successfully.");

        } catch (IOException e) {

            System.out.println("Error loading file.");
        }
    }
    
}
