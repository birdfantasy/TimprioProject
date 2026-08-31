/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Fatem
 */
public class FileManager {
    public void saveToFile(String fileName, TaskManager manager) { // File input

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {

            for (Task task : manager.getTasks()) {
                writer.println(task.getName() + "," +
                               task.getTime() + "," +
                               task.getPriority());
            }

            System.out.println("Tasks saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
    
    
    
    
    public void loadFromFile(String fileName, TaskManager manager) { // File output

        manager.clearTasks();

        try (Scanner fileScanner = new Scanner(new File(fileName))) {

            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();

                String[] data = line.split(",");

                String name = data[0];
                int time = Integer.parseInt(data[1]);
                char priority = data[2].charAt(0);

                Task task = new Task(name, time, priority);
                manager.addTask(task);
            }

            System.out.println("Tasks loaded successfully.");

        } catch (IOException e) {

            System.out.println("Error loading file.");
        }
    }
}
