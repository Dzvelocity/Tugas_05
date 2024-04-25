package tiketpensi;

//Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    protected static final double POTONGAN_PRESALE = 0.2; // 20% potongan untuk presale
    protected int jumlah;

    public Tiket(int jumlah) {
        this.jumlah = jumlah;
    }

    // Metode abstrak untuk menghitung harga tiket
    public abstract double hitungHarga(boolean presale);

    // Getter untuk jumlah tiket
    public int getJumlah() {
        return jumlah;
    }
}