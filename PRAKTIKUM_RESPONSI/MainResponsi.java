/* Nama File : MainResponsi.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Maret 2025
 */

package RESPONSI_MARET;

public class MainResponsi {
    public static void main(String[] args) {

        // Civitas Akademik

        // Fakultas        
        Fakultas fsm = new Fakultas("Fakultas Sains dan Matematika", 6500000, 7000000);
        fsm.printInfo();
        Fakultas fk = new Fakultas("Fakultas Kedokteran", 9000000, 8500000);
        fk.printInfo();

        // Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Cikal Wahyuning Bachtiar", "cikal@undip.id", "24060123140175", 4, fsm);
        Mahasiswa mhs2 = new Mahasiswa("Anura Putri Ayu", "anura@undip.id", "26020124130077", 2, fk);

        // Dosen
        Dosen dosen1 = new Dosen("Drs. Eko", "eko@undip.lecture.id", "20987", 9, fsm);
        Dosen dosen2 = new Dosen("Prof. Nurhayati", "nurhayati@undip.lecture.id", "10976", 10, fk);

        // Tendik
        Tendik tendik1 = new Tendik("Siti", "siti@example.com", "54321", 5);

        // Menampilkan Informasi
        System.out.println();
        System.out.println("Data Mahasiswa Universitas: ");
        System.out.println();
        System.out.println("===== Mahasiswa 1 =====");
        mhs1.printInfo();
        System.out.println();
        System.out.println("===== Mahasiswa 2 =====");
        mhs2.printInfo();
        System.out.println();
        System.out.println("Data Dosen Universitas: ");
        System.out.println();
        System.out.println("===== Dosen 1 =====");
        dosen1.printInfo();
        System.out.println();
        System.out.println("===== Dosen 2 =====");
        dosen2.printInfo();
        System.out.println();
        System.out.println("Data Tendik Universitas: ");
        System.out.println();
        tendik1.printInfo();

        System.out.println();
        System.out.println("Total Data Civitas Akademik Universitas: ");
        System.out.println("Total Mahasiswa: " + Mahasiswa.getHitung());
        System.out.println("Total Dosen: " + Dosen.getHitung());
        System.out.println("Total Tendik: " + Tendik.getHitung());
    }
}
