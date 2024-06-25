/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_4;

/**
 *
 * @author ASUS
 */
public class Siswa {
    private String nama;
    private String nomorIndukSiswa;
    private GuruTetap guruBimbinganTetap;
    private GuruMagang guruBimbinganMagang;

    public Siswa(String nama, String nomorIndukSiswa, GuruTetap guruBimbinganTetap) {
        this.nama = nama;
        this.nomorIndukSiswa = nomorIndukSiswa;
        this.guruBimbinganTetap = guruBimbinganTetap;
        this.guruBimbinganMagang = null;
    }

    public Siswa(String nama, String nomorIndukSiswa, GuruMagang guruBimbinganMagang) {
        this.nama = nama;
        this.nomorIndukSiswa = nomorIndukSiswa;
        this.guruBimbinganMagang = guruBimbinganMagang;
        this.guruBimbinganTetap = null;
    }
    
    public String belajar() {
        return "Siswa " + nama + " sedang belajar!";
    }
    
    public String memintaBimbingan() {
        String namaGuru = "";
        if (guruBimbinganMagang != null) {
            namaGuru += guruBimbinganMagang.getNama();
        } else if (guruBimbinganTetap != null) {
            namaGuru += guruBimbinganTetap.getNama();
        }
        return "Siswa " + nama + " melakukan bimbingan dengan " + namaGuru;
    }
    
    
    @Override
    public String toString() {
        String data = "Pembimbing\t\t: ";
        
        if (guruBimbinganMagang != null) {
            data += guruBimbinganMagang.getNama();
        } else if (guruBimbinganTetap != null) {
            data += guruBimbinganTetap.getNama();
        }
        
        return "Siswa\n"
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Induk Siswa\t: " + nomorIndukSiswa + "\n"
             + data + "\n"
             + belajar() + "\n"
             + memintaBimbingan() + "\n";
    }
}
