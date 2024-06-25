/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_4;

/**
 *
 * @author ASUS
 */
public abstract class Guru {
    protected String nama;
    protected String nomrIndukGuru;
    protected double gaji;

    public Guru(String nama, String nomrIndukGuru, double gaji) {
        this.nama = nama;
        this.nomrIndukGuru = nomrIndukGuru;
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public abstract String bekerja();
    public abstract double hitungGaji();
}
