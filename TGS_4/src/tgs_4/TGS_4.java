/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs_4;

import java.util.ArrayList;
import java.util.List;

public class TGS_4 {
        public static void main(String[] args) {
            List<Guru> bilikSekolahAGuru1 = new ArrayList<>();
            List<Guru> bilikSekolahAGuru2 = new ArrayList<>();

            Sekolah A = new Sekolah("Budi Atma", bilikSekolahAGuru1, bilikSekolahAGuru2);
            System.out.println("Sekolah " + A.getNamaSekolah());
            A.addX(new GuruTetap("Jeanny", "GT-1", 1000000, 500000));
            A.addX(new GuruMagang("Kelvin", "MG-1", 500000, 6));
            A.addY(new GuruMagang("Carol", "MG-2", 500000, 6));
            A.addY(new GuruTetap("Pamela", "GT-2", 1000000, 500000));

            A.printX();
            A.printY();
            
            List<Guru> bilikSekolahBGuru = new ArrayList<>();
            List<Siswa> bilikSekolahBSiswa = new ArrayList<>();

            Sekolah B = new Sekolah("Atma Sentosa", bilikSekolahBGuru, bilikSekolahBSiswa);
            System.out.println("Sekolah " + B.getNamaSekolah());
            Guru GT1 = new GuruTetap("Joesenchia", "GT-3", 1000000, 250000);
            Guru GT2 = new GuruMagang("Joshua", "MG-3", 4, 250000);
            B.addX(GT1);
            B.addX(GT2);
            B.addY(new SiswaReguler("Rayzel", "1001", GT1, 1000000));
            B.addY(new SiswaBeasiswa("Ivan", "1002", GT2, "Easy Beasiswa Club"));

            B.printX();
            B.printY();

            List<Guru> bilikSekolahCGuru = new ArrayList<>();
            List<Siswa> bilikSekolahCSiswa = new ArrayList<>();

            Sekolah C = new Sekolah("Atma Budika", bilikSekolahCGuru, bilikSekolahCSiswa);
            System.out.println("Sekolah " + C.getNamaSekolah());
            Guru GM1 = new GuruMagang("Yohanes", "MG-4", 100000, 12);            
            Guru GM2 = new GuruTetap("Idelia", "GT-4", 1000000, 90000);
            C.addX(GM1);
            C.addX(GM2);
            C.addY(new SiswaReguler("Ongky", "1003", GM1, 2000000));
            C.addY(new SiswaReguler("Jeanny", "1004", GM2, 2000000));

            C.printX();
            C.printY();
        }
}
