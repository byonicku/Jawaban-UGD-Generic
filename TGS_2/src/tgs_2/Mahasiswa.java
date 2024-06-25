/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_2;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Pemustaka {
    private String NPM;

    public Mahasiswa(String NPM, String nama, String nomorPemustaka) {
        super(nama, nomorPemustaka);
        this.NPM = NPM;
    }

    @Override
    public String membaca() {
        return "Mahasiswa " + nama + " sedang membaca buku";
    }
    
    @Override
    public String meminjam() {
        return "Mahasiswa " + nama + " meminjam buku";
    }
    
    @Override
    public String toString() {
        return "Mahasiswa\n"
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Pemustaka\t: " + nomorPemustaka + "\n" 
             + "NPM\t\t\t: " + NPM + "\n"
             + meminjam() + "\n"
             + membaca() + "\n";
             
    }
}
