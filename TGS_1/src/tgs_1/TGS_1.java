/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tgs_1;

import java.util.ArrayList;
import java.util.List;

public class TGS_1 {
 
    public static void main(String[] args) {
        List<Staff> bilikRSAStaff = new ArrayList<>();
        List<Pasien> bilikRSAPasien = new ArrayList<>();

        RumahSakit A = new RumahSakit("Budi Susilo", bilikRSAStaff, bilikRSAPasien);
        
        System.out.println("RS " + A.getNamaRS());
        A.addX(new Dokter("DTR-1", "Dendy", "Hati", 2000000));
        A.addX(new Suster("Pagi", "Idelia", "Hati", 1000000));
        A.addY(new PasienBPJS("BPJS-1", "Rayzel", 21, "A"));
        A.addY(new PasienBiasa("Atma Peduli", "ATMA-1", "Carol", 22, "B"));
        
        A.printX();
        A.printY();
        
        List<Staff> bilikRSBStaff = new ArrayList<>();
        List<Pasien> bilikRSBPasien = new ArrayList<>();

        RumahSakit B = new RumahSakit("Santoso Group", bilikRSBStaff, bilikRSBPasien);
        System.out.println("RS " + B.getNamaRS());
        B.addX(new Dokter("DTR-2", "Joe", "Saraf", 4000000));
        B.addX(new Suster("Sore", "Jeanny", "Mata", 300000));
        B.addY(new PasienBPJS("BPJS-2", "Joshua", 19, "AB"));
        B.addY(new PasienBPJS("BPJS-3", "Santoso", 22, "O"));

        B.printX();
        B.printY();
        
        List<Staff> bilikRSCStaff = new ArrayList<>();
        List<Pasien> bilikRSCPasien = new ArrayList<>();

        RumahSakit C = new RumahSakit("Puri Raharja", bilikRSCStaff, bilikRSCPasien);
        System.out.println("RS " + C.getNamaRS());
        C.addX(new Dokter("DTR-3", "Joe", "Saraf", 4000000));
        C.addX(new Dokter("DTR-4", "Kelvin", "Mata", 300000));
        C.addY(new PasienBiasa("Atma Peduli", "ATMA-2", "Ongky", 21, "O"));
        C.addY(new PasienBiasa("Atma Peduli", "ATMA-3", "Ivan", 22, "AB"));

        C.printX();
        C.printY();
    }
}
