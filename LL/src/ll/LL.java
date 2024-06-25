/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ll;

/**
 *
 * @author ASUS
 */
public class LL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // List Iteratif
        LinkedList<Integer> list = new LinkedList<>();        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.print();        
        list.empty();
        
        LinkedList<String> stringList = new LinkedList<>();        
        stringList.empty();        
        stringList.insert("Nico Herlim");
        stringList.insert("Carolus Seto Arianto");
        stringList.print();
        stringList.empty();
    }
    
}
