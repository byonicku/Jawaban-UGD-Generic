/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_2;

/**
 *
 * @author ASUS
 */
public class Dosen extends Pemustaka {
    private String NIP;

    public Dosen(String NIP, String nama, String nomorPemustaka) {
        super(nama, nomorPemustaka);
        this.NIP = NIP;
    }

    @Override
    public String membaca() {
        return "Dosen " + nama + " sedang membaca jurnal";
    }
    
    @Override
    public String meminjam() {
        return "Dosen " + nama + " meminjam jurnal";
    }
    
    @Override
    public String toString() {
        return "Dosen\n"
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Pemustaka\t: " + nomorPemustaka + "\n" 
             + "NIP\t\t\t: " + NIP + "\n"
             + meminjam() + "\n"
             + membaca() + "\n";
    }
}
