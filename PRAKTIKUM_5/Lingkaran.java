/* Nama File : Lingkaran.java
 * Pembuat  : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal  : Rabu, 26 Maret 2025
 */

package prak5;

class Lingkaran extends BangunDatar implements IResize {

    // Atribut
    private double radius;

    // Method
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void zoomIn() {
        radius *= 1.1;
    }

    @Override
    public void zoomOut() {
        radius *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        radius += radius * percent / 100.0;
    }

    // Menampilkan Informasi
    public void tampilkanUkuran() {
        System.out.println("Ukuran Lingkaran: " + radius);
    }
}
