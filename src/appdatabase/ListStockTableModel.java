/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase;

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
        this.nameColumns = listStocks.getStockById(0,0).getHead();
    }

    @Override
    public int getRowCount() {
        return arrayListProducts.getListStock().size();
    }

    @Override
    public int getColumnCount() {
        return arrayListProducts.getStockById(0,0).getHead().length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arrayListProducts.getListStock().get(rowIndex).getProduct()[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nameColumns[column];
    }

    public void setArrayList(ListStocks listStocksProducts) {
        this.arrayListProducts = listStocksProducts;
    }
}
