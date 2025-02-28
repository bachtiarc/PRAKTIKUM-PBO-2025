/* Nama File : Titik.java
 * Deskripsi : berisi atribut dan method dalam class Titik
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 18 Februari 2025
 */


public class Titik {

    /*********** ATRIBUT **********/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*********** METHOD **********/

    // Konstruktor untuk membuat titik (x,y)
    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Mengembalikan nilai counter titik
    public static int getCount() {
        return counterTitik;
    }

    public void printCount() {
        System.out.println("Jumlah Titik: " + counterTitik);
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset nilai absis dengan nilai x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset nilai ordinat dengan nilai y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik sejauh x dan y
    public void geser (double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat Titik
    public void printTitik() {
        System.out.println("Titik("+ absis + "," + ordinat + ")");
    }

    // Mengembalikan kuadran tempat titik berada dalam sistem koordinat Kartesius.
    // Kuadran ditentukan sebagai berikut:
    // 1: x > 0, y > 0
    // 2: x < 0, y > 0
    // 3: x < 0, y < 0
    // 4: x > 0, y < 0
    // Jika titik berada di sumbu atau pusat, mengembalikan 0.
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // Menghitung jarak titik dari titik pusat (0,0) 
    public double getJarakPusat() {
        return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    // Menghitung jarak antara titik ini dengan titik lain T 
    public double getJarak(Titik T) {
        return Math.sqrt(Math.pow(T.getAbsis() - this.absis, 2) + Math.pow(T.getOrdinat() - this.ordinat, 2));
    }

    // Melakukan refleksi titik terhadap sumbu X
    public void refleksiX() {
		ordinat = (getOrdinat()*-1) ;
	}

    // Melakukan refleksi titik terhadap sumbu Y
	public void refleksiY() {
		absis = (getAbsis()*-1);
	}
    
    // Mengembalikan objek Titik baru yang merupakan hasil refleksi terhadap sumbu X
    public Titik getRefleksiX() {
		return new Titik(absis, ordinat * -1) ;
	}

    // Mengembalikan objek Titik baru yang merupakan hasil refleksi terhadap sumbu Y
    public Titik getRefleksiY() {
		return new Titik(absis * -1, ordinat) ;
	}
}
