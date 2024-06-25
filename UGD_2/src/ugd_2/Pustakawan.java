/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_2;

/**
 *
 * @author ASUS
 */
public class Pustakawan {
    private String nama;
    private String nomorPetugas;
    private double gaji;
    private String bidangKepakaran;

    public Pustakawan(String nama, String nomorPetugas, double gaji, String bidangKepakaran) {
        this.nama = nama;
        this.nomorPetugas = nomorPetugas;
        this.gaji = gaji;
        this.bidangKepakaran = bidangKepakaran;
    }
    
    public String pengadaanBuku() {
        return "Pustakawan " + nama + " melakukan pengadaan buku!";
    }
    
    @Override
    public String toString() {
        return "Pustakawan\n" 
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Petugas\t\t: " + nomorPetugas + "\n"
             + "Bidang Kepakaran\t: " + bidangKepakaran + "\n"
             + "Gaji\t\t\t: " + gaji + "\n"
             + pengadaanBuku() + "\n";
    }
}
