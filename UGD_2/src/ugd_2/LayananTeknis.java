/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_2;

/**
 *
 * @author ASUS
 */
public class LayananTeknis {
    private String nama;
    private String nomorPetugas;
    private double gaji;
    private String jenisLayanan;

    public LayananTeknis(String nama, String nomorPetugas, double gaji, String jenisLayanan) {
        this.nama = nama;
        this.nomorPetugas = nomorPetugas;
        this.gaji = gaji;
        this.jenisLayanan = jenisLayanan;
    }
    
    public String membuatLaporan() {
        return "Layanan Teknis " + nama + " sedang membuat laporan!";
    }
    
    @Override
    public String toString() {
        return "Layanan Teknis\n"
             + "Nama\t\t: " + nama + "\n"
             + "Nomor Petugas\t: " + nomorPetugas + "\n"
             + "Jenis Layanan\t: " + jenisLayanan + "\n"
             + "Gaji\t\t: " + gaji + "\n"
             + membuatLaporan() + "\n";
    }
}
