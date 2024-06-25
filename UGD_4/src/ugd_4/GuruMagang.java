/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_4;

/**
 *
 * @author ASUS
 */
public class GuruMagang {
    private String nama;
    private String nomorIndukGuru;
    private double gaji;
    private int lamaMagang;

    public GuruMagang(String nama, String nomorIndukGuru, double gaji, int lamaMagang) {
        this.nama = nama;
        this.nomorIndukGuru = nomorIndukGuru;
        this.lamaMagang = lamaMagang;
        this.gaji = gaji;
    }
    
    public String mengajar() {
        return "Guru Magang " + nama + " sedang mengajar!";
    }
    
    public String membuatLaporan() {
        return "Guru Magang " + nama + " membuat laporan magang!";
    }

    public String getNama() {
        return nama;
    }
    
    @Override
    public String toString() {
        return "Guru Magang\n" 
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Induk Guru\t: " + nomorIndukGuru + "\n"
             + "Gaji\t\t\t: " + gaji + "\n"
             + "Lama Magang\t\t: " + lamaMagang + "\n"
             + mengajar() + "\n"
             + membuatLaporan() + "\n";
    }
}
