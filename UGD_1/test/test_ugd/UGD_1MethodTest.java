package test_ugd;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import ugd_1.*;

public class UGD_1MethodTest extends junit.framework.TestCase {
    private RumahSakit A;
    private RumahSakit B;
    private RumahSakit C;

    @Override
    public void setUp() {
        try {
            List<Dokter> bilikRSADokter = new ArrayList<>();
            List<Suster> bilikRSASuster = new ArrayList<>();
            A = new RumahSakit("Budi Susilo", bilikRSADokter, bilikRSASuster);
            addDokterSusterToRumahSakitA();
        } catch (Exception e) {
            fail("Setup for RumahSakit A failed: " + e.getMessage());
        }

        try {
            List<Dokter> bilikRSBDokter = new ArrayList<>();
            List<Pasien> bilikRSBPasien = new ArrayList<>();
            B = new RumahSakit("Santoso Group", bilikRSBDokter, bilikRSBPasien);
            addDokterPasienToRumahSakitB();
        } catch (Exception e) {
            fail("Setup for RumahSakit B failed: " + e.getMessage());
        }

        try {
            List<Suster> bilikRSCSuster = new ArrayList<>();
            List<Pasien> bilikRSCPasien = new ArrayList<>();
            C = new RumahSakit("Puri Raharja", bilikRSCSuster, bilikRSCPasien);
            addSusterPasienToRumahSakitC();
        } catch (Exception e) {
            fail("Setup for RumahSakit C failed: " + e.getMessage());
        }
    }

    @Test
    public void testRumahSakitProperties() {
        assertEquals("Budi Susilo", A.getNamaRS());
        assertNotNull(A.getX());
        assertNotNull(A.getY());
        assertTrue(!A.getX().isEmpty());
        assertTrue(!A.getY().isEmpty());

        assertEquals("Santoso Group", B.getNamaRS());
        assertNotNull(B.getX());
        assertNotNull(B.getY());
        assertTrue(!B.getX().isEmpty());
        assertTrue(!B.getY().isEmpty());

        assertEquals("Puri Raharja", C.getNamaRS());
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
    public void testGetDokterList() {
        List<Dokter> dataAX = A.getX();
        assertEquals(2, dataAX.size());
        for (Dokter obj : dataAX) {
            assertNotNull(obj);
        }

        List<Dokter> dataBX = B.getX();
        assertEquals(2, dataBX.size());
        for (Dokter obj : dataBX) {
            assertNotNull(obj);
        }
    }

    @Test
    public void testGetSusterList() {
        List<Suster> dataAY = A.getY();
        assertEquals(2, dataAY.size());
        for (Suster obj : dataAY) {
            assertNotNull(obj);
        }

        List<Suster> dataCY = C.getX();
        assertEquals(2, dataCY.size());
        for (Suster obj : dataCY) {
            assertNotNull(obj);
        }
    }

    @Test
    public void testGetPasienList() {
        List<Pasien> dataBY = B.getY();
        assertEquals(2, dataBY.size());
        for (Pasien obj : dataBY) {
            assertNotNull(obj);
        }

        List<Pasien> dataCY = C.getY();
        assertEquals(2, dataCY.size());
        for (Pasien obj : dataCY) {
            assertNotNull(obj);
        }
    }

    private void addDokterSusterToRumahSakitA() {
        A.addX(new Dokter("DTR-1", "Dendy", "Hati", 2000000));
        A.addX(new Dokter("DTR-2", "Joe", "Kelamin", 5000000));
        A.addY(new Suster("Idelia", "Hati", 1000000, "Malam"));
        A.addY(new Suster("Jeanny", "Jantung", 500000, "Pagi"));
    }

    private void addDokterPasienToRumahSakitB() {
        B.addX(new Dokter("DTR-3", "Joe", "Saraf", 4000000));
        B.addX(new Dokter("DTR-4", "Kelvin", "Mata", 300000));
        B.addY(new Pasien("Rayzel", 21, "A"));
        B.addY(new Pasien("Carol", 22, "B"));
    }

    private void addSusterPasienToRumahSakitC() {
        C.addX(new Suster("Carol", "Anak", 5000, "Siang"));
        C.addX(new Suster("Joshua", "Mental", 300000, "Sore"));
        C.addY(new Pasien("Ongky", 21, "O"));
        C.addY(new Pasien("Ivan", 22, "AB"));
    }
}
