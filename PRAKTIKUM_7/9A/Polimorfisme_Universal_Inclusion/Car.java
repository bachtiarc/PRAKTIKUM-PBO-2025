/* Nama File : Car.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

public class Car extends Vehicle {
    @Override
    void calRent(int distance, float price) {
        float fare = distance * price;
        fare = fare - 100.00f; 
        System.out.println("Harga sewa mobil = " + fare);
    }
}
