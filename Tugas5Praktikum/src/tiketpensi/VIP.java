package tiketpensi;

//Kelas turunan untuk tiket VIP
class VIP extends Tiket {
    private static final double HARGA_REGULER = 150.0;

    public VIP(int jumlah) {
        super(jumlah);
    }

    @Override
    public double hitungHarga(boolean presale) {
        if (presale) {
            // Presale hanya berlaku untuk tiket VIP
            return (HARGA_REGULER * (1 - POTONGAN_PRESALE)) * jumlah;
        } else {
            return HARGA_REGULER * jumlah;
        }
    }

    @Override
    public String toString() {
        return "VIP";
    }
}