/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs_3;

import java.util.ArrayList;
import java.util.List;

public class TGS_3 {
        public static void main(String[] args) {
            List<Kamar> listKosAKamarA = new ArrayList<>();
            List<Kamar> listKosAKamarB = new ArrayList<>();

            Kos A = new Kos("Atma Youth", listKosAKamarA, listKosAKamarB);
            System.out.println("Kos " + A.getNamaKos());
            A.addX(new KamarEksekutif("Kolam Renang Pribadi","E1", "Wifi, Kamar Mandi Dalam", 200000));
            A.addX(new KamarReguler(3, "R1", "Wifi", 100000));
            A.addY(new KamarReguler(2, "R2", "Wifi", 120000));
            A.addY(new KamarEksekutif("Lounge Kos", "E2", "Wifi, Kamar Mandi, Makan Pagi", 300000));

            A.printX();
            A.printY();

            List<Kamar> listKosBKamar = new ArrayList<>();
            List<Penyewa> listKosBPenyewa = new ArrayList<>();

            Kos B = new Kos("Santoso Group", listKosBKamar, listKosBPenyewa);
            System.out.println("Kos " + B.getNamaKos());
            Kamar E3 = new KamarEksekutif("Lounge Kos", "E3", "Wifi, Kamar Mandi Dalam, Listrik", 400000);
            B.addX(E3);
            Kamar E4 = new KamarEksekutif("Kolam Renang Pribadi", "E4", "Wifi, Kamar Mandi, Makan Gratis", 500000);
            B.addX(E4);
            B.addY(new Pegawai("Joesenchia", E3, "Asisten Dosen"));
            Penyewa carol = new Pegawai("Carol", "Guru TK");
            B.addY(carol);
            B.addY(new Mahasiswa("Yohanes", "Ternak Lele"));

            B.printX();
            
            carol.menyewa(E4);
            carol.menyewa(E3);
            System.out.println();
            
            B.printY();

            List<Kamar> listKosCKamar = new ArrayList<>();
            List<Penyewa> listKosCPenyewa = new ArrayList<>();

            Kos C = new Kos("Cheap China Town", listKosCKamar, listKosCPenyewa);
            System.out.println("Kos " + C.getNamaKos());
            Kamar R3 = new KamarReguler(2, "R3", "Wifi", 100000);
            C.addX(R3);
            KamarReguler R4 = new KamarReguler(2, "R4", "Kamar Mandi", 90000);
            C.addX(R4);
            C.addY(new Mahasiswa("Ongky", R3, "Informatika"));
            Penyewa ivan = new Mahasiswa("Ivan", "Teknik Industri");
            C.addY(ivan);
            C.addY(new Pegawai("Kelvin", "Weapon Master"));
            
            C.printX();
            
            ivan.menyewa(R4);
            ivan.menyewa(E4);
            System.out.println();
            
            C.printY();
        }
}
