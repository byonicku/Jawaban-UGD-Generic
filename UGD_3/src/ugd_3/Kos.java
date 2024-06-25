/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_3;

/**
 *
 * @author ASUS
 */

import java.util.List;

public class Kos <X, Y> {
    private String namaKos;
    private List<X> listDataX;
    private List<Y> listDataY;

    public Kos(String namaKos, List<X> listDataX, List<Y> listDataY) {
        this.namaKos = namaKos;
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

    public String getNamaKos() {
        return namaKos;
    }   
}
