package tiketpensi;

//Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    private static final double HARGA_REGULER = 200.0;

    public VVIP(int jumlah) {
        super(jumlah);
    }

    @Override
    public double hitungHarga(boolean presale) {
        if (presale) {
            // Presale hanya berlaku untuk tiket VVIP
            return (HARGA_REGULER * (1 - POTONGAN_PRESALE)) * jumlah;
        } else {
            return HARGA_REGULER * jumlah;
        }
    }

    @Override
    public String toString() {
        return "VVIP";
    }
}
