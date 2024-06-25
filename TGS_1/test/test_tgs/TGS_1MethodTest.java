package test_tgs;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import tgs_1.*;

public class TGS_1MethodTest extends junit.framework.TestCase {
    private RumahSakit A;
    private RumahSakit B;
    private RumahSakit C;

    @Override
    public void setUp() {
        try {
            List<Staff> bilikRSADokter = new ArrayList<>();
            List<Pasien> bilikRSAPasien = new ArrayList<>();
            A = new RumahSakit("Budi Susilo", bilikRSADokter, bilikRSAPasien);
            addDataRSA();
        } catch (Exception e) {
            fail("Setup for RumahSakit A failed: " + e.getMessage());
        }

        try {
            List<Staff> bilikRSBDokter = new ArrayList<>();
            List<Pasien> bilikRSBPasien = new ArrayList<>();
            B = new RumahSakit("Santoso Group", bilikRSBDokter, bilikRSBPasien);
            addDataRSB();
        } catch (Exception e) {
            fail("Setup for RumahSakit B failed: " + e.getMessage());
        }

        try {
            List<Staff> bilikRSCSuster = new ArrayList<>();
            List<Pasien> bilikRSCPasien = new ArrayList<>();
            C = new RumahSakit("Puri Raharja", bilikRSCSuster, bilikRSCPasien);
            addDataRSC();
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
    public void testGetIStaffList() {
        double[] data = new double[] {
           2280000, 1140000, 4060000,
           517000, 4060000, 767000
        };
        
        int i = 0;
        
        List<Staff> dataAX = A.getX();
        assertEquals(2, dataAX.size());
        for (Staff obj : dataAX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(data[i++] == obj.hitungGaji());
        }

        List<Staff> dataBX = B.getX();
        assertEquals(2, dataBX.size());
        for (Staff obj : dataBX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(data[i++] == obj.hitungGaji());
        }
        
        List<Staff> dataCX = C.getX();
        assertEquals(2, dataCX.size());
        for (Staff obj : dataCX) {
            assertNotNull(obj);
            obj.bekerja();
            assertTrue(data[i++] == obj.hitungGaji());
        }
    }

    @Test
    public void testGetIPasienList() {
         double[] data = new double[] {
           36600, 55500, 33300,
           36600, 55500, 55500
        };
        
        int i = 0;
        
        List<Pasien> dataAY = A.getY();
        assertEquals(2, dataAY.size());
        for (Pasien obj : dataAY) {
            assertNotNull(obj);
            obj.daftarPeriksa();
            assertTrue(data[i++] == obj.hitungBayarPeriksa());
        }
        
        List<Pasien> dataBY = B.getY();
        assertEquals(2, dataBY.size());
        for (Pasien obj : dataBY) {
            assertNotNull(obj);
            obj.daftarPeriksa();
            assertTrue(data[i++] == obj.hitungBayarPeriksa());
        }

        List<Pasien> dataCY = C.getY();
        assertEquals(2, dataCY.size());
        for (Pasien obj : dataCY) {
            assertNotNull(obj);
            obj.daftarPeriksa();
            assertTrue(data[i++] == obj.hitungBayarPeriksa());
        }
    }

    private void addDataRSA() {
        A.addX(new Dokter("DTR-1", "Dendy", "Hati", 2000000));
        A.addX(new Suster("Pagi", "Idelia", "Hati", 1000000));
        A.addY(new PasienBPJS("BPJS-1", "Rayzel", 21, "A"));
        A.addY(new PasienBiasa("Atma Peduli", "ATMA-1", "Carol", 22, "B"));
    }

    private void addDataRSB() {
        B.addX(new Dokter("DTR-2", "Joe", "Saraf", 4000000));
        B.addX(new Suster("Sore", "Jeanny", "Mata", 300000));
        B.addY(new PasienBPJS("BPJS-2", "Joshua", 19, "AB"));
        B.addY(new PasienBPJS("BPJS-3", "Santoso", 22, "O"));
    }

    private void addDataRSC() {
        C.addX(new Dokter("DTR-3", "Joe", "Saraf", 4000000));
        C.addX(new Dokter("DTR-4", "Kelvin", "Mata", 300000));
        C.addY(new PasienBiasa("Atma Peduli", "ATMA-2", "Ongky", 21, "O"));
        C.addY(new PasienBiasa("Atma Peduli", "ATMA-3", "Ivan", 22, "AB"));
    }
}
