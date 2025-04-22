/* Nama File : TestPolimorfisme.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

import java.util.ArrayList;
public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<Pegawai>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}


// JAWABAN SOAL 

// NOMOR 2
// Polimorfisme memungkinkan kita untuk menggunakan objek dari kelas turunan (Manager, Programmer) 
// dengan cara yang sama menggunakan referensi kelas induk (Pegawai). Hal ini memberikan beberapa manfaat:

// Kode lebih bersih dan efisien: Polimorfisme memungkinkan kita menulis kode yang lebih sederhana tanpa menduplikasi logika.
// Fleksibilitas dalam pengembangan kode untuk kedepannya: Dengan polimorfisme, menambah jenis pegawai baru seperti 
// Intern cukup dengan membuat kelas turunan tanpa mengubah kode yang ada.
// Pemeliharaan lebih mudah: Perubahan pada kelas induk atau metode umum hanya perlu dilakukan di satu tempat, 
// mengurangi risiko kesalahan.

// NOMOR 3
// Jika tidak menggunakan polimorfisme, kita harus menangani setiap jenis pegawai secara terpisah, yang dapat menyebabkan:

// Duplikasi kode: Setiap tipe pegawai membutuhkan metode tampilData() yang berbeda, 
// yang mengarah pada kode yang lebih panjang dan tidak efisien.
// Kesulitan menambah pegawai baru: Menambah tipe pegawai baru (misalnya Intern) 
// memerlukan perubahan pada banyak bagian kode.
// Pengelolaan objek lebih rumit: Tanpa polimorfisme, kita tidak bisa menggunakan koleksi objek Pegawai yang berisi berbagai tipe pegawai, 
// yang membuat kode menjadi lebih sulit untuk dikelola.