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
public class Menu {
    private Scanner scan;
    
    public Menu(Scanner scan) {
        this.scan = scan;
    } 
    
    
    
    public void displayMenu() {
        
        System.out.println();
        System.out.println("\t~~~ TIMPRIO ~~~");
        System.out.println("1. I want to add a task");
        System.out.println("2. I have completed a task");
        System.out.println("3. View my tasks");
        System.out.println("4. Sort my tasks by priority");
        System.out.println("5. Sort my tasks by time");
        System.out.println("6. SAVE \t 7. EXIT");
    }
    
    
    public int getIntInput() {
        int input=0;
        System.out.println("Your Input: ");
        
        while (true) {
            if (input >0) {
                break;
            }
            try {
                input = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again:");
                scan.nextLine();
            }
        }
        return input;
        
    }
    
    
}
