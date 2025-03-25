/* Nama File : PNS.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 21 Maret 2025
 */

package LATIHAN_PRAK5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int hitungPNS;
    private final int A = 7;

    public PNS(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        hitungPNS++;
    }

    public static int getHitung() { 
        return hitungPNS; 
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tanggalMulaiKerja, LocalDate.now()) + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    // Menampilkan Informasi
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
    
}
