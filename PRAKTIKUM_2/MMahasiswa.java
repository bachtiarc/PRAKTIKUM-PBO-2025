/* Nama File : MMhasiswa.java
 * Deskripsi : Program utama untuk menguji kelas Mahasiswa
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 28 Februari 2025
 */

public class MMahasiswa {

public static void main(String[] args) {

    // Data Dosen
    Dosen dosen1 = new Dosen("202502", "Dr. Pujianto", "Informatika");
    Dosen dosen2 = new Dosen("212500", "Susi Anaya, M.Kom.", "Teknik Komputer");
    Dosen dosen3 = new Dosen("204520", "Ahmad Basri, M.Kom.", "Sistem Informasi");
    Dosen dosen4 = new Dosen("202503", "Dr. Dharmawan", "Informatika");

    // Data Mata Kuliah
    MataKuliah matkul1 = new MataKuliah("PL206", "Sistem Cerdas", 3);
    MataKuliah matkul2 = new MataKuliah("YL606", "Pemrograman Berbasis Objek", 3);
    MataKuliah matkul3 = new MataKuliah("DY216", "Manajemen Basis Data", 3);
    MataKuliah matkul4 = new MataKuliah("P3F06", "Basis Data", 4);

    // Data Kendaraan
    Kendaraan kendaraan1 = new Kendaraan("H 2546 OT", "Motor");
    Kendaraan kendaraan2 = new Kendaraan("H 3444 HY", "Mobil");
    Kendaraan kendaraan3 = new Kendaraan("H 5002 KL", "Motor");
    Kendaraan kendaraan4 = new Kendaraan("H 2521 YJ", "Mobil");

    // Data Mahasiswa
    Mahasiswa mhs1 = new Mahasiswa("24060123130100", "Putri", "Informatika");
    Mahasiswa mhs2 = new Mahasiswa("24050123120009", "Amanda", "Teknik Komputer");
    Mahasiswa mhs3 = new Mahasiswa("24030123130067", "Dafa", "Sistem Informasi");
    Mahasiswa mhs4 = new Mahasiswa("24060123140190", "Nela", "Informatika");

    // Set Mahasiswa 1
    mhs1.setDosenWali(dosen1);
    mhs1.setKendaraan(kendaraan1);
    mhs1.addMatKul(matkul1);
    System.out.println("Detail Data Mahasiswa 1");
    mhs1.printDetailMhs();
    mhs1.printIdentitaslMhs();

    // Set Mahasiswa 2
    System.out.println();
    mhs2.setDosenWali(dosen2);
    mhs2.setKendaraan(kendaraan2);
    mhs2.addMatKul(matkul2);
    System.out.println("Detail Data Mahasiswa 2");
    mhs2.printDetailMhs();
    mhs2.printIdentitaslMhs();

    // Set Mahasiswa 3
    System.out.println();
    mhs3.setDosenWali(dosen3);
    mhs3.setKendaraan(kendaraan3);
    mhs3.addMatKul(matkul3);
    System.out.println("Detail Data Mahasiswa 3");
    mhs3.printDetailMhs();
    mhs3.printIdentitaslMhs();

    // Set Mahasiswa 4
    System.out.println();
    mhs4.setDosenWali(dosen4);
    mhs4.setKendaraan(kendaraan4);
    mhs4.addMatKul(matkul4);
    System.out.println("Detail Data Mahasiswa 4");
    mhs4.printDetailMhs();
    mhs4.printIdentitaslMhs();
}
}
