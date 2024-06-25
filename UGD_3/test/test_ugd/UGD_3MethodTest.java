package test_ugd;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import ugd_3.*;

public class UGD_3MethodTest extends junit.framework.TestCase {
    private Kos A;
    private Kos B;
    private Kos C;

    @Override
    public void setUp() {
        try {
            List<KamarEksekutif> listKosAKamarEksekutif = new ArrayList<>();
            List<KamarReguler> listKosAKamarReguler = new ArrayList<>();
            A = new Kos("Atma Youth", listKosAKamarEksekutif, listKosAKamarReguler);
            addDataA();
        } catch (Exception e) {
            fail("Setup for Kos A failed: " + e.getMessage());
        }

        try {
            List<KamarEksekutif> listKosBKamarEksekutif = new ArrayList<>();
            List<Penyewa> listKosBPenyewa = new ArrayList<>();
            B = new Kos("Santoso Group", listKosBKamarEksekutif, listKosBPenyewa);
            addDataB();
        } catch (Exception e) {
            fail("Setup for Kos B failed: " + e.getMessage());
        }

        try {
            List<KamarReguler> listKosCKamarReguler = new ArrayList<>();
            List<Penyewa> listKosCPenyewa = new ArrayList<>();
            C = new Kos("Cheap China Town", listKosCKamarReguler, listKosCPenyewa);
            addDataC();
        } catch (Exception e) {
            fail("Setup for Kos C failed: " + e.getMessage());
        }
    }

    @Test
    public void testKosProperties() {
        assertEquals("Atma Youth", A.getNamaKos());
        assertNotNull(A.getX());
        assertNotNull(A.getY());
        assertTrue(!A.getX().isEmpty());
        assertTrue(!A.getY().isEmpty());

        assertEquals("Santoso Group", B.getNamaKos());
        assertNotNull(B.getX());
        assertNotNull(B.getY());
        assertTrue(!B.getX().isEmpty());
        assertTrue(!B.getY().isEmpty());

        assertEquals("Cheap China Town", C.getNamaKos());
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
    public void testGetKamarRegulerList() {
        String[] data = new String[] {
          "R1", "R2", "R3", "R4"
        };
        
        double[] biaya = new double[] {
          600000, 720000, 600000, 540000
        };
        
        int i = 0;
        
        List<KamarReguler> dataAY = A.getY();
        assertEquals(2, dataAY.size());
        for (KamarReguler obj : dataAY) {
            assertNotNull(obj);
            assertTrue(data[i].equalsIgnoreCase(obj.getNomorKamar()));
            assertTrue(biaya[i++] == obj.hitungTotalBiaya());
        }

        List<KamarReguler> dataCX = C.getX();
        assertEquals(2, dataCX.size());
        for (KamarReguler obj : dataCX) {
            assertNotNull(obj);
            assertTrue(data[i].equalsIgnoreCase(obj.getNomorKamar()));
            assertTrue(biaya[i++] == obj.hitungTotalBiaya());
        }
    }

    @Test
    public void testGetKamarEksekutifList() {
        String[] data = new String[] {
          "E1", "E2", "E3", "E4"
        };
        
        double[] biaya = new double[] {
          2400000, 3600000, 4800000, 6000000
        };
        
        int i = 0;
        
        List<KamarEksekutif> dataAX = A.getX();
        assertEquals(2, dataAX.size());
        for (KamarEksekutif obj : dataAX) {
            assertNotNull(obj);
            assertTrue(data[i].equalsIgnoreCase(obj.getNomorKamar()));
            assertTrue(biaya[i++] == obj.hitungTotalBiaya());
        }

        List<KamarEksekutif> dataBX = B.getX();
        assertEquals(2, dataBX.size());
        for (KamarEksekutif obj : dataBX) {
            assertNotNull(obj);
            assertTrue(data[i].equalsIgnoreCase(obj.getNomorKamar()));
            assertTrue(biaya[i++] == obj.hitungTotalBiaya());
        }
    }

    @Test
    public void testGetPenyewaList() {
        List<Penyewa> dataBY = B.getY();
        assertEquals(3, dataBY.size());
        for (Penyewa obj : dataBY) {
            assertNotNull(obj);
        }

        List<Penyewa> dataCY = C.getY();
        assertEquals(3, dataCY.size());
        for (Penyewa obj : dataCY) {
            assertNotNull(obj);
        }
    }

    private void addDataA() {
        A.addX(new KamarEksekutif("E1", "Wifi, Kamar Mandi Dalam", 200000, "Kolam Renang Pribadi"));
        A.addX(new KamarEksekutif("E2", "Wifi, Kamar Mandi Dalam, Makan Pagi", 300000, "Lounge Kos"));
        A.addY(new KamarReguler("R1", "Wifi", 100000, 3));
        A.addY(new KamarReguler("R2", "Wifi", 120000, 2));
    }

    private void addDataB() {
        KamarEksekutif E3 = new KamarEksekutif("E3", "Wifi, Kamar Mandi Dalam, Listrik", 400000, "Lounge Kos");
        B.addX(E3);
        KamarEksekutif E4 = new KamarEksekutif("E4", "Wifi, Kamar Mandi Dalam, Makan Gratis", 500000, "Kolam Renang Pribadi");
        B.addX(E4);
        B.addY(new Penyewa("Joesenchia", "Asisten Dosen", E3));
        Penyewa carol = new Penyewa("Carol", "Guru TK");
        B.addY(carol);
        B.addY(new Penyewa("Kelvin", "Weapon Master"));
        carol.menyewaKamarEksekutif(E4);
        carol.menyewaKamarEksekutif(E3);
    }

    private void addDataC() {
        KamarEksekutif E4 = new KamarEksekutif("E4", "Wifi, Kamar Mandi Dalam, Makan Gratis", 500000, "Kolam Renang Pribadi");
        KamarReguler R3 = new KamarReguler("R3", "Wifi", 100000, 2);
        C.addX(R3);
        KamarReguler R4 = new KamarReguler("R4", "Kamar Mandi", 90000, 4);
        C.addX(R4);
        C.addY(new Penyewa("Ongky", "Guru IT", R3));
        Penyewa ivan = new Penyewa("Ivan", "Gym Instructor");
        C.addY(ivan);
        C.addY(new Penyewa("Yohanes", "Pengusaha Chicken"));
        ivan.menyewaKamarReguler(R4);
        ivan.menyewaKamarEksekutif(E4);
    }
}
