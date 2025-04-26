/* Nama File : Bus.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

public class Bus extends Vehicle {
    @Override
    void calRent(int distance, float price) {
        float fare = distance * price;
        // No discount, just print the fare
        System.out.println("Harga sewa bus = " + fare);
    }
}