/* Nama File : Mahasiswa.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 25 Maret 2025
 */

package RESPONSI_MARET;

public class Mahasiswa extends civitasAkademika {

    // Atribut
    private static int hitung = 0;
    private String NIM;
    private int semester;
    private Fakultas fakultas;

    // Method
    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        hitung++;
    }

    public static int getHitung() { 
        return hitung; 
    }

    public String getNIM() { 
        return NIM; 
    }

    public void setNIM(String NIM) { 
        this.NIM = NIM; 
    }

    public int getSemester() { 
        return semester; 
    }

    public void setSemester(int semester) { 
        this.semester = semester; 
    }

    public Fakultas getFakultas() { 
        return fakultas; 
    }
    
    public void setFakultas(Fakultas fakultas) { 
        this.fakultas = fakultas; 
    }
    
    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }
    
    // Menampilkan Informasi
    public void printInfo() {
        super.printInfo();
        System.out.println("NIM: " + NIM);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: " + hitungUKT());
    }
}
