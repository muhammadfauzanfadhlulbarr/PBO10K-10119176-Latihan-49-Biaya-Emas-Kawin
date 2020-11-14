/**
 * Latihan49
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Biaya Emas Kawin
 */
public class PBO10k10119176Latihan49 {
    public static void main(String[] args) {
        EmasKawin masKawin = new EmasKawin();

        masKawin.setEMAS(15.7f);
        masKawin.setHarga(570000.0f);

        float EMAS = masKawin.getEMAS();
        float Harga = masKawin.getHarga();

        masKawin.TotalBayar(EMAS, Harga);
    }
}
