/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_2;

/**
 *
 * @author ASUS
 */
public class Pustakawan extends StaffPerpustakaan {
    private String bidangKepakaran;

    public Pustakawan(String bidangKepakaran, String nama, String nomorPetugas, double gaji) {
        super(nama, nomorPetugas, gaji);
        this.bidangKepakaran = bidangKepakaran;
    }
    
    @Override
    public String bekerja() {
        return "Pustakawan " + nama + " melakukan pengadaan buku!";
    }
    
    @Override
    public double hitungGaji() {
        return gaji - (gaji * 0.11) + 150000;
    }
    
    @Override
    public String toString() {
        return "Pustakawan\n" 
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Petugas\t\t: " + nomorPetugas + "\n"
             + "Bidang Kepakaran\t: " + bidangKepakaran + "\n" 
             + "Gaji\t\t\t: " + gaji + "\n"
             + "Total Gaji\t\t: " + hitungGaji() + "\n"
             + bekerja() + "\n";
    }
}
