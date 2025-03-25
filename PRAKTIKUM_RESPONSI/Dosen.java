/* Nama File : Dosen.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Maret 2025
 */

package RESPONSI_MARET;

public class Dosen extends Karyawan {

    // Atribut
    private static int hitung = 0;
    private Fakultas fakultas;

    // Method
    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        hitung++;
    }

    public static int getHitung() { 
        return hitung; 
    }

    public Fakultas getFakultas() { 
        return fakultas; 
    }

    public void setFakultas(Fakultas fakultas) { 
        this.fakultas = fakultas; 
    }
    
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.01 * fakultas.getGajiPokok());
    }
    
    // Menampilkan Informasi
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: " + hitungGaji());
    }
}
