/* Nama File : Lingkaran.java
 * Deskripsi : berisi atribut dan method dalam class Lingkaran
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 11 Februari 2025
 */

package prak4;

public class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran() {

    }

    public Lingkaran(double diameter, String warna, String border) {
        jari = 0.5 * diameter;
        setWarna(warna);
        setBorder(border);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return 3.14 * jari * jari;
    }

    public double getKeliling() {
        return 2 * 3.14 * jari;
    }
}
