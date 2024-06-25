/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt;

/**
 *
 * @author ASUS
 * @param <T>
 */
public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;
    
    public BinaryTree() {
        this.root = null;
    }
    
    public void insert(T data) {
         if (this.root == null) {
             root = new Node<>(data);
             return;
         }

         insert(this.root, data);
    }
    
    public void insert(Node<T> root, T data) {
        if (data.compareTo(root.data) < 0) {
            if (root.left == null)
                root.left = new Node<>(data);
            else
                insert(root.left, data);
        } else {
            if (root.right == null)
                root.right = new Node<>(data);
            else
                insert(root.right, data);
        }
    }
    
    public void empty() {
        if (this.root == null)
            System.out.println("Tree is empty...");
        else
            System.out.println("Tree is not empty...");
    }
    
    public void print() {
        print(this.root);
        System.out.println();
    }
    
    public void print(Node<T> root) {
        if (root == null)
            return;
        
        if (root.left != null)
            print(root.left);
        
        System.out.print(root.data + " ");
        
        if (root.right != null)
            print(root.right);
    }

    public Node<T> getRoot() {
        return root;
    }
}
