/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ll;

/**
 *
 * @author ASUS
 */
public class LLR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // List Rekursif
        LinkedListRecursive<Integer> listR = new LinkedListRecursive<>();        
        listR.insert(1);
        listR.insert(2);
        listR.insert(3);
        listR.print();        
        listR.empty();
        
        LinkedListRecursive<String> stringListR = new LinkedListRecursive<>();        
        stringListR.empty();        
        stringListR.insert("Nico Herlim");
        stringListR.insert("Carolus Seto Arianto");
        stringListR.print();
        stringListR.empty();
    }
    
}
