/* Nama File : DosenTamu.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 14 Februari 2025
 */

package latihan_inheritance;

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate kontrakBerakhir;

    public DosenTamu(String NIP, String NIDK, String nama, LocalDate tanggalLahir, LocalDate TMT, double gajiPokok, String fakultas, LocalDate kontrakBerakhir) {
        super(NIP, nama, tanggalLahir, TMT, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.kontrakBerakhir = kontrakBerakhir;
    }

    public double hitungTunjangan() {
        return 0.025 * getGaji();
    }

    public String getNIDK() {
        return NIDK;
    }

    public String hitungMasaKerja() {
        Period period = Period.between(getTMT(), LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan         : Dosen Tamu");
        System.out.println("NIDK              : " + getNIDK());
        System.out.println("Masa Kerja        : " + hitungMasaKerja());
        System.out.println("Masa Kontrak Berakhir : " + formatTanggal(kontrakBerakhir));
        System.out.println("Tunjangan         : Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}
