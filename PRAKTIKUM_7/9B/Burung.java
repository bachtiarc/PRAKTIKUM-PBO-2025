/* Nama File : Burung.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        this.nama = nama;
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi: Cuit.");
    }
}
