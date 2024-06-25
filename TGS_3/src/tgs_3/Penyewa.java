/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_3;

/**
 *
 * @author ASUS
 */
public abstract class Penyewa {
    protected String nama;
    protected Kamar kamar;
    
    public Penyewa(String nama) {
        this.nama = nama;
        this.kamar = null;
    }

    public Penyewa(String nama, Kamar kamar) {
        this.nama = nama;
        this.kamar = kamar;
    }
    
    public abstract String membayarKos();
    
    public void menyewa(Kamar kamar) {
        if (this.kamar == null) {
            this.kamar = kamar;
            String jenisKamar = kamar.getClass().getName().substring(11);
            System.out.println("Kamar " + jenisKamar + " Nomor " + kamar.getNomorKamar() + " berhasil disewa oleh " + nama);
        } else {
            System.out.println(nama + " sudah pernah menyewa kamar");
        }
    }
}
