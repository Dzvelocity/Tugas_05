package praktikumpemlan;

//Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    private static final double HARGA_REGULER = 100.0;

    public Festival(int jumlah) {
        super(jumlah);
    }

    @Override
    public double hitungHarga(boolean presale) {
        if (presale) {
            // Tidak ada presale untuk tiket festival
            return HARGA_REGULER * jumlah;
        } else {
            return HARGA_REGULER * jumlah;
        }
    }

    @Override
    public String toString() {
        return "Festival";
    }
}
