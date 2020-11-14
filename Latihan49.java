/**
 * Latihan49
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Biaya Emas Kawin
 */

class EmasKawin{
    private float EMAS;
    private float Harga;

    /**
     * @return float return the EMAS
     */
    public float getEMAS() {
        return EMAS;
    }

    /**
     * @param EMAS the EMAS to set
     */
    public void setEMAS(float EMAS) {
        this.EMAS = EMAS;
    }

    /**
     * @return float return the Harga
     */
    public float getHarga() {
        return Harga;
    }

    /**
     * @param Harga the Harga to set
     */
    public void setHarga(float Harga) {
        this.Harga = Harga;
    }

    public void TotalBayar(float EMAS, float Harga) {
        System.out.println("======= Biaya Mas Kawin =======");
        System.out.println("Emas = " + EMAS + " Gram");
        System.out.println("Harga 1 Gram Emas = Rp." + Harga);
        float TotalBayar = EMAS * Harga;
        System.out.println("Harga total Emas " + EMAS + " Gram = Rp." + TotalBayar);
        
    }

}
