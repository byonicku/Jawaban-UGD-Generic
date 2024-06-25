/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_2;

/**
 *
 * @author ASUS
 */
public abstract class Pemustaka {
    protected String nama;
    protected String nomorPemustaka;

    public Pemustaka(String nama, String nomorPemustaka) {
        this.nama = nama;
        this.nomorPemustaka = nomorPemustaka;
    }
    
    public abstract String meminjam();
    public abstract String membaca();
}
