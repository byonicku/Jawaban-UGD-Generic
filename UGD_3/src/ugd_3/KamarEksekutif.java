/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_3;

/**
 *
 * @author ASUS
 */
public class KamarEksekutif {
    private String nomorKamar;
    private String fasilitas;
    private double harga;
    private String aksesKhusus;

    public KamarEksekutif(String nomorKamar, String fasilitas, double harga, String aksesKhusus) {
        this.nomorKamar = nomorKamar;
        this.fasilitas = fasilitas;
        this.harga = harga;
        this.aksesKhusus = aksesKhusus;
    }

    public double hitungTotalBiaya() {
        return harga * 12;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    @Override
    public String toString() {
        return "Kamar Eksekutif\n" 
             + "Nomor Kamar\t: " + nomorKamar + "\n"
             + "Fasilitas\t: " + fasilitas + "\n"
             + "Harga\t\t: " + harga + "\n"
             + "Akses Khusus\t: " + aksesKhusus + "\n" 
             + "Total Biaya\t: " + hitungTotalBiaya() + "\n";
    }
}
