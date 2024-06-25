/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_3;

/**
 *
 * @author ASUS
 */
public abstract class Kamar {
    protected String nomorKamar;
    protected String fasilitas;
    protected double harga;

    public Kamar(String nomorKamar, String fasilitas, double harga) {
        this.nomorKamar = nomorKamar;
        this.fasilitas = fasilitas;
        this.harga = harga;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }
    
    public abstract double hitungTotalBiaya();
}
