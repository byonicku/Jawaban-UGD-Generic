/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tgs_1;

/**
 *
 * @author ASUS
 */
public abstract class Pasien {
    protected String nama;
    protected int umur;
    protected String golonganDarah;

    public Pasien(String nama, int umur, String golonganDarah) {
        this.nama = nama;
        this.umur = umur;
        this.golonganDarah = golonganDarah;
    }
    
    public abstract String daftarPeriksa();
    public abstract double hitungBayarPeriksa();
}
