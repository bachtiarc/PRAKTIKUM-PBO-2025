/* Nama File : Pegawai.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 14 Februari 2025
 */

package latihan_inheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;

public class Pegawai {
    private String NIP;
    private String Nama;
    private LocalDate TTL;
    private LocalDate TMT;
    private double Gaji;

    public Pegawai(String NIP, String Nama, LocalDate TTL, LocalDate TMT, double Gaji) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.TTL = TTL;
        this.TMT = TMT;
        this.Gaji = Gaji;
    }

    public String formatTanggal(LocalDate tanggal) {
        return tanggal.format(DateTimeFormatter.ofPattern("d MMMM yyyy"));
    }

    // Mengembalikan dan mengeset NIP
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    // Mengembalikan dan mengeset Nama
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // Mengembalikan dan mengeset TTL
    public LocalDate getTTL() {
        return TTL;
    }

    public void setTTL(LocalDate TTL) {
        this.TTL = TTL;
    }

    // Mengembalikan dan mengeset Gaji
    public double getGaji() {
        return Gaji;
    }

    public void setGaji(double Gaji) {
        this.Gaji = Gaji;
    }

    // Mengembalikan dan mengset TMT
    public LocalDate getTMT() {
        return TMT;
    }

    public void setTMT(LocalDate TMT) {
        this.TMT = TMT;
    }

    public void printInfo() {
        System.out.println("NIP                 : " + NIP);
        System.out.println("Nama                : " + Nama);
        System.out.println("Tanggal Lahir       : " + formatTanggal(TTL));
        System.out.println("Gaji Pokok          : Rp " + String.format("%,.2f", Gaji));
    }
}
