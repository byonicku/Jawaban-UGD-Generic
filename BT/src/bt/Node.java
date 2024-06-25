/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author ASUS
 */
public class Node<T> {
    public T data;
    public Node<T> left;
    public Node<T> right;
    
    public Node (T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
