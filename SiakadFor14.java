import java.util.Scanner;

public class SiakadFor14 {
    public static void main(String[] args) {
        Scanner input14 = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;
        int mhsLulus = 0, mhsTdklulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input14.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            } else if (nilai >= 60) {
                mhsLulus++;
            } else 
                mhsTdklulus++;
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + mhsLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + mhsTdklulus);
    }

}