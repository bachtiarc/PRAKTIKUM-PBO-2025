/* Nama File : Dosen.java
 * Deskripsi : berisi atribut dan method dalam class Dosen
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Februari 2025
 */

public class Dosen {

    /*********** ATRIBUT **********/
    private String NIP;
    private String nama;
    private String prodi;

    /*********** METHOD **********/

    // Konstruktor tanpa parameter
    public Dosen() {
        NIP = " ";
        nama = " ";
        prodi = " ";
    }

    // Konstruktor dengan parameter
    public Dosen(String a, String b, String c) {
        this.NIP = a;
        this.nama = b;
        this.prodi = c;
    }

    // Mengembalikan nilai NIP
    public String getNIP() {
        return NIP;
    }

    // Mengembalikan nilai nama
    public String getnama() {
        return nama;
    }

    // Mengembalikan nilai prodi
    public String getprodi() {
        return prodi;
    }

    // Mengeset nilai NIP dengan a
    public void setNIP(String a) {
        NIP = a;
    }

    // Mengeset nama dengan b
    public void setnama(String b) {
        nama = b;
    }

    // Mengeset prodi dengan c
    public void setprodi(String c) {
        nama = c;
    }

    // Menampilkan data Dosen
    public void printDosen() {
        System.out.println("NIP Dosen: " + NIP + " - " + "Nama Dosen: " + nama + " - " + "Program Studi Dosen: " + prodi);
    }
}
