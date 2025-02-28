/* Nama File : MTitik.java
 * Deskripsi : Program utama untuk menguji kelas Titik
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 18 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        System.out.println("Koordinat Titik T1: ");
        T1.setAbsis(3); // Mengubah nilai absis T1 menjadi 3
        T1.setOrdinat(4); // Mengubah nilai ordinat T1 menjadi 4
        T1.printTitik(); // Menampilkan output Titik T1
        System.out.println("Output Titik T1 setelah pergeseran dengan x dan y: ");
        T1.geser(3, 4); // Geser titik sejauh x = 3 dan y = 4
        T1.printTitik(); // Menampilkan output Titik T1 yang telah digeser

        System.out.println("Koordinat Titik T2: ");
        Titik T2 = T1; // Permisalan T2 = T1
        T2.printTitik();
        System.out.println("Set Koordinat Titik T2 dengan absis dan ordinat baru: ");
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        System.out.println("Koordinat Titik T3: ");
        Titik T3 = new Titik(); // Membuat objek Titik T3 (0,0)
        T3.printTitik();

        System.out.println("Koordinat Titik T4: "); // Membuat obejk Titik T4 (3,5)
        Titik T4 = new Titik(3,5);
        T4.printTitik();
        
        // Menghitung jumlah titik yang ada
        System.out.println();
        System.out.println("Jumlah Objek Titik = " + Titik.getCount());
        System.out.println("Jumlah Objek Titik = " + T4.getCount());

        // Mencari lokasi Titik dalam Kuadran
        System.out.println("Titik T1 berada di Kuadran: " + T1.getKuadran());
        System.out.println("Titik T3 berada di Kuadran: " + T3.getKuadran());
        System.out.println("Titik T4 berada di Kuadran: " + T4.getKuadran());
        System.out.println();
        
        System.out.println("Jarak Titik T1 ke Pusat = " + T1.getJarakPusat()); // Mneghitung jarak Titik T1 ke pusat (0,0)
        System.out.println("Jarak antara Titik T1 dan Titik T2 adalah = " + T2.getJarak(T4)); // Menghitung jarak Titik T2 ke Titik T4
        System.out.println();

        // Mencari Refleksi dari Titik

        // Contoh Titik T2
        System.out.println("Hasil Refleksi Titik T2 dengan sumbu X dan Y: ");
        T2.refleksiX();
        T2.printTitik();
        T2.refleksiY();
        T2.printTitik();
        
        // Contoh Titik T4
        System.out.println();
        System.out.print("Hasil Refleksi X Titik T4 = "); // Get Refelksi X
        T4.getRefleksiX().printTitik();
        System.out.print("Hasil Refleksi Y Titik T4 = "); // Get Refleksi Y
        T4.getRefleksiY().printTitik();

    }
    
}
