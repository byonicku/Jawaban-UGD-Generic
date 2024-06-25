/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_1;

/**
 *
 * @author ASUS
 */
public class Dokter {
    private String nomorIndukDokter;
    private String nama;
    private String spesialisasi;
    private double gaji;

    public Dokter(String nomorIndukDokter, String nama, String spesialisasi, double gaji) {
        this.nomorIndukDokter = nomorIndukDokter;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
        this.gaji = gaji;
    }

    public String memeriksa() {
        return "Dokter " + nama + " sedang memeriksa!";
    }
    
    @Override
    public String toString() {
        return "Dokter\n"
             + "Nomor Induk\t: " + nomorIndukDokter + "\n" 
             + "Nama\t\t: " + nama + "\n"
             + "Spesialisasi\t: " + spesialisasi + "\n"
             + "Gaji\t\t: " + gaji + "\n"
             + memeriksa() + "\n";
    }
}
