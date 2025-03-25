/* Nama File : Tendik.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Februari 2025
 */

package RESPONSI_MARET;

public class Tendik extends Karyawan {

    // Atribut
    private static int hitung = 0;
    private static final double gajiPokok = 4000000;

    // Method
    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        hitung++;
    }

    public static int getHitung() { 
        return hitung; 
    }
    
    public double hitungGaji() {
        return gajiPokok + (getMasaKerja() * 0.01 * gajiPokok);
    }
    
    // Menampilkan Informasi
    public void printInfo() {
        super.printInfo();
        System.out.println("Gaji: " + hitungGaji());
    }
}
