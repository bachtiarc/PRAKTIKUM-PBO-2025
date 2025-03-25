/* Nama File : Faultas.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Maret 2025
 */

package RESPONSI_MARET;

public class Fakultas {

    // Atribut
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    // Method
    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public double getTarifUKT() { 
        return tarifUKT; 
    }

    public void setTarifUKT(double tarifUKT) { 
        this.tarifUKT = tarifUKT; 
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

    // Menampilkan Informasi
    public void printInfo() {
        System.out.println();
        System.out.println("===== Data Fakultas ===== " + nama);
        System.out.println("Fakultas: " + nama);
        System.out.println("Tarif UKT: " + tarifUKT);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
