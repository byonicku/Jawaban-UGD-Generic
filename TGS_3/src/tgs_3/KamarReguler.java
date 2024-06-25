/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_3;

/**
 *
 * @author ASUS
 */
public class KamarReguler extends Kamar {
    private int batasanOrang;

    public KamarReguler(int batasanOrang, String nomorKamar, String fasilitas, double harga) {
        super(nomorKamar, fasilitas, harga);
        this.batasanOrang = batasanOrang;
    }

    @Override
    public double hitungTotalBiaya() {
        return harga * 6;
    }
    
    @Override
    public String toString() {
        return "Kamar Reguler\n" 
             + "Nomor Kamar\t\t: " + nomorKamar + "\n"
             + "Fasilitas\t\t: " + fasilitas + "\n"
             + "Harga\t\t\t: " + harga + "\n"
             + "Batasan berkunjung di kos adalah " + batasanOrang + " orang\n" 
             + "Total Biaya\t\t: " + hitungTotalBiaya() + "\n";
    }
}
