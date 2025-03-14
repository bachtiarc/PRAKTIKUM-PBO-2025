/* Nama File : Dosen.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Jumat, 14 Februari 2025
 */

 package latihan_inheritance;

 import java.time.LocalDate;
 
 public class Dosen extends Pegawai {
     private String fakultas;
 
     public Dosen(String NIP, String Nama, LocalDate TTL, LocalDate TMT, double Gaji, String fakultas) {
         super(NIP, Nama, TTL, TMT, Gaji);
         this.fakultas = fakultas;
     }
 
     public String getFakultas() {
         return fakultas;
     }
 
     public void setFakultas(String fakultas) {
         this.fakultas = fakultas;
     }
 
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("Fakultas : " + fakultas);
     }
 }