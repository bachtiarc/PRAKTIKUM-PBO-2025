/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Februari 2025
 */

public class MataKuliah {
    
    /*********** ATRIBUT **********/
    private String idMatkul;
    private String nama;
    private int sks;

    /*********** METHOD **********/

    // Konstruktor tanpa parameter
    public MataKuliah() {
        idMatkul = " ";
        nama = " ";
        sks = 0;
    }

    // Konstruktor dengan parameter
    public MataKuliah(String a, String b, int c) {
        this.idMatkul = a;
        this.nama = b;
        this.sks = c;
    }

    // Mengembalikan nilai idMatkul
    public String getidMatkul() {
        return idMatkul;
    }

    // Mengembalikan nilai nama
    public String getnama() {
        return nama;
    }

    // Mengembalikan nilai sks
    public int getsks() {
        return sks;
    }

    // Mengeset nilai idMatkul dengan a
    public void setidMatkul(String a) {
        idMatkul = a;
    }

    // Mengeset nilai nama dengan b
    public void setnama(String b) {
        nama = b;
    }

    // Mengeset nilai sks dengan c
    public void setsks(int c) {
        sks = c;
    }

    // Menampilkan data mata kuliah
    public void printMatKul() {
        System.out.println("Kode id unik matkul: " + idMatkul + " - " + "Nama Mata Kuliah: " + nama + " - " + "Total SKS Mata Kuliah: " + sks);
    }
}
