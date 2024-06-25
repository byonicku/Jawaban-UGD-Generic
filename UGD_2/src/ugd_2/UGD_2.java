/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_2;

import java.util.ArrayList;
import java.util.List;

public class UGD_2 {
        public static void main(String[] args) {
            List<Pustakawan> listPerpusAPustakawan = new ArrayList<>();
            List<LayananTeknis> listPerpusALayananTeknis = new ArrayList<>();

            Perpustakaan A = new Perpustakaan("Cabang Bonaventura", listPerpusAPustakawan, listPerpusALayananTeknis);
            System.out.println("Perpustakaan " + A.getNamaPerpus());
            A.addX(new Pustakawan("Dendy", "PST-1", 200000, "Sejarah"));
            A.addX(new Pustakawan("Joe", "PST-2", 400000, "Ilmu Informasi"));
            A.addY(new LayananTeknis("Idelia", "LTK-1", 100000, "Pengolahan Teknis"));
            A.addY(new LayananTeknis("Jeanny", "LTK-2", 200000, "Katalogisasi"));

            A.printX();
            A.printY();

            List<Pustakawan> listPerpusBPustakawan = new ArrayList<>();
            List<Pemustaka> listPerpusBPemustaka = new ArrayList<>();

            Perpustakaan B = new Perpustakaan("Cabang Santoso", listPerpusBPustakawan, listPerpusBPemustaka);
            System.out.println("Perpustakaan " + B.getNamaPerpus());
            B.addX(new Pustakawan("Joe", "PST-3", 600000, "Sejarah Indonesia"));
            B.addX(new Pustakawan("Kelvin", "PST-4", 500000, "Ilmu Politik"));
            B.addY(new Pemustaka("Rayzel", "PMT-1"));
            B.addY(new Pemustaka("Carol", "PMT-2"));

            B.printX();
            B.printY();

            List<LayananTeknis> listPerpusCLayananTeknis = new ArrayList<>();
            List<Pemustaka> listPerpusCPemustaka = new ArrayList<>();

            Perpustakaan C = new Perpustakaan("Salam Group", listPerpusCLayananTeknis, listPerpusCPemustaka);
            System.out.println("Perpustakaan " + C.getNamaPerpus());
            C.addX(new LayananTeknis("Carol", "LTK-3", 200000, "Pemeliharaan Koleksi"));
            C.addX(new LayananTeknis("Joshua", "LTK-4", 100000, "Pemeliharaan Koleksi"));
            C.addY(new Pemustaka("Ongky", "PMT-3"));
            C.addY(new Pemustaka("Ivan", "PMT-4"));

            C.printX();
            C.printY();
        }
    
}
