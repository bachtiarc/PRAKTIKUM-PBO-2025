/* Nama File : Karyawan.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Februari 2025
 */

package RESPONSI_MARET;

public class Karyawan extends civitasAkademika {

    // Atribut
    private String NIP;
    private int masaKerja;

    // Method
    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }

    public String getNIP() { 
        return NIP; 
    }

    public void setNIP(String NIP) { 
        this.NIP = NIP; 
    }

    public int getMasaKerja() { 
        return masaKerja; 
    }

    public void setMasaKerja(int masaKerja) { 
        this.masaKerja = masaKerja; 
    }

    // Menampilkan Informasi
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
    }
}
