/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author ASUS
 */
import org.junit.Test;

public class BTMethodTest extends junit.framework.TestCase {
    BinaryTree<Integer> btInt;
    BinaryTree<String> btStr;

    public BTMethodTest() {
    }
    
    public void setUp() {
        btInt = new BinaryTree<>();
        btStr = new BinaryTree<>();
        
        btInt.insert(4);
        btInt.insert(2);
        btInt.insert(6);
        btInt.insert(1);
        btInt.insert(5);
        
        btStr.insert("CBA");
        btStr.insert("ABC");
        btStr.insert("CAB");
    }
    
    @Test
    public void testInt() {
        Node<Integer> root = btInt.getRoot();
        
        assertTrue(root.data == 4);
        assertTrue(root.left.data == 2);
        assertTrue(root.right.data == 6);
        assertTrue(root.left.left.data == 1);
        assertTrue(root.right.left.data == 5);
    }
    
    @Test
    public void testStr() {
        Node<String> root = btStr.getRoot();
        
        assertTrue(root.data.equalsIgnoreCase("CBA"));
        assertTrue(root.left.data.equalsIgnoreCase("ABC"));
        assertTrue(root.left.right.data.equalsIgnoreCase("CAB"));
    }
    
    @Test
    public void testEmpty() {
        btInt = new BinaryTree<>();
        btStr = new BinaryTree<>();
        
        btInt.insert(4);
        btInt.insert(2);
        btInt.insert(6);
        btInt.insert(1);
        btInt.insert(5);
        
        assertTrue(btInt.getRoot() != null);
        assertTrue(btStr.getRoot() == null);
    }
}
