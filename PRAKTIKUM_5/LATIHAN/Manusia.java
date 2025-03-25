/* Nama File : Manusia.java
 * Pembuat  : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal  : Jumat, 21 Maret 2025
 */

package LATIHAN_PRAK5;

import java.time.LocalDate;
 
public abstract class Manusia {

    // Atribut
    protected String nama;
    protected LocalDate tglMulaiKerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    
    // Method
    public Manusia(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tglMulaiKerja = tglMulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
 
    public String getNama() {
        return nama;
    }
 
    public void setNama(String nama) {
        this.nama = nama;
    }
 
    public LocalDate getTanggalMulaiKerja() {
        return tglMulaiKerja;
    }
 
    public void setTanggalMulaiKerja(LocalDate tglMulaiKerja) {
        this.tglMulaiKerja = tglMulaiKerja;
    }
 
    public String getAlamat() {
        return alamat;
    }
 
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
 
    public double getPendapatan() {
        return pendapatan;
    }
 
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
 
    public static int getCounterMns() {
        return counterMns;
    }
    
    // Menampilkan Informasi
    public void cetakInfo() {
        System.out.println("Nama       : " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat     : " + alamat);
        System.out.println("Pendapatan : " + pendapatan);
    }
 
    public abstract int hitungMasaKerja();
 }
 
