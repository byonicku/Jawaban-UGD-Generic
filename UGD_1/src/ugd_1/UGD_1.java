/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ugd_1;

import java.util.ArrayList;
import java.util.List;

public class UGD_1 {
        public static void main(String[] args) {
            List<Dokter> bilikRSADokter = new ArrayList<>();
            List<Suster> bilikRSASuster = new ArrayList<>();

            RumahSakit A = new RumahSakit("Budi Susilo", bilikRSADokter, bilikRSASuster);
            System.out.println("RS " + A.getNamaRS());
            A.addX(new Dokter("DTR-1", "Dendy", "Hati", 2000000));
            A.addX(new Dokter("DTR-2", "Joe", "Kelamin", 5000000));
            A.addY(new Suster("Idelia", "Hati", 1000000, "Malam"));
            A.addY(new Suster("Jeanny", "Jantung", 500000, "Pagi"));

            A.printX();
            A.printY();

            List<Dokter> bilikRSBDokter = new ArrayList<>();
            List<Pasien> bilikRSBPasien = new ArrayList<>();

            RumahSakit B = new RumahSakit("Santoso Group", bilikRSBDokter, bilikRSBPasien);
            System.out.println("RS " + B.getNamaRS());
            B.addX(new Dokter("DTR-3", "Joe", "Saraf", 4000000));
            B.addX(new Dokter("DTR-4", "Kelvin", "Mata", 300000));
            B.addY(new Pasien("Rayzel", 21, "A"));
            B.addY(new Pasien("Carol", 22, "B"));

            B.printX();
            B.printY();

            List<Suster> bilikRSCSuster = new ArrayList<>();
            List<Pasien> bilikRSCPasien = new ArrayList<>();

            RumahSakit C = new RumahSakit("Puri Raharja", bilikRSCSuster, bilikRSCPasien);
            System.out.println("RS " + C.getNamaRS());
            C.addX(new Suster("Carol", "Anak", 5000, "Siang"));
            C.addX(new Suster("Joshua", "Mental", 300000, "Sore"));
            C.addY(new Pasien("Ongky", 21, "O"));
            C.addY(new Pasien("Ivan", 22, "AB"));

            C.printX();
            C.printY();
        }
}
