package test_tgs;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import tgs_3.*;

public class TGS_3MethodTest extends junit.framework.TestCase {
    private Kos A;
    private Kos B;
    private Kos C;

    @Override
    public void setUp() {
        try {
            List<Kamar> listKosAKamarA = new ArrayList<>();
            List<Kamar> listKosAKamarB = new ArrayList<>();
            A = new Kos("Atma Youth", listKosAKamarA, listKosAKamarB);
            addDataA();
        } catch (Exception e) {
            fail("Setup for Kos A failed: " + e.getMessage());
        }

        try {
            List<Kamar> listKosBKamar = new ArrayList<>();
            List<Penyewa> listKosBPenyewa = new ArrayList<>();
            B = new Kos("Santoso Group", listKosBKamar, listKosBPenyewa);
            addDataB();
        } catch (Exception e) {
            fail("Setup for Kos B failed: " + e.getMessage());
        }

        try {
            List<Kamar> listKosCKamar = new ArrayList<>();
            List<Penyewa> listKosCPenyewa = new ArrayList<>();
            C = new Kos("Cheap China Town", listKosCKamar, listKosCPenyewa);
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
    public void testGetKamarList() {
        String[] data = new String[] {
          "E1", "R1", "R2", "E2", "E3", "E4", "R3", "R4"
        };
        
        double[] biaya = new double[] {
           2400000, 600000, 720000, 3600000, 4800000, 6000000, 600000, 540000
        };
        
        int i = 0;
        
        List<Kamar> dataAX = A.getX();
        assertEquals(2, dataAX.size());
        for (Kamar obj : dataAX) {
            assertNotNull(obj);
            assertTrue(data[i].equalsIgnoreCase(obj.getNomorKamar()));
            assertTrue(biaya[i++] == obj.hitungTotalBiaya());
        }
        
        List<Kamar> dataAY = A.getY();
        assertEquals(2, dataAY.size());
        for (Kamar obj : dataAY) {
            assertNotNull(obj);
            assertTrue(data[i].equalsIgnoreCase(obj.getNomorKamar()));
            assertTrue(biaya[i++] == obj.hitungTotalBiaya());
        }
        
        List<Kamar> dataBX = B.getX();
        assertEquals(2, dataBX.size());
        for (Kamar obj : dataBX) {
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
    public void testGetPenyewaList() {
        List<Penyewa> dataBY = B.getY();
        assertEquals(3, dataBY.size());
        for (Penyewa obj : dataBY) {
            assertNotNull(obj);
            obj.membayarKos();
        }

        List<Penyewa> dataCY = C.getY();
        assertEquals(3, dataCY.size());
        for (Penyewa obj : dataCY) {
            assertNotNull(obj);
            obj.membayarKos();
        }
    }

    private void addDataA() {
        A.addX(new KamarEksekutif("Kolam Renang Pribadi","E1", "Wifi, Kamar Mandi Dalam", 200000));
        A.addX(new KamarReguler(3, "R1", "Wifi", 100000));
        A.addY(new KamarReguler(2, "R2", "Wifi", 120000));
        A.addY(new KamarEksekutif("Lounge Kos", "E2", "Wifi, Kamar Mandi, Makan Pagi", 300000));
    }

    private void addDataB() {
        Kamar E3 = new KamarEksekutif("Lounge Kos", "E3", "Wifi, Kamar Mandi", 400000);
        B.addX(E3);
        Kamar E4 = new KamarEksekutif("Kolam Renang Pribadi", "E4", "Wifi, Kamar Mandi, Makan Gratis", 500000);
        B.addX(E4);
        B.addY(new Pegawai("Joesenchia", E3, "Asisten Dosen"));
        Penyewa carol = new Pegawai("Carol", "Guru TK");
        B.addY(carol);
        B.addY(new Mahasiswa("Yohanes", "Ternak Lele"));
        carol.menyewa(E4);
        carol.menyewa(E3);
    }

    private void addDataC() {
        Kamar E4 = new KamarEksekutif("Kolam Renang Pribadi", "E4", "Wifi, Kamar Mandi, Makan Gratis", 500000);
        Kamar R3 = new KamarReguler(2, "R3", "Wifi", 100000);
        C.addX(R3);
        KamarReguler R4 = new KamarReguler(2, "R4", "Kamar Mandi", 90000);
        C.addX(R4);
        C.addY(new Mahasiswa("Ongky", R3, "Informatika"));
        Penyewa ivan = new Mahasiswa("Ivan", "Teknik Industri");
        C.addY(ivan);
        C.addY(new Pegawai("Kelvin", "Weapon Master"));
        ivan.menyewa(R4);
        ivan.menyewa(E4);
    }
}
