/* Nama File : Petani.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 21 Maret 2025
 */

package LATIHAN_PRAK5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia {
    private String asalKota;
    private static int hitungPetani;
    private final int C = 0;

    public Petani(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tanggalMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        hitungPetani++;
    }

    public static int getHitung() { 
        return hitungPetani; 
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tanggalMulaiKerja, LocalDate.now()) + C;
    }

    @Override
    public void cetakInfo() {
    super.cetakInfo();
    System.out.println("Asal Kota: " + asalKota);
}
}