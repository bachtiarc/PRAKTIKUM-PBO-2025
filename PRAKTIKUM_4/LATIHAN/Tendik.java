/* Nama File : Tendik.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 14 Februari 2025
 */

package latihan_inheritance;

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai{
    private String bidang;
    private static final int BUP = 55;



    public Tendik (String NIP, String Nama, LocalDate TTL, LocalDate TMT, double Gaji, String bidang) {
        super(NIP, Nama, TTL, TMT, Gaji);
        this.bidang = bidang;
    }

    public String getBidang(){
        return bidang;
    }

    public void setBidang(String bidang){
        this.bidang = bidang;
    }

    public int hitungMasaKerja() {
        return Period.between(getTMT(), LocalDate.now()).getYears();
    }

    public double hitungTunjangan() {
        return 0.01 * hitungMasaKerja() * getGaji();
    }

    public LocalDate hitungBUP() {
        return getTTL().plusYears(BUP).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang      : " + bidang);
        System.out.println("Tunjangan   : Rp " + hitungTunjangan());
        System.out.println("BUP         : " + hitungBUP());
    }
}