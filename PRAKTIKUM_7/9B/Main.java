/* Nama File : Main.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

public class Main {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kucing");
        Anabul anjing = new Anjing("Anjing");
        Anabul burung = new Burung("Burung");

        kucing.gerak();
        kucing.bersuara();

        anjing.gerak();
        anjing.bersuara();

        burung.gerak();
        burung.bersuara();
    }
}
