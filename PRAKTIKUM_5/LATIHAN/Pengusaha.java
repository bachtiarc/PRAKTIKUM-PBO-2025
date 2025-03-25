/* Nama File : Pengusaha.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 21 Maret 2025
 */

package LATIHAN_PRAK5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int hitungPengusaha;
    private final int B = 5;

    public Pengusaha(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        hitungPengusaha++;
    }

    public static int getHitung() { 
        return hitungPengusaha; 
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tanggalMulaiKerja, LocalDate.now()) + B;
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
    super.cetakInfo();
    System.out.println("NPWP: " + npwp);
}
}