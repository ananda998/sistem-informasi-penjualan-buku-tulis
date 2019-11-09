/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutulis;

/**
 *
 * @author user
 */
public class ModelBarang {
    private String namaBarang;
    private String lembar;
    private double harga;

    public ModelBarang(String namaBarang, String lembar, double harga) {
        this.namaBarang = namaBarang;
        this.lembar = lembar;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return this.namaBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the satuan
     */
    
    public String getLembar() {
        return lembar;
    }

    /**
     * @param satuan the satuan to set
     */
    public void setLembar(String lembar) {
        this.lembar = lembar;
    }

    /**
     * @return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
}
