/* Nama File : Main.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 14 Februari 2025
 */

package latihan_inheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Format tanggal
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Membuat objek Pegawai
        Pegawai pegawai1 = new Pegawai("123456789", "Budi Hermanto", LocalDate.parse("1980-05-15", formatter), LocalDate.parse("2005-07-01", formatter), 5000000);

        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("987654321", "Lully Amalia", LocalDate.parse("1985-08-20", formatter), LocalDate.parse("2000-09-15", formatter), 7000000, "Fakultas Ekonomika & Bisnis");

        // Membuat objek DosenTetap
        DosenTetap dosenTetap1 = new DosenTetap("567890123", "1234567890", "Ahmad Roman", LocalDate.parse("1970-03-25", formatter), LocalDate.parse("1995-06-10", formatter), 9000000, "Fakultas Sains & Matematika");

        // Membuat objek Dosen Tamu
        DosenTamu dosenTamu1 = new DosenTamu("678901234", "2345678901", "Rina Kartika", LocalDate.parse("1985-11-10", formatter), LocalDate.parse("2015-02-20", formatter), 7500000, "Fakultas Ekonomi", LocalDate.parse("2025-12-31", formatter));

        // Membuat objek Tendik
        Tendik tendik1 = new Tendik("567890123", "Darman Hastanto", LocalDate.parse("1978-05-15", formatter), LocalDate.parse("2000-08-10", formatter), 5000000, "Sumber Daya");

        // Menampilkan informasi Pegawai
        System.out.println("=== Data Pegawai ===");
        pegawai1.printInfo();
        System.out.println();

        // Menampilkan informasi Dosen
        System.out.println("=== Data Dosen ===");
        dosen1.printInfo();
        System.out.println();

        // Menampilkan informasi Dosen Tetap
        System.out.println("=== Data Dosen Tetap ===");
        dosenTetap1.printInfo();

        
        // Menampilkan informasi Dosen Tamu
        System.out.println("=== Data Dosen Tamu ===");
        dosenTamu1.printInfo();
        System.out.println();

        // Menampilkan informasi Tendik
        System.out.println("=== Data Tenaga Kependidikan (Tendik) ===");
        tendik1.printInfo();
    }
}
