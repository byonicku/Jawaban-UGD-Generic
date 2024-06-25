/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs_4;

/**
 *
 * @author ASUS
 */
public abstract class Siswa {
    protected String nama;
    protected String nomorIndukSiswa;
    protected Guru guruPembimbing;

    public Siswa(String nama, String nomorIndukSiswa, Guru guruPembimbing) {
        this.nama = nama;
        this.nomorIndukSiswa = nomorIndukSiswa;
        this.guruPembimbing = guruPembimbing;
    }
    
    public abstract String belajar();    
    public abstract String memintaBimbingan();
}
