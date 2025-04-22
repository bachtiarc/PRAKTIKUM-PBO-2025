/* Nama File : Programmer.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

public class Programmer extends Pegawai {
    double bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
