/* Nama File : Pengusaha.java
 * Pembuat  : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal  : Jumat, 21 Maret 2025
 */

package LATIHAN_PRAK5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
 
public class Pengusaha extends Manusia implements Pajak {

    // Atribut
    private String npwp;
    private static int counterPengusaha = 0;
    
    // Method
    public Pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String npwp) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
 
    public String getNpwp() {
        return npwp;
    }
 
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
 
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
 
    @Override
    public int hitungMasaKerja() {
        int B = 7; 
        return (int) ChronoUnit.YEARS.between(getTanggalMulaiKerja(), LocalDate.now()) + B;
    }
 
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
 
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP       : " + npwp);
    }
} 
