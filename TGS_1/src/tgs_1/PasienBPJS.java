/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_1;

/**
 *
 * @author ASUS
 */
public class PasienBPJS extends Pasien {
    private String noBPJS;

    public PasienBPJS(String noBPJS, String nama, int umur, String golonganDarah) {
        super(nama, umur, golonganDarah);
        this.noBPJS = noBPJS;
    }
    
    @Override
    public String daftarPeriksa() {
        return "Pasien " + nama + " mendaftar menggunakan BPJS!";
    }
    
    @Override
    public double hitungBayarPeriksa() {
        return 30000 + ((umur / 10) * 30000) * 0.11;
    }
    
    @Override
    public String toString() {
        return "Pasien BPJS\n"
             + "Nama\t\t: " + nama + "\n"
             + "Umur\t\t: " + umur + "\n"
             + "Golongan Darah\t: " + golonganDarah + "\n"
             + "No BPJS\t\t: " + noBPJS + "\n"
             + daftarPeriksa() + "\n"
             + "Biaya yang perlu dibayarkan " + hitungBayarPeriksa() + "\n";
    }
}
