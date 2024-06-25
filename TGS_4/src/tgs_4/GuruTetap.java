/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_4;

/**
 *
 * @author ASUS
 */
public class GuruTetap extends Guru {
    private double honorTambahan;

    public GuruTetap(String nama, String nomrIndukGuru, double gaji, double honorTambahan) {
        super(nama, nomrIndukGuru, gaji);
        this.honorTambahan = honorTambahan;
    }
    
    @Override
    public String bekerja() {
        return "Guru Tetap " + nama + " mengajar Siswa!";
    }

    @Override
    public double hitungGaji() {
        return gaji + honorTambahan;
    }
    
    @Override
    public String toString() {
        return "Guru Tetap\n" 
             + "Nama\t\t\t: " + nama + "\n"
             + "Nomor Induk Guru\t: " + nomrIndukGuru + "\n"
             + "Gaji\t\t\t: " + gaji + "\n"
             + "Honor Tambahan\t\t: " + honorTambahan + "\n"
             + "Total Gaji\t\t: " + hitungGaji() + "\n"
             + bekerja() + "\n";
    }
}
