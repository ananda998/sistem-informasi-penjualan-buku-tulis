/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bukutulis;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author master
 */
public class ModelPenjualan {
    private double subTotal=0;
    private double ppn=0;
    private double total=0;
    private DefaultTableModel tabel = new DefaultTableModel();
    
    public ModelPenjualan(){
        getTabel().addColumn("Buku");
        getTabel().addColumn("J. Lembar");
        getTabel().addColumn("Harga Satuan");
        getTabel().addColumn("J. Beli");
        getTabel().addColumn("Jumlah");
    }

    public double countSubtotal(){
        subTotal=0;
        for (int i=0;i<tabel.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(tabel.getValueAt(i, 4).toString());
        }
        return subTotal;
    }
    /**
     * @return the subTotal
     */
    public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
}
