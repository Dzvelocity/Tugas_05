package tiketpensi;

import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di program pemesanan tiket!");
        System.out.print("Masukkan nama pembeli: ");
        String nama = scanner.nextLine();

        System.out.println("\nPilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        int tahapPembelian = scanner.nextInt();
        scanner.nextLine();

        String tahap;
        if (tahapPembelian == 1) {
            tahap = "Presale";
        } else if (tahapPembelian == 2) {
            tahap = "Reguler";
        } else {
            System.out.println("Input tidak valid!");
            return;
        }

        System.out.println("\nPilih jenis tiket:");
        if (tahapPembelian == 1) {
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
        } else if (tahapPembelian == 2) {
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
        }
        int jenisTiket = scanner.nextInt();
        scanner.nextLine(); 

        String jenis;
        switch (jenisTiket) {
            case 1:
                jenis = (tahapPembelian == 1) ? "VIP" : "Festival";
                break;
            case 2:
                jenis = (tahapPembelian == 1) ? "VVIP" : "VIP";
                break;
            case 3:
                jenis = "VVIP";
                break;
            default:
                System.out.println("Input tidak valid!");
                return;
        }

        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = scanner.nextInt();

        Pemesanan pesanan = new Pemesanan(nama, tahap, jenis, jumlah);
        pesanan.cetakNota();
    }
}