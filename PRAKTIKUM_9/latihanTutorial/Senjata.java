/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihantutorial;

/**
 *
 * @author cikalbachtiar
 */
/* Nama File : Senjata.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 29 April 2025
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }

    private String getBunyi() {
        return bunyi;
    }

    private void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    private boolean isMenusuk() {
        return menusuk;
    }

    private void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " ");
        }
        System.out.println();
    }

    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

    public String menusuk() {
        if (isMenusuk()) {
            return "Jleb! ";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
}
