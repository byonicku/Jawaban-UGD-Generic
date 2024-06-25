/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ll;

/**
 *
 * @author ASUS
 */
import org.junit.Test;

public class LLMethodTest extends junit.framework.TestCase {
    LinkedList<Integer> llint;
    LinkedList<String> llstr;
    
    public LLMethodTest() {
    }
    
    public void setUp(){
        llint = new LinkedList<>();
        llstr = new LinkedList<>();
        
        llint.insert(1);
        llint.insert(2);
        llint.insert(3);
        
        llstr.insert("Nico Herlim");
        llstr.insert("Carolus Seto Arianto");
    }
    
    @Test
    public void testInteger() {
        Node<Integer> head = llint.getHead();
        
        int i = 1;
        while(head != null) {
            assertTrue(head.data == i++);
            head = head.next;
        }
        
        assertTrue(true);
    }
    
    @Test
    public void testString() {
        Node<String> head = llstr.getHead();
        
        assertTrue(head.data.equalsIgnoreCase("Nico Herlim"));
        assertTrue(head.next.data.equalsIgnoreCase("Carolus Seto Arianto"));
    }
    
    @Test
    public void testEmpty() {
        llint = new LinkedList<>();
        llstr = new LinkedList<>();
        
        llint.insert(1);
        llint.insert(2);
        llint.insert(3);
        
        assertTrue(llint.getHead() != null);
        assertTrue(llstr.getHead() == null);
    }
}
