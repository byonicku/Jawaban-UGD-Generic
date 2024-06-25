/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_4;

/**
 *
 * @author ASUS
 */

import java.util.List;

public class Sekolah <X, Y> {
    private String namaSekolah;
    private List<X> bilikDataX;
    private List<Y> bilikDataY;

    public Sekolah(String namaSekolah, List<X> bilikDataX, List<Y> bilikDataY) {
        this.namaSekolah = namaSekolah;
        this.bilikDataX = bilikDataX;
        this.bilikDataY = bilikDataY;
    }
    
    public void addX(X data) {
        bilikDataX.add(data);
    }
    
    public void addY(Y data) {
        bilikDataY.add(data);
    }
    
    public List<X> getX() {
        return bilikDataX;
    }
    
    public List<Y> getY() {
        return bilikDataY;
    }
    
    public void printX() {
        for (X data : bilikDataX) {
            System.out.println(data);
        }
    }
    
    public void printY() {
        for (Y data : bilikDataY) {
            System.out.println(data);
        }
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }
}
