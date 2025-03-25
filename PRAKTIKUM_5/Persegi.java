/* Nama File : Persegi.java
 * Deskripsi : berisi atribut dan method dalam class Persegi
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 11 Februari 2025
 */

 package prak5;

 class Persegi extends BangunDatar implements IResize {

    // Atribut
    private double sisi;
    
    // Method
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
 
    @Override
    public double getLuas() {
        return sisi * sisi;
    }
 
    @Override
    public double getKeliling() {
        return 4 * sisi;
    }
 
    @Override
    public void zoomIn() {
        sisi *= 1.1;
    }
 
    @Override
    public void zoomOut() {
        sisi *= 0.9;
    }
 
    @Override
    public void zoom(int percent) {
        sisi += sisi * percent / 100.0;
    }
    
    // Menampilkan Informasi
    public void tampilkanUkuran() {
        System.out.println("Ukuran Persegi: " + sisi);
    }
} 