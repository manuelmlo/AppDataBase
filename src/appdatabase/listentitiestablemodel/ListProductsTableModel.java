/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentitiestablemodel;

import appdatabase.entity.Product;
import appdatabase.listentities.ListProducts;
import java.awt.Color;
import java.awt.Image;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manuel
 */
public class ListProductsTableModel extends AbstractTableModel{
        
    private ListProducts arrayListProducts;
    private final String[] nameColumns;
    private Product product;
    
    public ListProductsTableModel (ListProducts listProducts){
        this.arrayListProducts=listProducts;
        this.nameColumns=arrayListProducts.getHEAD();
    }

    @Override
    public int getRowCount() {
        return arrayListProducts.getListProducts().size();
    }

    @Override
    public int getColumnCount() {
        return nameColumns.length ;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arrayListProducts.getListProducts().get(rowIndex).getProduct()[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nameColumns[column];
    }
    
      
    public void setArrayList(ListProducts listProducts){
        this.arrayListProducts= listProducts;
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 7:
                return false;
            default:
                return true;
        }
    } 
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
          switch(columnIndex){
              case 0:
                  product.setNameProduct((String) aValue);
              case 1:
                  product.setBuilder((String) aValue);
              case 2:
                  product.setMark((String) aValue);
              case 3:
                  product.setType((String) aValue);
              case 4:
                  product.setSpecifications((String[]) aValue);
              case 5:
                  product.setDescriptions((String) aValue);
              case 6:
                  product.setColour((Color) aValue);
//              case 7:
//                  product.setPhotos((Image) aValue);
              case 8:
                  product.setPrice(Integer.valueOf((String) aValue));
              default:     
          }
    }
    
    private void setProduct(int numProduct){
        this.product=arrayListProducts.getListProducts().get(numProduct);
    
    }
}
