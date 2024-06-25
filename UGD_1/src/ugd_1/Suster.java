/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_1;

/**
 *
 * @author ASUS
 */
public class Suster {
    private String nama;
    private String spesialisasi;
    private double gaji;
    private String jenisShift;

    public Suster(String nama, String spesialisasi, double gaji, String jenisShift) {
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.gaji = gaji;
        this.jenisShift = jenisShift;
    }

    public String merawat() {
        return "Suster " + nama + " sedang merawat";
    }
    
    @Override
    public String toString() {
        return "Suster\n"
             + "Nama\t\t: " + nama + "\n"
             + "Spesialisasi\t: " + spesialisasi + "\n"
             + "Gaji\t\t: " + gaji + "\n"
             + "Jenis Shift\t: " + jenisShift + "\n"
             + merawat() + "\n";
    }
}
