/* Nama File : BangunDatar.java
 * Deskripsi : berisi atribut dan method dalam class BangunDatar
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 11 Februari 2025
 */

package prak4;

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private double jari;

    public BangunDatar() {

    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}
