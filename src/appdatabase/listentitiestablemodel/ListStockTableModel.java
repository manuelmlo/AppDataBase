/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentitiestablemodel;

import appdatabase.listentities.ListStocks;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manuel
 */
public class ListStockTableModel extends AbstractTableModel{

    private ListStocks arrayListProducts;
    private final String[] nameColumns;

    public ListStockTableModel(ListStocks listStocks) {
        this.arrayListProducts = listStocks;
        this.nameColumns = arrayListProducts.getHEAD();
    }

    @Override
    public int getRowCount() {
        return arrayListProducts.getListStock().size();
    }

    @Override
    public int getColumnCount() {
        return nameColumns.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arrayListProducts.getListStock().get(rowIndex).getStock()[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nameColumns[column];
    }

    public void setArrayList(ListStocks listStocksProducts) {
        this.arrayListProducts = listStocksProducts;
    }
}
