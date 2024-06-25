/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs_2;

import java.util.ArrayList;
import java.util.List;

public class TGS_2 {
        public static void main(String[] args) {
            List<StaffPerpustakaan> listPerpusAStaffPerpustakaan = new ArrayList<>();
            List<Pemustaka> listPerpusAPemustaka = new ArrayList<>();

            Perpustakaan A = new Perpustakaan("Cabang Bonaventura", listPerpusAStaffPerpustakaan, listPerpusAPemustaka);
            System.out.println("Perpustakaan " + A.getNamaPerpus());
            A.addX(new Pustakawan("Sejarah", "Dendy", "PST-1", 200000));
            A.addX(new LayananTeknis("Ilmu Informasi", "Joe", "LTK-1", 400000));
            A.addY(new Dosen("1.1", "Idelia", "PMT-1"));
            A.addY(new Mahasiswa("210711111", "Jeanny", "PMT-2"));

            A.printX();
            A.printY();

            List<StaffPerpustakaan> listPerpusBStaffPerpustakaan = new ArrayList<>();
            List<Pemustaka> listPerpusBPemustaka = new ArrayList<>();

            Perpustakaan B = new Perpustakaan("Cabang Santoso", listPerpusBStaffPerpustakaan, listPerpusBPemustaka);
            System.out.println("Perpustakaan " + B.getNamaPerpus());
            B.addX(new Pustakawan("Sejarah Indonesia","Joe", "PST-2", 600000));
            B.addX(new Pustakawan("Ilmu Politik ", "Kelvin", "PST-3", 500000));
            B.addY(new Dosen("2.1", "Rayzel", "PMT-3"));
            B.addY(new Dosen("2.2", "Carol", "PMT-4"));

            B.printX();
            B.printY();

            List<StaffPerpustakaan> listPerpusCStaffPerpustakaan = new ArrayList<>();
            List<Pemustaka> listPerpusCPemustaka = new ArrayList<>();

            Perpustakaan C = new Perpustakaan("Salam Group", listPerpusCStaffPerpustakaan, listPerpusCPemustaka);
            System.out.println("Perpustakaan " + C.getNamaPerpus());
            C.addX(new LayananTeknis("Katalogisasi", "Vigo", "LTK-2", 200000));
            C.addX(new Pustakawan("Sejarah", "Joshua", "PST-4", 100000));
            C.addY(new Mahasiswa("210722222", "Ongky", "PMT-5"));
            C.addY(new Mahasiswa("210733333", "Ivan", "PMT-6"));

            C.printX();
            C.printY();
        }
    
}
