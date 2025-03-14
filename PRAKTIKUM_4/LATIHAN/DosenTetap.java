/* Nama File : DosenTetap.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 14 Februari 2025
 */

package latihan_inheritance;

import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String NIDN, String Nama, LocalDate TTL, LocalDate TMT, double Gaji, String fakultas) {
        super(NIP, Nama, TTL, TMT, Gaji, fakultas);
        this.NIDN = NIDN;
    }

    public String getNIDN() {
        return NIDN;
    }

    public void setNIDN(String NIDN) {
        this.NIDN = NIDN;
    }

    public String getMasaKerja() {
        Period period = Period.between(getTMT(), LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    public LocalDate hitungBUP() {
        return getTTL().plusYears(65).withDayOfMonth(1);
    }

    public double hitungTunjangan() {
        int masaKerja = Period.between(getTMT(), LocalDate.now()).getYears();
        return 0.02 * masaKerja * getGaji();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("NIDN              : " + getNIDN());
        System.out.println("BUP               : " + formatTanggal(hitungBUP()));
        System.out.println("Tunjangan         : Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}
