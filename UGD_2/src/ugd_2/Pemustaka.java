/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_2;

/**
 *
 * @author ASUS
 */
public class Pemustaka {
    private String nama;
    private String nomorPemustaka;

    public Pemustaka(String nama, String nomorPemustaka) {
        this.nama = nama;
        this.nomorPemustaka = nomorPemustaka;
    }   
    
    public String membacaBuku() {
        return "Pemustaka " + nama + " sedang membaca buku";
    }
    
    @Override
    public String toString() {
        return "Pemustaka\n"
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Pemustaka\t: " + nomorPemustaka + "\n"
             + membacaBuku() + "\n";
    }
}
