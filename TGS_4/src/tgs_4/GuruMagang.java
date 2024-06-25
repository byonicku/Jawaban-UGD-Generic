/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_4;

/**
 *
 * @author ASUS
 */
public class GuruMagang extends Guru{
    private int lamaMagang;

    public GuruMagang(String nama, String nomrIndukGuru, double gaji, int lamaMagang) {
        super(nama, nomrIndukGuru, gaji);
        this.lamaMagang = lamaMagang;
    }
    
    @Override
    public String bekerja() {
        return "Guru Magang " + nama + " mengajar Siswa! dan mengerjakan laporan magang";
    }
    
    @Override
    public double hitungGaji() {
        return gaji * lamaMagang;
    }

    @Override
    public String toString() {
        return "Guru Magang\n" 
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Induk Guru\t: " + nomrIndukGuru + "\n"
             + "Gaji\t\t\t: " + gaji + "\n"
             + "Lama Magang\t\t: " + lamaMagang + "\n"
             + "Total Gaji\t\t: " + hitungGaji() + "\n"
             + bekerja() + "\n";
    }
}
