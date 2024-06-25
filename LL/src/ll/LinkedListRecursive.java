/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ll;

/**
 *
 * @author ASUS
 */
public class LinkedListRecursive<T> {
    private Node<T> head;
    private int length;
    
    public LinkedListRecursive() {
        this.head = null;
        this.length = 0;
    }
    
    public void insert(T data) {
        if (this.head == null) {
            this.head = new Node<>(data);
            this.length++;
            return;
        }
            
        insert(data, head);
    }
    
    public void insert(T data, Node<T> head) {
        if (head.next == null) {
            head.next = new Node<>(data);
            this.length++;
            return;
        }
        
        insert(data, head.next);
    }
    
    public void empty() {
        if (this.length == 0)
            System.out.println("List is empty...");
        else
            System.out.println("List is not empty...");
    }
    
    public void print() {
        print(head);
    }
    
    public void print(Node<T> head) {
        if (head == null) {
            System.out.println();
            return;
        }
            
        System.out.print(head.data);
            
        if (head.next != null)
           System.out.print(" -> ");
        
        print(head.next);
    }

    public Node<T> getHead() {
        return head;
    }
}
