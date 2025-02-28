/* Nama File : Garis.java
 * Deskripsi : berisi atribut dan method dalam class Garis
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 21 Februari 2025
 */

public class Garis {
    
    /*********** ATRIBUT **********/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*********** METHOD **********/

    // Konstruktor dengan parameter untuk dua titik awal & akhir
    public Garis(double x1, double x2, double y1, double y2) {
        this.titikAwal = new Titik (x1, y1);
        this.titikAkhir = new Titik (x2, y2);
        counterGaris++;
    }

    // Konstruktor untuk Titik dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis() {
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    /*********** GETTER & SETTER **********/

    // Mengembalikan jumlah garis yang telah dibuat
    public static int getCountG() {
        return counterGaris;
    }
    
    public void printCountG() {
        System.out.println("Jumlah Garis: " + counterGaris);
    }

    // Mengembalikan titik awal garis
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan titik akhir garis
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengeset titik awal garis
    public void setTitikAwal (Titik tAwal) {
        titikAwal = tAwal;
    }

    // Mengeset titik akhir garis
    public void setTitikAKhir (Titik tAkhir) {
        titikAkhir = tAkhir;
    }

    // Menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Garis(Titik Awal: (" + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + "), Titik Akhir: (" + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat() + "))");
    }
    
    // Mengembalikan panjang garis menggunakan rumus jarak dua titik
    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Mengembalikan gradien garis (m) dengan rumus m = (y2 - y1) / (x2 - x1)
    public double getGradien() {
        double Y = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        double X = titikAkhir.getAbsis() - titikAwal.getAbsis();
        return Y / X;
    }

    // Mengembalikan titik tengah garis menggunakan rumus (x1+x2)/2, (y1+y2)
    public Titik getTitikTengah() {
        return new Titik((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2 , (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
    }

    // Mengecek apakah dua garis sejajar (memiliki gradien yang sama)
    public boolean isSejajar(Garis G) {
        if (this.getGradien() == G.getGradien()) {
            return true;
        } else {
            return false;
        }
    }

    // Mengecek apakah dua garis tegak lurus 
    public boolean isTegakLurus(Garis G) {
        if (this.getGradien() * G.getGradien() == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Mengembalikan persamaan garis dalam bentuk y = mx + c
    public String getPersGaris() {
        if (titikAkhir.getAbsis() == titikAwal.getAbsis()) {
            return "x = " + titikAwal.getAbsis();  
        }     
        double m = getGradien();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());       
        return "y = " + m + "x + " + c;
    }    
}
