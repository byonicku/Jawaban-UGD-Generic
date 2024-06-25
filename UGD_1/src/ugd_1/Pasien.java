/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_1;

/**
 *
 * @author ASUS
 */
public class Pasien {
    private String nama;
    private int umur;
    private String golonganDarah;

    public Pasien(String nama, int umur, String golonganDarah) {
        this.nama = nama;
        this.umur = umur;
        this.golonganDarah = golonganDarah;
    }
    
    public String istirahat() {
        return "Pasien " + nama + " sedang beristirahat";
    }
    
    @Override
    public String toString() {
        return "Pasien\n"
             + "Nama\t\t: " + nama + "\n"
             + "Umur\t\t: " + umur + "\n"
             + "Golongan Darah\t: " + golonganDarah + "\n"
             + istirahat() + "\n";
    }
}
