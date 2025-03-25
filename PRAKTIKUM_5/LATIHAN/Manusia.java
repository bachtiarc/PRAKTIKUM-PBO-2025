/* Nama File : Manusia.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 21 Maret 2025
 */

package LATIHAN_PRAK5;
import java.time.LocalDate;

abstract class Manusia {

    // Atribut
    protected String nama;
    protected LocalDate tanggalMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int hitungManusia;

    // Method
    public Manusia(String nama, LocalDate tanggalMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tanggalMulaiKerja = tanggalMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        hitungManusia++;
    }

    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tanggalMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
    }
}