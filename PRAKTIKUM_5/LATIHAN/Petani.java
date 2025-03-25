/* Nama File : Petani.java
 * Pembuat  : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal  : Jumat, 21 Maret 2025
 */

 package LATIHAN_PRAK5;

 import java.time.LocalDate;
 import java.time.temporal.ChronoUnit;
 
 public class Petani extends Manusia implements Pajak {

    // Atribut
    private String asalKota;
    private static int counterPetani = 0;
    
    // Method
    public Petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String asalKota) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani++;
    }
 
    public String getAsalKota() {
        return asalKota;
    }
 
    public void setAsalKota(String asalKota) {
        this.asalKota = asalKota;
    }
 
    public static int getCounterPetani() {
        return counterPetani;
    }
 
    @Override
    public int hitungMasaKerja() {
        int C = 1; 
        return (int) ChronoUnit.YEARS.between(getTanggalMulaiKerja(), LocalDate.now()) + C;
    }
 
    @Override
    public double hitungPajak() {
        return 0;
    }
    
    // Menampilkan Informasi
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asalKota);
    }
}
