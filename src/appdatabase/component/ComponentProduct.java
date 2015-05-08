/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.component;

import appdatabase.format.MaxLenghtString;
import appdatabase.format.Values;
import appdatabase.listentities.ListProducts;
import entitiesDataBase.Products;
import java.awt.Color;
import java.awt.Image;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;

/**
 *
 * @author Manuel
 */
public class ComponentProduct extends javax.swing.JPanel {
    private ArrayList<Products> listProduct;
    private Products product;
    private int numElementProduct;
    /**
     * Creates new form ComponentProduct
     */
    public ComponentProduct() {
        initComponents();
        this.setDefault();
        
    }
 
    public ComponentProduct(ListProducts listProducts){
        this();
        this.listProduct=listProducts.getListProducts();
    }
    private void  setRestricctions(){
        this.jTextFieldName.setDocument(new MaxLenghtString(new Values().MAX15));
        this.jTextFieldBuilder.setDocument(new MaxLenghtString(new Values().MAX15));
        this.jTextFieldModel.setDocument(new MaxLenghtString(new Values().MAX15));
        this.jTextFieldType.setDocument(new MaxLenghtString(new Values().MAX10));
        this.jTextAreaDescriptions.setDocument(new MaxLenghtString(new Values().DESCRIPTIONS_MAX));
        this.jTextAreaEspcifications.setDocument(new MaxLenghtString(new Values().TEXT));
    }
    
    public void setElementProduct(int numProduct) {
        this.numElementProduct=numProduct;
        this.product=this.listProduct.get(numProduct);
        this.jTextFieldName.setText(this.product.getNameProduct());
        this.jTextFieldBuilder.setText(this.product.getModel());
        this.jTextFieldModel.setText(this.product.getMark());
        this.jTextFieldType.setText(this.product.getType());
        this.jTextAreaEspcifications.setText(this.product.getSpecifications());
        this.jTextAreaDescriptions.setText(this.product.getDescription());
        this.jPanelColor.setBackground(new Color(this.product.getColor()));
        this.jLabelPhoto.setIcon(new ImageIcon(this.product.getUrl()));
    }
    
    public void setDefault(){
        this.jTextFieldName.setText("No hay elemento seleccionado.");
        this.jTextFieldBuilder.setText("No hay elemento seleccionado.");
        this.jTextFieldModel.setText("No hay elemento seleccionado.");
        this.jTextFieldType.setText("No hay elemento seleccionado.");
        this.jTextAreaEspcifications.setText("No hay elemento seleccionado.");
        this.jTextAreaDescriptions.setText("No hay elemento seleccionado.");
        this.jPanelColor.setBackground(null);
        this.jPanelColor.setToolTipText("No hay color seleccionado");
        this.jLabelPhoto.setIcon(null);
        this.jLabelPhoto.setText("No hay Imagen");
        this.repaint();
    }
    
    public ArrayList<Products> getListProduct() {
        return listProduct;
    }

    public void setListProduct(ListProducts listProduct) {
        this.listProduct = listProduct.getListProducts();
    }

    public Products getProduct() {
        return product;
    }

    public String getPhoto() {
        return this.product.getUrl();
    }

    public void setPhoto(Image image) {
        this.jLabelPhoto.setIcon(new ImageIcon(image));
    }

    public Color getColor() {
        return jPanelColor.getBackground();
    }

    public void setColor(Color Color) {
        this.jPanelColor.setBackground(Color);
    }

    public String getDescriptions() {
        return jTextAreaDescriptions.getText();
    }

    public void setDescriptions(String Descriptions) {
        this.jTextAreaDescriptions.setText(Descriptions);
    }

    public String getEspcifications() {
        return jTextAreaEspcifications.getText();
    }

    public void setEspcifications(String Espcifications) {
        this.jTextAreaEspcifications.setText(Espcifications);
    }

    public String getBuilder() {
        return jTextFieldBuilder.getText();
    }

    public void setBuilder(String Builder) {
        this.jTextFieldBuilder.setText(Builder);
    }

    public String getModel() {
        return jTextFieldModel.getText();
    }

    public void setModel(String Model) {
        this.jTextFieldModel.setText(Model);
    }

    public String getNameProduct() {
        return jTextFieldName.getText();
    }

    public void setNameProduct(String nameProduct) {
        this.jTextFieldName.setText(nameProduct);
    }

    public double getPrice() {
        return Double.valueOf(jTextFieldPrice.getText());
    }

    public void setPrice(double Price) {
        NumberFormat format= NumberFormat.getCurrencyInstance();
        this.jTextFieldPrice.setText(format.format(Price));
    }

    public String getType() {
        return jTextFieldType.getText();
    }

    public void setType(String Type) {
        this.jTextFieldType.setText(Type);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldBuilder = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldModel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldType = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanelColor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaEspcifications = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDescriptions = new javax.swing.JTextArea();
        jToggleButtonSelectModify = new javax.swing.JToggleButton();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        jLabel1.setText("Nombre:");

        jLabel2.setText("Fabricante:");

        jTextFieldBuilder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuilderActionPerformed(evt);
            }
        });

        jLabel3.setText("Modelo:");

        jLabel4.setText("Tipo:");

        jLabel11.setText("Precio:");

        jLabel7.setText("Color:");

        jPanelColor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelColorLayout = new javax.swing.GroupLayout(jPanelColor);
        jPanelColor.setLayout(jPanelColorLayout);
        jPanelColorLayout.setHorizontalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );
        jPanelColorLayout.setVerticalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        jButton1.setText("Color...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Fotos:");

        jLabelPhoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Especificaciones:");

        jTextAreaEspcifications.setColumns(20);
        jTextAreaEspcifications.setRows(5);
        jScrollPane3.setViewportView(jTextAreaEspcifications);

        jLabel10.setText("Descripción:");

        jTextAreaDescriptions.setColumns(20);
        jTextAreaDescriptions.setRows(5);
        jScrollPane4.setViewportView(jTextAreaDescriptions);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addGap(100, 100, 100))
                                .addComponent(jLabel4))
                            .addComponent(jTextFieldType)
                            .addComponent(jTextFieldModel)
                            .addComponent(jTextFieldBuilder)
                            .addComponent(jTextFieldName)
                            .addComponent(jTextFieldPrice)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jLabel7)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldBuilder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel11)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel8)
                    .addGap(1, 1, 1)
                    .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        jToggleButtonSelectModify.setText("Consultar");
        jToggleButtonSelectModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSelectModifyActionPerformed(evt);
            }
        });

        jButtonSave.setText("Guardar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Eliminar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButtonSelectModify, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSave)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonDelete)
                    .addComponent(jToggleButtonSelectModify))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuilderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuilderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuilderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jPanelColor.setBackground(JColorChooser.showDialog(jButton1, "Selector de Color", this.getColor()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButtonSelectModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSelectModifyActionPerformed
        if(jToggleButtonSelectModify.isSelected()){
            this.actionModify();
        }else{

            this.actionSelect();

        }
    }//GEN-LAST:event_jToggleButtonSelectModifyActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        listProduct.add(numElementProduct, product);
        listProduct.remove(numElementProduct+1);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        this.listProduct.remove(this.numElementProduct);
        this.setDefault();
    }//GEN-LAST:event_jButtonDeleteActionPerformed
    private void actionSelect(){
        jToggleButtonSelectModify.setText("Consultar");
        jToggleButtonSelectModify.setSelected(false);
        this.jButtonSave.setEnabled(false);
        this.jButtonDelete.setEnabled(true);
    }
    private void actionModify(){
        jToggleButtonSelectModify.setText("Modificar");
        jToggleButtonSelectModify.setSelected(true);
        this.jButtonSave.setEnabled(true);
        this.jButtonDelete.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelColor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaDescriptions;
    private javax.swing.JTextArea jTextAreaEspcifications;
    private javax.swing.JTextField jTextFieldBuilder;
    private javax.swing.JTextField jTextFieldModel;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldType;
    private javax.swing.JToggleButton jToggleButtonSelectModify;
    // End of variables declaration//GEN-END:variables
}
