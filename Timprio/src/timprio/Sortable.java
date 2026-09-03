/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;

import java.util.List;

/**
 *
 * @author Fatem
 */
public interface Sortable {
    void sortPriority(List <Task> tasks, boolean order);
    void sortTime(List <Task> tasks, boolean order);
}
