/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tgs_2;

/**
 *
 * @author ASUS
 */
public abstract class StaffPerpustakaan {
    protected String nama;
    protected String nomorPetugas;
    protected double gaji;

    public StaffPerpustakaan(String nama, String nomorPetugas, double gaji) {
        this.nama = nama;
        this.nomorPetugas = nomorPetugas;
        this.gaji = gaji;
    }
    
    public abstract String bekerja();
    public abstract double hitungGaji();
}
