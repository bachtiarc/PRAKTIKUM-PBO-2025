/* Nama File : MPerson.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

public class MPerson {
    public static void main(String[] args) {
        Person p;
        p = new Student("Sally");
        p.status(1);
    }
}


// OUTPUT

// (base) cikalbachtiar@Cikals-MacBook-Pro praktikum_d % javac *.java
// (base) cikalbachtiar@Cikals-MacBook-Pro praktikum_d % java MPerson
// Now online : Sally
// (base) cikalbachtiar@Cikals-MacBook-Pro praktikum_d % 


// hasil output Now online : Sally didapatkan karena:

// pada saat p.status(1) dipanggil, status adalah method dari class Person.
// di dalam method status, dipanggil this.isAsleep(hr).
// karena this mengacu ke objek aktual (new Student("Sally")), 
// maka yang dipanggil adalah method isAsleep milik Student, bukan Person.
// pada class Student, isAsleep(1) mengembalikan false karena 1 tidak dalam range tidur 2 < hr && 8 > hr.
// karena isAsleep(1) menghasilkan false, maka program masuk ke else dan mencetak outputnya

// Kesimpulannya:
// this dalam method status diputuskan saat runtime (bukan compile time), 
// karena Java menerapkan mekanisme dynamic dispatch saat method override.