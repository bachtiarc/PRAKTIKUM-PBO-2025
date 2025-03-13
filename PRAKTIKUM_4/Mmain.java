/* Nama File : Mmain.java
 * Deskripsi : Program utama untuk menguji kelas BangunDatar
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 11 Februari 2025
 */

package prak4;

public class Mmain {
    public static void main(String[] args) {
        // Membuat objek Persegi
        Persegi persegi = new Persegi(20, "Pink", "Hitam");
        System.out.println("Persegi:");
        persegi.printInfo();
        System.out.println("Luas: " + persegi.getLuas());
        System.out.println("Keliling: " + persegi.getKeliling());
        System.out.println("Diagonal: " + persegi.getDiagonal());
        System.out.println();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(10, "Biru", "Pink");
        System.out.println("Lingkaran:");
        lingkaran.printInfo();
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
    }

}
