/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal_A_B;

/**
 *
 * @author cikalbachtiar
 */
/* Nama File : ContohMetodeGenerik.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 29 April 2025
 */

public class ContohMetodeGenerik {

    // Generic method to simulate the behavior of pets
    public static <T extends Anabul> void simulasikanPerilaku(Datum<T> datum) {
        T anabul = datum.getIsi();
        anabul.gerak();
        anabul.bersuara();
    }

    public static void main(String[] args) {
        // Creating instances of Datum for each pet type
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Kucing"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Anjing"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Burung"));

        // Simulating behaviors using the generic method
        simulasikanPerilaku(datumKucing);
        simulasikanPerilaku(datumAnjing);
        simulasikanPerilaku(datumBurung);
    }
}
