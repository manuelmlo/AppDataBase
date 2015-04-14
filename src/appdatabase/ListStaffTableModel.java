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
public class ListStaffTableModel extends AbstractTableModel{
    
    private ListStaff arrayListStaff;
    private final String[] nameColumns;
    
    public ListStaffTableModel (ListStaff listStaff){
        this.arrayListStaff=listStaff;
        this.nameColumns=listStaff.getEmployerById(0).getHead();
    }

    @Override
    public int getRowCount() {
        return arrayListStaff.getListStaff().size();
    }

    @Override
    public int getColumnCount() {
        return arrayListStaff.getEmployerById(0).getHead().length ;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arrayListStaff.getListStaff().get(rowIndex).getEmploye()[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nameColumns[column];
    }
    
      
    public void setArrayList(ListStaff listStaff){
        this.arrayListStaff= listStaff;
    }
    
    
    
}
