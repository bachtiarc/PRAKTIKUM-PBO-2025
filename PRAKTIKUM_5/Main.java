/* Nama File : Mmain.java
 * Deskripsi : Program utama untuk menguji kelas BangunDatar
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 18 Februari 2025
 */

package prak5;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(7.5);
        Lingkaran lingkaran = new Lingkaran(6.2);
 
        System.out.println("Ukuran awal:");
        persegi.tampilkanUkuran();
        lingkaran.tampilkanUkuran();
 
        System.out.println("\nSetelah zoomIn:");
        persegi.zoomIn();
        lingkaran.zoomIn();
        persegi.tampilkanUkuran();
        lingkaran.tampilkanUkuran();
 
        System.out.println("\nSetelah zoomOut:");
        persegi.zoomOut();
        lingkaran.zoomOut();
        persegi.tampilkanUkuran();
        lingkaran.tampilkanUkuran();
 
        System.out.println("\nSetelah zoom dengan 20%:");
        persegi.zoom(20);
        lingkaran.zoom(20);
        persegi.tampilkanUkuran();
        lingkaran.tampilkanUkuran();
    }
} 