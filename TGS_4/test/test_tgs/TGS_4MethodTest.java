package test_tgs;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import tgs_4.*;

public class TGS_4MethodTest extends junit.framework.TestCase {
    private Sekolah A;
    private Sekolah B;
    private Sekolah C;

    @Override
    public void setUp() {
        try {
            List<Guru> bilikSekolahAGuru1 = new ArrayList<>();
            List<Guru> bilikSekolahAGuru2 = new ArrayList<>();
            A = new Sekolah("Budi Atma", bilikSekolahAGuru1, bilikSekolahAGuru2);
            addDataA();
        } catch (Exception e) {
            fail("Setup for Sekolah A failed: " + e.getMessage());
        }

        try {
            List<Guru> bilikSekolahBGuru = new ArrayList<>();
            List<Siswa> bilikSekolahBSiswa = new ArrayList<>();
            B = new Sekolah("Atma Sentosa", bilikSekolahBGuru, bilikSekolahBSiswa);
            addDataB();
        } catch (Exception e) {
            fail("Setup for Sekolah B failed: " + e.getMessage());
        }

        try {
            List<Guru> bilikSekolahCGuru = new ArrayList<>();
            List<Siswa> bilikSekolahCSiswa = new ArrayList<>();
            C = new Sekolah("Atma Budika", bilikSekolahCGuru, bilikSekolahCSiswa);
            addDataC();
        } catch (Exception e) {
            fail("Setup for Sekolah C failed: " + e.getMessage());
        }
    }

    @Test
    public void testSekolahProperties() {
        assertEquals("Budi Atma", A.getNamaSekolah());
        assertNotNull(A.getX());
        assertNotNull(A.getY());
        assertTrue(!A.getX().isEmpty());
        assertTrue(!A.getY().isEmpty());

        assertEquals("Atma Sentosa", B.getNamaSekolah());
        assertNotNull(B.getX());
        assertNotNull(B.getY());
        assertTrue(!B.getX().isEmpty());
        assertTrue(!B.getY().isEmpty());

        assertEquals("Atma Budika", C.getNamaSekolah());
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
    public void testGetGuruList() {
        double[] data = new double[] {
            1500000, 3000000, 3000000, 1500000,
            1250000, 1000000, 1200000, 1090000
        };
        
        int i = 0;
        
        List<Guru> dataAX = A.getX();
        assertEquals(2, dataAX.size());
        for (Guru obj : dataAX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(data[i++] == obj.hitungGaji());
        }
        
        List<Guru> dataAY = A.getY();
        assertEquals(2, dataAY.size());
        for (Guru obj : dataAY) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(data[i++] == obj.hitungGaji());
        }

        List<Guru> dataBX = B.getX();
        assertEquals(2, dataBX.size());
        for (Guru obj : dataBX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(data[i++] == obj.hitungGaji());
        }
        
        List<Guru> dataCX = C.getX();
        assertEquals(2, dataCX.size());
        for (Guru obj : dataCX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(data[i++] == obj.hitungGaji());
        }
    }

    @Test
    public void testGetSiswaList() {
        List<Siswa> dataBY = B.getY();
        assertEquals(2, dataBY.size());
        for (Siswa obj : dataBY) {
            assertNotNull(obj);
            obj.belajar();
            obj.memintaBimbingan();
        }

        List<Siswa> dataCY = C.getY();
        assertEquals(2, dataCY.size());
        for (Siswa obj : dataCY) {
            assertNotNull(obj);
            obj.belajar();
            obj.memintaBimbingan();
        }
    }

    private void addDataA() {
        A.addX(new GuruTetap("Jeanny", "GT-1", 1000000, 500000));
        A.addX(new GuruMagang("Kelvin", "MG-1", 500000, 6));
        A.addY(new GuruMagang("Carol", "MG-2", 500000, 6));
        A.addY(new GuruTetap("Pamela", "GT-2", 1000000, 500000));
    }

    private void addDataB() {
        Guru GT1 = new GuruTetap("Joesenchia", "GT-3", 1000000, 250000);
        Guru GT2 = new GuruMagang("Joshua", "MG-3", 4, 250000);
        B.addX(GT1);
        B.addX(GT2);
        B.addY(new SiswaReguler("Rayzel", "1001", GT1, 1000000));
        B.addY(new SiswaBeasiswa("Ivan", "1002", GT2, "Easy Beasiswa Club"));
    }

    private void addDataC() {
        Guru GM1 = new GuruMagang("Yohanes", "MG-4", 100000, 12);            
        Guru GM2 = new GuruTetap("Idelia", "GT-4", 1000000, 90000);
        C.addX(GM1);
        C.addX(GM2);
        C.addY(new SiswaReguler("Ongky", "1003", GM1, 2000000));
        C.addY(new SiswaReguler("Jeanny", "1004", GM2, 2000000));
    }
}
