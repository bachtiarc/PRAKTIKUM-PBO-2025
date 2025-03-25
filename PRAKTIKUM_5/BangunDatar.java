/* Nama File : BangunDatar.java
 * Deskripsi : berisi atribut dan method dalam class BangunDatar
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 18 Februari 2025
 */

package prak5;

 public abstract class BangunDatar {

    // Atribut
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected double jari;
    
    // Method tanpa parameter
    public BangunDatar() {}
    
    // Method
    public int getJmlSisi() {
        return jmlSisi;
    }
 
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
 
    public String getWarna() {
        return warna;
    }
 
    public void setWarna(String warna) {
        this.warna = warna;
    }
 
    public String getBorder() {
        return border;
    }
 
    public void setBorder(String border) {
        this.border = border;
    }
 
    public double getJari() {
        return jari;
    }
 
    public void setJari(double jari) {
        this.jari = jari;
    }
 
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
 
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
    
    // Abstract
    public abstract double getLuas();
    public abstract double getKeliling();
    
    // Menampilkan Informasi
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
} 