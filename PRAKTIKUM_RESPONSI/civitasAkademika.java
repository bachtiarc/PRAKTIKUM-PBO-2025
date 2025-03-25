/* Nama File : civitasAkademika.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Maret 2025
 */

package RESPONSI_MARET;

public class civitasAkademika {

    // Atribut
    protected String nama;
    protected String email;

    // Method
    public civitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getEmail() { 
        return email; 
    }

    public void setEmail(String email) { 
        this.email = email; 
    }

    // Menampilkan Informasi
    public void printInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}
