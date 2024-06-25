/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_2;

/**
 *
 * @author ASUS
 */
public class LayananTeknis extends StaffPerpustakaan {
    private String jenisLayanan;

    public LayananTeknis(String jenisLayanan, String string, String string1, double d) {
        super(string, string1, d);
        this.jenisLayanan = jenisLayanan;
    }
    
    @Override
    public String bekerja() {
        return "Layanan Teknis " + nama + " sedang membuat laporan!";
    }
    
    @Override
    public double hitungGaji() {
        return gaji - (gaji * 0.11) + 100000;
    }
    
    @Override
    public String toString() {
        return "Layanan Teknis\n"
             + "Nama\t\t: " + nama + "\n"
             + "Nomor Petugas\t: " + nomorPetugas + "\n"
             + "Jenis Layanan\t: " + jenisLayanan + "\n"
             + "Gaji\t\t: " + gaji + "\n"
             + "Total Gaji\t: " + hitungGaji() + "\n"
             + bekerja() + "\n";
    }
}
