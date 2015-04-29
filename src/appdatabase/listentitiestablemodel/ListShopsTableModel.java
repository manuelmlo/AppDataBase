/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentitiestablemodel;

import appdatabase.entity.Shop;
import appdatabase.listentities.ListShops;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manuel Manzano López
 */
public class ListShopsTableModel extends AbstractTableModel{
    private ListShops arrayListShop;
    private final String[] nameColumns;
    private Shop shop;
    
    public ListShopsTableModel (ListShops listShops){
        this.arrayListShop=listShops;
        this.nameColumns=arrayListShop.getHEAD();
    }

    @Override
    public int getRowCount() {
        return arrayListShop.getListShop().size();
    }

    @Override
    public int getColumnCount() {
        return nameColumns.length ;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arrayListShop.getListShop().get(rowIndex).getShop()[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nameColumns[column];
    }
    
      
    public void setArrayList(ListShops listShops){
        this.arrayListShop= listShops;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        
        switch(columnIndex){
            case 0:
                shop.setNameShop((String)aValue);
               break;
            case 1:
                shop.setAddress((String)aValue);
                break;
            case 2:
                shop.setPhone(Integer.valueOf((String)aValue));
                break;
            case 3:
                shop.setEmail((String)aValue);
                break;
            default:       
        }  
    }
    private void setShop(int numShop){
        shop=arrayListShop.getListShop().get(numShop);
    }
    
}
