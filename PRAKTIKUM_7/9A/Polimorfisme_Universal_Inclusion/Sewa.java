/* Nama File : Sewa.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

public class Sewa {
    public static void hitungSewa(Vehicle v, int distance, float price) {
        v.calRent(distance, price); 
    }

    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle(); 
        Vehicle mobil = new Car();        
        Vehicle bis = new Bus();

        hitungSewa(kendaraan, 50, 1000);  
        hitungSewa(mobil, 50, 1000);     
        hitungSewa(bis, 50, 1000);
    }
}

// Penggunaan polimorfisme (inclusion) memberikan keuntungan karena memungkinkan kita membuat satu method seperti hitungSewa(Vehicle v) yang dapat digunakan oleh semua jenis kendaraan 
// tanpa perlu membuat method berbeda untuk tiap tipe. Ini membuat kode lebih fleksibel, efisien, dan mudah dikembangkan. 
// Jika ingin menambah tipe kendaraan baru, kita cukup buat subclass tanpa harus mengubah kode yang sudah ada.