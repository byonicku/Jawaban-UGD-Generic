/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_3;

/**
 *
 * @author ASUS
 */
public class KamarEksekutif extends Kamar {
    private String aksesKhusus;

    public KamarEksekutif(String aksesKhusus, String nomorKamar, String fasilitas, double harga) {
        super(nomorKamar, fasilitas, harga);
        this.aksesKhusus = aksesKhusus;
    }
    
    @Override
    public double hitungTotalBiaya() {
        return harga * 12;
    }

    @Override
    public String toString() {
        return "Kamar Eksekutif\n" 
             + "Nomor Kamar\t\t: " + nomorKamar + "\n"
             + "Fasilitas\t\t: " + fasilitas + "\n"
             + "Harga\t\t\t: " + harga + "\n"
             + "Akses Khusus\t\t: " + aksesKhusus + "\n"
             + "Total Biaya\t\t: " + hitungTotalBiaya() + "\n";
    }
}
