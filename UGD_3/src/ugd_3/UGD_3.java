/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_3;

import java.util.ArrayList;
import java.util.List;

public class UGD_3 {
        public static void main(String[] args) {
            List<KamarEksekutif> listKosAKamarEksekutif = new ArrayList<>();
            List<KamarReguler> listKosAKamarReguler = new ArrayList<>();

            Kos A = new Kos("Atma Youth", listKosAKamarEksekutif, listKosAKamarReguler);
            System.out.println("Kos " + A.getNamaKos());
            A.addX(new KamarEksekutif("E1", "Wifi, Kamar Mandi Dalam", 200000, "Kolam Renang Pribadi"));
            A.addX(new KamarEksekutif("E2", "Wifi, Kamar Mandi Dalam, Makan Pagi", 300000, "Lounge Kos"));
            A.addY(new KamarReguler("R1", "Wifi", 100000, 3));
            A.addY(new KamarReguler("R2", "Wifi", 120000, 2));

            A.printX();
            A.printY();

            List<KamarEksekutif> listKosBKamarEksekutif = new ArrayList<>();
            List<Penyewa> listKosBPenyewa = new ArrayList<>();

            Kos B = new Kos("Santoso Group", listKosBKamarEksekutif, listKosBPenyewa);
            System.out.println("Kos " + B.getNamaKos());
            KamarEksekutif E3 = new KamarEksekutif("E3", "Wifi, Kamar Mandi Dalam, Listrik", 400000, "Lounge Kos");
            B.addX(E3);
            KamarEksekutif E4 = new KamarEksekutif("E4", "Wifi, Kamar Mandi Dalam, Makan Gratis", 500000, "Kolam Renang Pribadi");
            B.addX(E4);
            B.addY(new Penyewa("Joesenchia", "Asisten Dosen", E3));
            Penyewa carol = new Penyewa("Carol", "Guru TK");
            B.addY(carol);
            B.addY(new Penyewa("Kelvin", "Weapon Master"));

            B.printX();

            carol.menyewaKamarEksekutif(E4);
            carol.menyewaKamarEksekutif(E3);
            System.out.println();
            
            B.printY();

            List<KamarReguler> listKosCKamarReguler = new ArrayList<>();
            List<Penyewa> listKosCPenyewa = new ArrayList<>();

            Kos C = new Kos("Cheap China Town", listKosCKamarReguler, listKosCPenyewa);
            System.out.println("Kos " + C.getNamaKos());
            KamarReguler R3 = new KamarReguler("R3", "Wifi", 100000, 2);
            C.addX(R3);
            KamarReguler R4 = new KamarReguler("R4", "Kamar Mandi", 90000, 4);
            C.addX(R4);
            C.addY(new Penyewa("Ongky", "Guru IT", R3));
            Penyewa ivan = new Penyewa("Ivan", "Gym Instructor");
            
            C.addY(ivan);
            C.addY(new Penyewa("Yohanes", "Pengusaha Chicken"));

            C.printX();
            
            ivan.menyewaKamarReguler(R4);
            ivan.menyewaKamarEksekutif(E4);
            System.out.println();
            
            C.printY();
        }
}
