/* Nama File : MGaris.java
 * Deskripsi : Program utama untuk menguji kelas Garis
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 21 Februari 2025
 */

public class MGaris {
    
    public static void main(String[] args) {

        Garis G1 = new Garis(); 
        Garis G2 = new Garis(3, 2, 1, 6); 
        Garis G3 = new Garis(2, 0, 0, 4);

        // Garis G1
        System.out.println("-------- Garis G1 --------");
        G1.printGaris();
        System.out.println("Panjang dari Garis G1 adalah: " + G1.getPanjang());
        System.out.println("Gradien dari Garis G1 adalah: " + G1.getGradien());
        Titik tengah = G1.getTitikTengah();
        System.out.println("Nilai Titik Tengah dari G1 adalah: (" + tengah.getAbsis() + ", " + tengah.getOrdinat() + ")");
        System.out.println("Persamaan Garis dari G1: " + G1.getPersGaris());


        // Garis G2
        System.out.println();
        System.out.println("-------- Garis G2 --------");
        G2.printGaris();
        System.out.println("Panjang dari Garis G2 adalah: " + G2.getPanjang());
        System.out.println("Gradien dari Garis G2 adalah: " + G2.getGradien());
        Titik tengah2 = G2.getTitikTengah();
        System.out.println("Nilai Titik Tengah dari G2 adalah: (" + tengah2.getAbsis() + ", " + tengah2.getOrdinat() + ")");
        System.out.println("Persamaan Garis dari G2: " + G2.getPersGaris());

        
        // Garis G3
        System.out.println();
        System.out.println("-------- Garis G3 --------");
        G3.printGaris();
        System.out.println("Panjang dari Garis G3 adalah: " + G3.getPanjang());
        System.out.println("Gradien dari Garis G3 adalah: " + G3.getGradien());
        Titik tengah3 = G3.getTitikTengah();
        System.out.println("Nilai Titik Tengah dari G3 adalah: (" + tengah3.getAbsis() + ", " + tengah3.getOrdinat() + ")");
        System.out.println("Persamaan Garis dari G3: " + G3.getPersGaris());


        // Menghitung jumlah garis yang ada
        System.out.println();
        System.out.println("Jumlah Obejk Garis: " + Garis.getCountG());

        // Mengecek apakah garis sejajar atau tegak lurus
        System.out.println();
        System.out.println("Garis 1 dan Garis 2 sejajar? " + G1.isSejajar(G2));
        System.out.println("Garis 2 dan Garis 3 tegak lurus? " + G2.isTegakLurus(G3));
    }
}