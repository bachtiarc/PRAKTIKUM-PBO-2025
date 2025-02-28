/* Nama File : Kendaraan.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Februari 2025
 */

public class Kendaraan {
    
    /*********** ATRIBUT **********/
    private String noPlat;
    private String jenis;


    /*********** METHOD **********/
    
    // Konstruktor tanpa parameter
    public Kendaraan() {
        noPlat = " ";
        jenis = " ";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String a, String b) {
        this.noPlat = a;
        this.jenis = b;
    }

    // Mengembaikan nilai noPlat
    public String getnoPlat() {
        return noPlat;
    }

    // Mengembalikan nilai jenis
    public String getjenis() {
        return jenis;
    }

    // Mengeset nilai noPlat dengan a
    public void setnoPlat(String a) {
        noPlat = a;
    }

    // Mengeset nilai jenis dengan b
    public void setjenis(String b) {
        jenis = b;
    }

    // Menampilkan data kendaraan
    public void printKendaraan() {
        System.out.println("Plat nomer kendaraan MHS: " + noPlat + " - " + "Jenis Kendaraan: " + jenis);
    }
}
