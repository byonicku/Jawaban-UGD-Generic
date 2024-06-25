/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_1;

/**
 *
 * @author ASUS
 */

import java.util.List;

public class RumahSakit <X, Y> {
    private String namaRumahSakit;
    private List<X> bilikDataX;
    private List<Y> bilikDataY;

    public RumahSakit(String namaRumahSakit, List<X> bilikDataX, List<Y> bilikDataY) {
        this.namaRumahSakit = namaRumahSakit;
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

    public String getNamaRS() {
        return namaRumahSakit;
    }   
}
