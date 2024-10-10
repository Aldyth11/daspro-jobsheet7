import java.util.Scanner;

public class Tugas1Jobsheet7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga = 50000, jmlTiket, tiketTerjual = 0;
        double diskon = 0, sblmDiskon, stlhDiskon, totalHarga, totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();
            if (jmlTiket == 0) {
                System.out.println("Transaksi berhenti");
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, Harap masukkan ulang.");
                continue;
            }
            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.1;
            }

            sblmDiskon = (jmlTiket * harga);
            stlhDiskon = sblmDiskon * diskon;
            totalHarga = sblmDiskon - stlhDiskon;
            totalPembayaran += totalHarga;
            tiketTerjual += jmlTiket;

            System.out.println("Tiket terjual: " + tiketTerjual);
            System.out.println("Total pembayaran: " + totalPembayaran);

        }
    }
}