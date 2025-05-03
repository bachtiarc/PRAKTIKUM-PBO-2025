/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author cikalbachtiar
 */
/* Nama File : KontrolSenjata.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 29 April 2025
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        int peluruBaru = senjata.getPeluru() + jumlah;
        senjata.setPeluru(peluruBaru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb!";
        } else {
            return "Senjata tidak memiliki bayonet";
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}