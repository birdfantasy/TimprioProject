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
public class RemoveTask {
    
    private Scanner scan;
    
    public RemoveTask(Scanner scan) {
        this.scan = scan;
    }
    

    
    public int getRemoveIndex() {
        int remove = -1;
        while (true) {
            if (remove>-1) {
                break;
            }
                        
            try {
                remove = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again:");
                scan.nextLine();
            }
        }
        return remove;
    }
    
}
