/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ll;

/**
 *
 * @author ASUS
 */
public class LinkedList<T> {
    private Node<T> head;
    private int length;
    
    public LinkedList() {
        this.head = null;
        this.length = 0;
    }
    
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        this.length++;
        
        if (this.head == null) {
            this.head = newNode;
            return;
        }
            
        Node<T> tmp = this.head;
        
        while (tmp.next != null)
            tmp = tmp.next;
        
        tmp.next = newNode;
    }
    
    public void empty() {
        if (this.length == 0)
            System.out.println("List is empty...");
        else
            System.out.println("List is not empty...");
    }
    
    public void print() {
        Node<T> tmp = this.head;
        
        if (tmp == null)
            return;
                
        while (tmp != null) {
            System.out.print(tmp.data);
            
            if (tmp.next != null)
                System.out.print(" -> ");
            
            tmp = tmp.next;
        }
        
        System.out.println();
    }

    public Node<T> getHead() {
        return head;
    }
}
