/* Nama File : Mahasiswa.java
 * Deskripsi : berisi atribut dan method dalam class Mahasiswa
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    
    /*********** ATRIBUT **********/
    private String NIM;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*********** METHOD **********/

    // Konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>(); 
    }

    
    public void addMatkul (MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    public void printIdentitaslMhs() {
        System.out.println("Nim: " +NIM);
        System.out.println("Nama: " +nama);
        System.out.println("Prodi: " +prodi);
        int i;
        for (i = 0; i <listMatkul.size(); i++) {
            System.out.println(listMatkul.get(i).getnama());
        }
    }

    
    public Mahasiswa(String nim, String nama, String prodi) {
        this.NIM = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(); 
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void addMatKul(MataKuliah matkul) {
        if (listMatkul.size() < 50) {
            listMatkul.add(matkul); 
        } else {
            System.out.println("Maksimal 50 mata kuliah!");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getsks();
        }
        return totalSKS;
    }

    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    public void printMhs() {
        System.out.println("Mahasiswa: " + NIM + " - " + nama + " (" + prodi + ")");
    }

    public void printDetailMhs() {
        printMhs();
        System.out.println("Jumlah Mata Kuliah: " + getJumlahMatKul());
        System.out.println("Total SKS: " + getJumlahSKS());
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah matkul : listMatkul) {
            matkul.printMatKul();
        }
        if (dosenWali != null) {
            dosenWali.printDosen();
        }
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }
        System.out.println("------------------------------------------------");
    }
}