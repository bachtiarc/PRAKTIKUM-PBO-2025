/* Nama File : Student.java
 * Pembuat : Cikal Wahyuning Bachtiar / 24060123140175
 * Tanggal : Selasa, 22 April 2025
 */

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) { //override
        return 2 < hr && 8 > hr;
    }
}
