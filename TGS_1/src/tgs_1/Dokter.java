/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_1;

/**
 *
 * @author ASUS
 */
public class Dokter extends Staff {
    private String nomorIndukDokter;

    public Dokter(String nomorIndukDokter, String nama, String spesialisasi, double gaji) {
        super(nama, spesialisasi, gaji);
        this.nomorIndukDokter = nomorIndukDokter;
    }
    
    @Override
    public String bekerja() {
        return "Dokter " + nama + " sedang memeriksa!";
    }
    
    @Override
    public double hitungGaji() {
        return gaji - (gaji * 0.11) + 500000;
    }
    
    @Override
    public String toString() {
        return "Dokter\n"
             + "Nomor Induk\t: " + nomorIndukDokter + "\n"
             + "Nama\t\t: " + nama + "\n"
             + "Spesialisasi\t: " + spesialisasi + "\n"
             + "Gaji\t\t: " + gaji + "\n"
             + "Total Gaji\t: " + hitungGaji() + "\n"
             + bekerja() + "\n";
    }
}
