/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_4;

/**
 *
 * @author ASUS
 */
public class GuruTetap {
    private String nama;
    private String nomorIndukGuru;
    private double gaji;
    private int honorTambahan;

    public GuruTetap(String nama, String nomorIndukGuru, double gaji, int honorTambahan) {
        this.nama = nama;
        this.nomorIndukGuru = nomorIndukGuru;
        this.gaji = gaji;
        this.honorTambahan = honorTambahan;
    }
    
    public String mengajar() {
        return "Guru Tetap " + nama + " sedang mengajar!";
    }

    public String getNama() {
        return nama;
    }
    
    @Override
    public String toString() {
        return "Guru Tetap\n" 
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Induk Guru\t: " + nomorIndukGuru + "\n"
             + "Gaji\t\t\t: " + gaji + "\n"
             + "Honor Tambahan\t\t: " + honorTambahan + "\n"
             + mengajar() + "\n";
    }
}
