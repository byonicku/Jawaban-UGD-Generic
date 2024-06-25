/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_4;

import java.util.ArrayList;
import java.util.List;

public class UGD_4 {
        public static void main(String[] args) {
            List<GuruTetap> bilikSekolahAGuruTetap= new ArrayList<>();
            List<GuruMagang> bilikSekolahAGuruMagang = new ArrayList<>();

            Sekolah A = new Sekolah("Budi Atma", bilikSekolahAGuruTetap, bilikSekolahAGuruMagang);
            System.out.println("Sekolah " + A.getNamaSekolah());
            A.addX(new GuruTetap("Jeanny", "GR-1", 1000000, 500000));
            A.addX(new GuruTetap("Pamela", "GR-2", 1000000, 500000));
            A.addY(new GuruMagang("Carol", "MG-1", 500000, 6));
            A.addY(new GuruMagang("Kelvin", "MG-2", 500000, 6));

            A.printX();
            A.printY();
            
            List<GuruTetap> bilikSekolahBGuruTetap= new ArrayList<>();
            List<Siswa> bilikSekolahBSiswa = new ArrayList<>();

            Sekolah B = new Sekolah("Atma Sentosa", bilikSekolahBGuruTetap, bilikSekolahBSiswa);
            System.out.println("Sekolah " + B.getNamaSekolah());
            GuruTetap GT1 = new GuruTetap("Joesenchia", "GR-3", 1000000, 250000);
            GuruTetap GT2 = new GuruTetap("Joshua", "GR-4", 1000000, 200000);
            B.addX(GT1);
            B.addX(GT2);
            B.addY(new Siswa("Rayzel", "1001", GT1));
            B.addY(new Siswa("Ivan", "1002", GT2));

            B.printX();
            B.printY();

            List<GuruMagang> bilikSekolahCGuruMagang = new ArrayList<>();
            List<Siswa> bilikSekolahCSiswa = new ArrayList<>();

            Sekolah C = new Sekolah("Atma Budika", bilikSekolahCGuruMagang, bilikSekolahCSiswa);
            System.out.println("Sekolah " + C.getNamaSekolah());
            GuruMagang GM1 = new GuruMagang("Yohanes", "MG-3", 100000, 12);
            GuruMagang GM2 = new GuruMagang("Idelia", "MG-4", 90000, 12);
            C.addX(GM1);
            C.addX(GM2);
            C.addY(new Siswa("Ongky", "1003", GM1));
            C.addY(new Siswa("Jeanny", "1004", GM2));

            C.printX();
            C.printY();
        }
}
