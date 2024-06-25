/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tgs_1;

/**
 *
 * @author ASUS
 */
public abstract class Staff {
    protected String nama;
    protected String spesialisasi;
    protected double gaji;

    public Staff(String nama, String spesialisasi, double gaji) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.gaji = gaji;
    }
    
    public abstract String bekerja();
    public abstract double hitungGaji();
}
