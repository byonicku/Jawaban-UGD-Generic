/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_4;

/**
 *
 * @author ASUS
 */
public class SiswaBeasiswa extends Siswa {
    private String namaBeasiswa;

    public SiswaBeasiswa(String nama, String nomorIndukSiswa, Guru guruPembimbing, String namaBeasiswa) {
        super(nama, nomorIndukSiswa, guruPembimbing);
        this.namaBeasiswa = namaBeasiswa;
    }
    
    @Override
    public String belajar() {
        return "Siswa Beasiswa " + nama + " sedang belajar!";
    }
    
    @Override
    public String memintaBimbingan() {
         return "Siswa Beasiswa " + nama + " melakukan bimbingan dengan " + guruPembimbing.getNama();
    }
        
    @Override
    public String toString() {
        String data = "Pembimbing\t\t: ";
        
        data += guruPembimbing.getNama();
        
        return "Siswa Beasiswa\n"
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Induk Siswa\t: " + nomorIndukSiswa + "\n"
             + "Nama Beasiswa\t\t: " + namaBeasiswa + "\n"
             + data + "\n"
             + belajar() + "\n"
             + memintaBimbingan() + "\n";
    }
}
