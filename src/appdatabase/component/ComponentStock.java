/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.component;

import appdatabase.entity.Product;
import appdatabase.entity.Shop;
import appdatabase.entity.Stock;
import appdatabase.listentities.ListProducts;
import appdatabase.listentities.ListShops;
import appdatabase.listentities.ListStocks;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Manuel
 */
public class ComponentStock extends javax.swing.JPanel {
    
    private ArrayList<Shop> listShops;
    private ArrayList<Product> listProducts;
    private ArrayList<Stock> listStock;
    private Stock stock;
    private Shop shop;
    private Product product;

    /**
     * Creates new form ComponentStock
     */
    public ComponentStock() {
        initComponents();
    }
    public ComponentStock(ListStocks listStock,ListShops listShops,ListProducts listProduct){
        
        this();
        this.setListStock(listStock);
        this.setListProducts(listProduct);
        this.setListShops(listShops);
        this.setDefault();
    
    }
    
    public ArrayList<Shop> getListShops() {
        return listShops;
    }
    
    public void setListStock(ListStocks listStock){
        this.listStock=listStock.getListStock();
    }

    public void setListShops(ListShops listShops) {
        this.listShops = listShops.getListShop();
        Object[] tmp=null;
        for(int i=0; i<this.listShops.size();i++){
            tmp[i]=this.listShops.get(i).getNameShop();
        }
        this.jComboBoxListShops.setModel(new DefaultComboBoxModel(tmp));
        int aux=-1;
        do{
            aux++;
        }while(this.shop!=this.listShops.get(aux));
        this.jComboBoxListShops.setSelectedIndex(aux);
    }

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ListProducts listProducts) {
        this.listProducts = listProducts.getListProducts();
        Object[] tmp=null;
        for(int i=0; i<this.listProducts.size();i++){
            tmp[i]=this.listProducts.get(i).getNameProduct();
        }
        this.jComboBoxListProducts.setModel(new DefaultComboBoxModel(tmp));
        int aux=-1;
        do{
            aux++;
        }while(this.product!=this.listProducts.get(aux));
        this.jComboBoxListProducts.setSelectedIndex(aux);
    }

    public JComboBox getjComboBoxShop() {
        return jComboBoxListShops;
    }

    public void setShop(int numshop) {
        
        this.shop=listShops.get(numshop);
    }

    public JComboBox getjComboProduct() {
        return jComboBoxListProducts;
    }

    public void setProduct(int numproduct) {
           this.product=listProducts.get(numproduct);
    }

    public double getUnits() {
        return product.getPrice();
    }

    public void setUnits(int units) {
        if(units>0){
            DecimalFormat format= new DecimalFormat("# Unidades");
            this.jTextFieldUnits.setText(format.format(units));
        }else{
             this.jTextFieldUnits.setText("No hay Stock");
        }
        
    }
    public void setStock(int numStock){
        this.stock=this.listStock.get(numStock);
        
    }
    
    public void setDefault(){
        jComboBoxListProducts.setSelectedIndex(-1);
        jComboBoxListShops.setSelectedIndex(-1);
        jTextFieldUnits.setText("No hay unidades");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUnits = new javax.swing.JTextField();
        jComboBoxListShops = new javax.swing.JComboBox();
        jComboBoxListProducts = new javax.swing.JComboBox();

        jLabel1.setText("Tienda:");

        jLabel2.setText("Producto:");

        jLabel3.setText("Unidades:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxListShops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxListProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxListShops, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxListProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxListProducts;
    private javax.swing.JComboBox jComboBoxListShops;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldUnits;
    // End of variables declaration//GEN-END:variables
}
