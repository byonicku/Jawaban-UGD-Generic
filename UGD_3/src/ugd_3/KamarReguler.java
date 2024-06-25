/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_3;

/**
 *
 * @author ASUS
 */
public class KamarReguler {
    private String nomorKamar;
    private String fasilitas;
    private double harga;
    private int batasanOrang;

    public KamarReguler(String nomorKamar, String fasilitas, double harga, int batasanOrang) {
        this.nomorKamar = nomorKamar;
        this.fasilitas = fasilitas;
        this.harga = harga;
        this.batasanOrang = batasanOrang;
    }
    
    public double hitungTotalBiaya() {
        return harga * 6;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }
    
    @Override
    public String toString() {
        return "Kamar Reguler\n" 
             + "Nomor Kamar\t: " + nomorKamar + "\n"
             + "Fasilitas\t: " + fasilitas + "\n"
             + "Harga\t\t: " + harga + "\n"
             + "Batasan berkunjung di kos adalah " + batasanOrang + " orang\n" 
             + "Total Biaya\t: " + hitungTotalBiaya() + "\n";
    }
}
