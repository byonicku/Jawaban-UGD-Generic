/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_3;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Penyewa {
    private String jurusan;

    public Mahasiswa(String nama, String jurusan) {
        super(nama);
        this.jurusan = jurusan;
    }

    public Mahasiswa(String nama, Kamar kamar, String jurusan) {
        super(nama, kamar);
        this.jurusan = jurusan;
    }
    
    @Override
    public String membayarKos() {
        if (kamar != null) {
            return "Mahasiswa " + nama + " membayar kos!";
        } else {
            return "Mahasiswa " + nama + " belum memiliki kamar!";
        }
    }

    @Override
    public String toString() {
        String data = "Belum Memiliki Kamar";
        
        if (kamar != null) {
            String jenisKamar = kamar.getClass().getName().substring(11);
            data = "Kamar " + jenisKamar + " Nomor " + kamar.getNomorKamar();
        }
        
        return "Mahasiswa\n"
             + "Nama\t\t\t: " + nama + "\n"
             + "Jurusan\t\t\t: " + jurusan + "\n"
             + data + "\n"
             + membayarKos() + "\n";
    }
}
