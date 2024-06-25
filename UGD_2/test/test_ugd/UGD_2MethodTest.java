package test_ugd;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import ugd_2.*;

public class UGD_2MethodTest extends junit.framework.TestCase {
    private Perpustakaan A;
    private Perpustakaan B;
    private Perpustakaan C;

    @Override
    public void setUp() {
        try {
            List<Pustakawan> listPerpusAPustakawan = new ArrayList<>();
            List<LayananTeknis> listPerpusALayananTeknis = new ArrayList<>();
            A = new Perpustakaan("Cabang Bonaventura", listPerpusAPustakawan, listPerpusALayananTeknis);
            addDataA();
        } catch (Exception e) {
            fail("Setup for Perpustakaan A failed: " + e.getMessage());
        }

        try {
            List<Pustakawan> listPerpusBPustakawan = new ArrayList<>();
            List<Pemustaka> listPerpusBPemustaka = new ArrayList<>();
            B = new Perpustakaan("Cabang Santoso", listPerpusBPustakawan, listPerpusBPemustaka);
            addDataB();
        } catch (Exception e) {
            fail("Setup for Perpustakaan B failed: " + e.getMessage());
        }

        try {
            List<LayananTeknis> listPerpusCLayananTeknis = new ArrayList<>();
            List<Pemustaka> listPerpusCPemustaka = new ArrayList<>();
            C = new Perpustakaan("Salam Group", listPerpusCLayananTeknis, listPerpusCPemustaka);
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
    public void testGetPustakawanList() {
        List<Pustakawan> dataAX = A.getX();
        assertEquals(2, dataAX.size());
        for (Pustakawan obj : dataAX) {
            assertNotNull(obj);
            obj.pengadaanBuku();
        }

        List<Pustakawan> dataBX = B.getX();
        assertEquals(2, dataBX.size());
        for (Pustakawan obj : dataBX) {
            assertNotNull(obj);
            obj.pengadaanBuku();
        }
    }

    @Test
    public void testGetLayananTeknisList() {
        List<LayananTeknis> dataAY = A.getY();
        assertEquals(2, dataAY.size());
        for (LayananTeknis obj : dataAY) {
            assertNotNull(obj);
            obj.membuatLaporan();
        }

        List<LayananTeknis> dataCX = C.getX();
        assertEquals(2, dataCX.size());
        for (LayananTeknis obj : dataCX) {
            assertNotNull(obj);
            obj.membuatLaporan();
        }
    }

    @Test
    public void testGetPemustakaList() {
        List<Pemustaka> dataBY = B.getY();
        assertEquals(2, dataBY.size());
        for (Pemustaka obj : dataBY) {
            assertNotNull(obj);
            obj.membacaBuku();
        }

        List<Pemustaka> dataCY = C.getY();
        assertEquals(2, dataCY.size());
        for (Pemustaka obj : dataCY) {
            assertNotNull(obj);
            obj.membacaBuku();
        }
    }

    private void addDataA() {
        A.addX(new Pustakawan("Dendy", "1", 200000, "Sejarah"));
        A.addX(new Pustakawan("Joe", "2", 400000, "Ilmu Informasi"));
        A.addY(new LayananTeknis("Idelia", "3", 100000, "Pengolahan Teknis"));
        A.addY(new LayananTeknis("Jeanny", "4", 200000, "Katalogisasi"));
    }

    private void addDataB() {
        B.addX(new Pustakawan("Joe", "420", 600000, "Sejarah Indonesia"));
        B.addX(new Pustakawan("Kelvin", "69", 500000, "Ilmu Politik"));
        B.addY(new Pemustaka("Rayzel", "The History of Obesity"));
        B.addY(new Pemustaka("Carol", "The History of Child"));
    }

    private void addDataC() {
        C.addX(new LayananTeknis("Carol", "10", 200000, "Pemeliharaan Koleksi"));
        C.addX(new LayananTeknis("Joshua", "100", 100000, "Pemeliharaan Koleksi"));
        C.addY(new Pemustaka("Ongky", "The History of Women"));
        C.addY(new Pemustaka("Ivan", "The Great Massacare"));
    }
}
