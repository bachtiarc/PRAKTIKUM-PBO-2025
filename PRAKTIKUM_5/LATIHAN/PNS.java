/* Nama File : PNS.java
 * Pembuat  : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal  : Jumat, 21 Maret 2025
 */

package LATIHAN_PRAK5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
 
public class PNS extends Manusia implements Pajak {

    // Atribut
    private String nip;
    private static int counterPNS = 0;
    
    // Method
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
 
    public String getNip() {
        return nip;
    }
 
    public void setNip(String nip) {
        this.nip = nip;
    }
 
    public static int getCounterPNS() {
        return counterPNS;
    }
 
    @Override
    public int hitungMasaKerja() {
        int A = 0;  
        return (int) ChronoUnit.YEARS.between(getTanggalMulaiKerja(), LocalDate.now()) + A;
    }
 
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }
    
    // Menampilkan Informasi
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP        : " + nip);
    }
} 
