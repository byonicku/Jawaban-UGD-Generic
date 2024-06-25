/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_tgs;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import tgs_2.*;

public class TGS_2MethodTest extends junit.framework.TestCase {
    private Perpustakaan A;
    private Perpustakaan B;
    private Perpustakaan C;
    
    @Override
    public void setUp() {
        try {
            List<StaffPerpustakaan> listPerpusAStaffPerpustakaan = new ArrayList<>();
            List<Pemustaka> listPerpusAPemustaka = new ArrayList<>();
            A = new Perpustakaan("Cabang Bonaventura", listPerpusAStaffPerpustakaan, listPerpusAPemustaka);
            addDataA();
        } catch (Exception e) {
            fail("Setup for Perpustakaan A failed: " + e.getMessage());
        }

        try {
            List<StaffPerpustakaan> listPerpusBStaffPerpustakaan = new ArrayList<>();
            List<Pemustaka> listPerpusBPemustaka = new ArrayList<>();
            B = new Perpustakaan("Cabang Santoso", listPerpusBStaffPerpustakaan, listPerpusBPemustaka);
            addDataB();
        } catch (Exception e) {
            fail("Setup for Perpustakaan B failed: " + e.getMessage());
        }

        try {
            List<StaffPerpustakaan> listPerpusCStaffPerpustakaan = new ArrayList<>();
            List<Pemustaka> listPerpusCPemustaka = new ArrayList<>();
            C = new Perpustakaan("Salam Group", listPerpusCStaffPerpustakaan, listPerpusCPemustaka);
            addDataC();
        } catch (Exception e) {
            fail("Setup for Perpustakaan C failed: " + e.getMessage());
        }
    }

    @Test
    public void testPerpustakaanProperties() {
        assertEquals("Cabang Bonaventura", A.getNamaPerpus());
        assertNotNull(A.getX());
        assertNotNull(A.getY());
        assertTrue(!A.getX().isEmpty());
        assertTrue(!A.getY().isEmpty());

        assertEquals("Cabang Santoso", B.getNamaPerpus());
        assertNotNull(B.getX());
        assertNotNull(B.getY());
        assertTrue(!B.getX().isEmpty());
        assertTrue(!B.getY().isEmpty());

        assertEquals("Salam Group", C.getNamaPerpus());
        assertNotNull(C.getX());
        assertNotNull(C.getY());
        assertTrue(!C.getX().isEmpty());
        assertTrue(!C.getY().isEmpty());
    }

    @Test
    public void testPrinting() {
        A.printX();
        A.printY();

        B.printX();
        B.printY();

        C.printX();
        C.printY();
    }

    @Test
    public void testGetIStaffPerpustakaanList() {
        double[] data = new double[]{328000, 456000, 684000, 595000, 278000, 239000};
        int i = 0;
        
        List<StaffPerpustakaan> dataAX = A.getX();
        assertEquals(2, dataAX.size());
        
        for (StaffPerpustakaan obj : dataAX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(obj.hitungGaji() == data[i++]);
        }

        List<StaffPerpustakaan> dataBX = B.getX();
        assertEquals(2, dataBX.size());
        for (StaffPerpustakaan obj : dataBX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(obj.hitungGaji() == data[i++]);
        }
        
        List<StaffPerpustakaan> dataCX = C.getX();
        assertEquals(2, dataCX.size());
        for (StaffPerpustakaan obj : dataCX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(obj.hitungGaji() == data[i++]);
        }
    }

    @Test
    public void testGetPemustakaList() {
        List<Pemustaka> dataAY = A.getY();
        assertEquals(2, dataAY.size());
        for (Pemustaka obj : dataAY) {
            assertNotNull(obj);
            obj.membaca();
            obj.meminjam();
        }
        
        List<Pemustaka> dataBY = B.getY();
        assertEquals(2, dataBY.size());
        for (Pemustaka obj : dataBY) {
            assertNotNull(obj);
            obj.membaca();
            obj.meminjam();
        }

        List<Pemustaka> dataCY = C.getY();
        assertEquals(2, dataCY.size());
        for (Pemustaka obj : dataCY) {
            assertNotNull(obj);
            obj.membaca();
            obj.meminjam();
        }
    }

    private void addDataA() {
        A.addX(new Pustakawan("Sejarah", "Dendy", "PST-1", 200000));
        A.addX(new LayananTeknis("Ilmu Informasi", "Joe", "LTK-1", 400000));
        A.addY(new Dosen("1.1", "Idelia", "PMT-1"));
        A.addY(new Mahasiswa("210711111", "Jeanny", "PMT-2"));
    }

    private void addDataB() {
        B.addX(new Pustakawan("Sejarah Indonesia","Joe", "PST-2", 600000));
        B.addX(new Pustakawan("Ilmu Politik ", "Kelvin", "PST-3", 500000));
        B.addY(new Dosen("2.1", "Rayzel", "PMT-3"));
        B.addY(new Dosen("2.2", "Carol", "PMT-4"));
    }

    private void addDataC() {
        C.addX(new LayananTeknis("Katalogisasi", "Vigo", "LTK-2", 200000));
        C.addX(new Pustakawan("Sejarah", "Joshua", "PST-4", 100000));
        C.addY(new Mahasiswa("210722222", "Ongky", "PMT-5"));
        C.addY(new Mahasiswa("210733333", "Ivan", "PMT-6"));
    }
}
