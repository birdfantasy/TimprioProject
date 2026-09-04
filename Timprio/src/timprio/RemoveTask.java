/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;

import java.util.InputMismatchException;
import java.util.List;
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
    
    
    public void removeTask(List <Task> tasks, int index) {
        int i=1;
        
        if (index>=1 && index<tasks.size()+1) {
            tasks.remove(index);
        }

    }
    
    public int getRemoveIndex() {
        int remove = -5;
        while (true) {
            if (remove>=-1) {
                break;
            }
                        
            try {
                remove = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("     Invalid input, please try again:");
                scan.nextLine();
            }
        }
        return remove;
    }
    
}
