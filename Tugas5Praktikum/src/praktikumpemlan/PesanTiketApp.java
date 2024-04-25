package praktikumpemlan;

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
        double potongan = 0.0;
        if (tahapPembelian == 1) {
            tahap = "Presale";
            potongan = 0.2; // potongan 20% untuk presale
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
        double harga;
        switch (jenisTiket) {
            case 1:
                jenis = (tahapPembelian == 1) ? "VIP" : "Festival";
                harga = (tahapPembelian == 1) ? 150.0 * (1 - potongan) : 100.0;
                break;
            case 2:
                jenis = (tahapPembelian == 1) ? "VVIP" : "VIP";
                harga = (tahapPembelian == 1) ? 200.0 * (1 - potongan) : 150.0;
                break;
            case 3:
                jenis = "VVIP";
                harga = (tahapPembelian == 1) ? 200.0 * (1 - potongan) : 200.0;
                break;
            default:
                System.out.println("Input tidak valid!");
                return;
        }

        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: ");
        int jumlah = scanner.nextInt();

        Pemesanan pesanan = new Pemesanan(nama, tahap, jenis, jumlah, harga);
        pesanan.cetakNota();
    }
}