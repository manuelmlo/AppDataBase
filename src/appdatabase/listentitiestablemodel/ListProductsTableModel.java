/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentitiestablemodel;

import appdatabase.listentities.ListProducts;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manuel
 */
public class ListProductsTableModel extends AbstractTableModel{
        
    private ListProducts arrayListProducts;
    private final String[] nameColumns;
    
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
    
    
    
}
