package tiketpensi;

//Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private String jenis;
    private int jumlah;

    public Pemesanan(String nama, String tahap, String jenis, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        double harga;
        if (tahap.equals("Presale")) {
            if (jenis.equals("VIP")) {
                harga = 150.0 * (1 - 0.2); // potongan 20% untuk presale VIP
            } else if (jenis.equals("VVIP")) {
                harga = 200.0 * (1 - 0.2); // potongan 20% untuk presale VVIP
            } else {
                harga = 100.0; // Harga normal untuk tiket Festival pada presale
            }
        } else {
            if (jenis.equals("VIP")) {
                harga = 150.0; // Harga normal untuk tiket VIP pada reguler
            } else if (jenis.equals("VVIP")) {
                harga = 200.0; // Harga normal untuk tiket VVIP pada reguler
            } else {
                harga = 100.0; // Harga normal untuk tiket Festival pada reguler
            }
        }

        double totalHarga = jumlah * harga;
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + jenis);
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}