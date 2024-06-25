/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd_3;

/**
 *
 * @author ASUS
 */
public class Penyewa {
    private String nama;
    private String pekerjaan;
    private KamarReguler kamarReguler;
    private KamarEksekutif kamarEksekutif;

    public Penyewa(String nama, String pekerjaan) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.kamarReguler = null;
        this.kamarEksekutif = null;
    }

    public Penyewa(String nama, String pekerjaan, KamarReguler kamarReguler) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.kamarReguler = kamarReguler;
        this.kamarEksekutif = null;
    }

    public Penyewa(String nama, String pekerjaan, KamarEksekutif kamarEksekutif) {
        this.nama = nama;
        this.pekerjaan = pekerjaan;
        this.kamarEksekutif = kamarEksekutif;
        this.kamarReguler = null;
    }
    
    public void menyewaKamarReguler(KamarReguler kamarReguler) {
        if (this.kamarReguler == null && this.kamarEksekutif == null) {
            this.kamarReguler = kamarReguler;
            System.out.println("Kamar Reguler Nomor " + kamarReguler.getNomorKamar() + " berhasil disewa oleh " + nama);
        } else {
            System.out.println(nama + " sudah mempunyai kamar");
        }
    }
    
    public void menyewaKamarEksekutif(KamarEksekutif kamarEksekutif) {
        if (this.kamarReguler == null && this.kamarEksekutif == null) {
            this.kamarEksekutif = kamarEksekutif;
            System.out.println("Kamar Ekseskutif Nomor " + kamarEksekutif.getNomorKamar() + " berhasil disewa oleh " + nama);
        } else {
            System.out.println(nama + " sudah mempunyai kamar");
        }
    }
    
    @Override
    public String toString() {
        String data = "Belum Memiliki Kamar";
        
        if (kamarEksekutif != null) {
            data = "Kamar Eksekutif Nomor " + kamarEksekutif.getNomorKamar();
        } else if (kamarReguler != null) {
            data = "Kamar Reguler Nomor " + kamarReguler.getNomorKamar();
        }
        
        return "Penyewa\n"
             + "Nama\t\t: " + nama + "\n"
             + "Pekerjaan\t: " + pekerjaan + "\n"
             + data + "\n";
    }
}
