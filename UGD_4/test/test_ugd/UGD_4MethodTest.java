package test_ugd;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import ugd_4.*;

public class UGD_4MethodTest extends junit.framework.TestCase {
    private Sekolah A;
    private Sekolah B;
    private Sekolah C;

    @Override
    public void setUp() {
        try {
            List<GuruTetap> bilikSekolahAGuruTetap= new ArrayList<>();
            List<GuruMagang> bilikSekolahAGuruMagang = new ArrayList<>();
            A = new Sekolah("Budi Atma", bilikSekolahAGuruTetap, bilikSekolahAGuruMagang);
            addDataA();
        } catch (Exception e) {
            fail("Setup for Sekolah A failed: " + e.getMessage());
        }

        try {
            List<GuruTetap> bilikSekolahBGuruTetap= new ArrayList<>();
            List<Siswa> bilikSekolahBSiswa = new ArrayList<>();
            B = new Sekolah("Atma Sentosa", bilikSekolahBGuruTetap, bilikSekolahBSiswa);
            addDataB();
        } catch (Exception e) {
            fail("Setup for Sekolah B failed: " + e.getMessage());
        }

        try {
            List<GuruMagang> bilikSekolahCGuruMagang = new ArrayList<>();
            List<Siswa> bilikSekolahCSiswa = new ArrayList<>();
            C = new Sekolah("Atma Budika", bilikSekolahCGuruMagang, bilikSekolahCSiswa);
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
    public void testGetGuruTetapList() {        
        List<GuruTetap> dataAX = A.getX();
        assertEquals(2, dataAX.size());
        for (GuruTetap obj : dataAX) {
            assertNotNull(obj);
            obj.mengajar();
        }

        List<GuruTetap> dataBX = B.getX();
        assertEquals(2, dataBX.size());
        for (GuruTetap obj : dataBX) {
            assertNotNull(obj);
            obj.mengajar();
        }
    }

    @Test
    public void testGetGuruMagangList() {        
        List<GuruMagang> dataAY = A.getY();
        assertEquals(2, dataAY.size());
        for (GuruMagang obj : dataAY) {
            assertNotNull(obj);
            obj.mengajar();
            obj.membuatLaporan();
        }

        List<GuruMagang> dataCX = C.getX();
        assertEquals(2, dataCX.size());
        for (GuruMagang obj : dataCX) {
            assertNotNull(obj);
            obj.mengajar();
            obj.membuatLaporan();
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
        A.addX(new GuruTetap("Jeanny", "GR-1", 1000000, 500000));
        A.addX(new GuruTetap("Pamela", "GR-2", 1000000, 500000));
        A.addY(new GuruMagang("Carol", "MG-1", 500000, 6));
        A.addY(new GuruMagang("Kelvin", "MG-2", 500000, 6));
    }

    private void addDataB() {
        GuruTetap GT1 = new GuruTetap("Joesenchia", "GR-3", 1000000, 250000);
        GuruTetap GT2 = new GuruTetap("Joshua", "GR-4", 1000000, 200000);
        B.addX(GT1);
        B.addX(GT2);
        B.addY(new Siswa("Rayzel", "1001", GT1));
        B.addY(new Siswa("Ivan", "1002", GT2));
    }

    private void addDataC() {
        GuruMagang GM1 = new GuruMagang("Yohanes", "MG-3", 100000, 12);
        GuruMagang GM2 = new GuruMagang("Idelia", "MG-4", 90000, 12);
        C.addX(GM1);
        C.addX(GM2);
        C.addY(new Siswa("Ongky", "1003", GM1));
        C.addY(new Siswa("Jeanny", "1004", GM2));
    }
}
