/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt;

/**
 *
 * @author ASUS
 */
public class BT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<>();
        
        bt.insert(4);
        bt.insert(2);
        bt.insert(6);
        bt.insert(1);
        bt.insert(5);
        bt.print();
        bt.empty();
        
        BinaryTree<String> stringBT = new BinaryTree<>();
        
        stringBT.empty();
        stringBT.insert("CBA");
        stringBT.insert("ABC");
        stringBT.insert("CAB");
        stringBT.print();
    }   
}
