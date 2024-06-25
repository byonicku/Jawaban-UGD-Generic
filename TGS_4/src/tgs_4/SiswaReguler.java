/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_4;

/**
 *
 * @author ASUS
 */
public class SiswaReguler extends Siswa {
    private double biayaSPP;

    public SiswaReguler(String nama, String nomorIndukSiswa, Guru guruPembimbing, double biayaSPP) {
        super(nama, nomorIndukSiswa, guruPembimbing);
        this.biayaSPP = biayaSPP;
    }
    
    @Override
    public String belajar() {
        return "Siswa Reguler " + nama + " sedang belajar!";
    }
    
    @Override
    public String memintaBimbingan() {
         return "Siswa Reguler " + nama + " melakukan bimbingan dengan " + guruPembimbing.getNama();
    }
        
    @Override
    public String toString() {
        String data = "Pembimbing\t\t: ";
        
        data += guruPembimbing.getNama();
        
        return "Siswa Reguler\n"
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Induk Siswa\t: " + nomorIndukSiswa + "\n"
             + "SPP\t\t\t: " + biayaSPP + "\n"
             + data + "\n"
             + belajar() + "\n"
             + memintaBimbingan() + "\n";
    }
}
