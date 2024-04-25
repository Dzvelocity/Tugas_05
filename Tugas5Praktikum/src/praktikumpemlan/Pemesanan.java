package praktikumpemlan;

//Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private String jenis;
    private int jumlah;
    private double harga;

    public Pemesanan(String nama, String tahap, String jenis, int jumlah, double harga) {
        this.nama = nama;
        this.tahap = tahap;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void cetakNota() {
        double totalHarga = jumlah * harga;
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + jenis);
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}