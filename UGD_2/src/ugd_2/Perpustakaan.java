/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_2;

/**
 *
 * @author ASUS
 */

import java.util.List;

public class Perpustakaan <X, Y> {
    private String namaPerpus;
    private List<X> listDataX;
    private List<Y> listDataY;

    public Perpustakaan(String namaPerpus, List<X> listDataX, List<Y> listDataY) {
        this.namaPerpus = namaPerpus;
        this.listDataX = listDataX;
        this.listDataY = listDataY;
    }

    public void addX(X data) {
        listDataX.add(data);
    }
    
    public void addY(Y data) {
        listDataY.add(data);
    }
    
    public List<X> getX() {
        return listDataX;
    }
    
    public List<Y> getY() {
        return listDataY;
    }
    
    public void printX() {
        for (X data : listDataX) {
            System.out.println(data);
        }
    }
    
    public void printY() {
        for (Y data : listDataY) {
            System.out.println(data);
        }
    }

    public String getNamaPerpus() {
        return namaPerpus;
    }   
}
