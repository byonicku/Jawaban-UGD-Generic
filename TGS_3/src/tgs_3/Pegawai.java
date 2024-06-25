/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_3;

/**
 *
 * @author ASUS
 */
public class Pegawai extends Penyewa {
    private String pekerjaan;

    public Pegawai(String nama, String pekerjaan) {
        super(nama);
        this.pekerjaan = pekerjaan;
    }

    public Pegawai(String nama, Kamar kamar, String pekerjaan) {
        super(nama, kamar);
        this.pekerjaan = pekerjaan;
    }
    
    @Override
    public String membayarKos() {
        if (kamar != null) {
            return "Pegawai " + nama + " membayar kos!";
        } else {
            return "Pegawai " + nama + " belum memiliki kamar!";
        }
    }

    @Override
    public String toString() {
        String data = "Belum Memiliki Kamar";
        
        if (kamar != null) {
            String jenisKamar = kamar.getClass().getName().substring(11);
            data = "Kamar " + jenisKamar + " Nomor " + kamar.getNomorKamar();
        }
        
        return "Pegawai\n"
             + "Nama\t\t\t: " + nama + "\n"
             + "Pekerjaan\t\t: " + pekerjaan + "\n"
             + data + "\n"
             + membayarKos() + "\n";
    }
}
