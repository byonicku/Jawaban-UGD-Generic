/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_1;

/**
 *
 * @author ASUS
 */
public class PasienBiasa extends Pasien {
    private String namaAsuransi;
    private String noAsuransi;

    public PasienBiasa(String namaAsuransi, String noAsuransi, String nama, int umur, String golonganDarah) {
        super(nama, umur, golonganDarah);
        this.namaAsuransi = namaAsuransi;
        this.noAsuransi = noAsuransi;
    }

    @Override
    public String daftarPeriksa() {
        return "Pasien " + nama + " mendaftar seperti biasanya!";
    }
    
    @Override
    public double hitungBayarPeriksa() {
        return 50000 + (50000 * 0.11);
    }
    
    @Override
    public String toString() {
        return "Pasien Biasa\n"
             + "Nama\t\t: " + nama + "\n"
             + "Umur\t\t: " + umur + "\n"
             + "Golongan Darah\t: " + golonganDarah + "\n"
             + "Nama Asuransi\t: " + namaAsuransi + "\n"
             + "No Asuransi\t: " + noAsuransi + "\n"
             + daftarPeriksa() + "\n"
             + "Biaya yang perlu dibayarkan " + hitungBayarPeriksa() + "\n";
    }
}
