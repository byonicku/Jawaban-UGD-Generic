/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_1;

/**
 *
 * @author ASUS
 */
public class Suster extends Staff {
    private String jenisShift;

    public Suster(String jenisShift, String nama, String spesialisasi, double gaji) {
        super(nama, spesialisasi, gaji);
        this.jenisShift = jenisShift;
    }
    
    @Override
    public String bekerja() {
        return "Suster " + nama + " sedang merawat";
    }
    
    @Override
    public double hitungGaji() {
        return gaji - (gaji * 0.11) + 250000;
    }
    
    @Override
    public String toString() {
        return "Suster\n"
             + "Nama\t\t: " + nama + "\n"
             + "Spesialisasi\t: " + spesialisasi + "\n"
             + "Gaji\t\t: " + gaji + "\n"
             + "Total Gaji\t: " + hitungGaji() + "\n"
             + "Jenis Shift\t: " + jenisShift + "\n"
             + bekerja() + "\n";
    }
}
