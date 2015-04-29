/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentitiestablemodel;

import appdatabase.entity.Employee;
import appdatabase.listentities.ListStaff;
import java.util.Calendar;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Manuel
 */
public class ListStaffTableModel extends AbstractTableModel{
    
    private ListStaff arrayListStaff;
    private final String[] nameColumns;
    private Employee employee;
    
    
    public ListStaffTableModel (ListStaff listStaff){
        this.arrayListStaff=listStaff;
        this.nameColumns=listStaff.getHEAD();
    }

    @Override
    public int getRowCount() {
        return arrayListStaff.getListStaff().size();
    }

    @Override
    public int getColumnCount() {
        return  nameColumns.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arrayListStaff.getListStaff().get(rowIndex).getEmployee()[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nameColumns[column];
    }
    
      
    public void setArrayList(ListStaff listStaff){
        this.arrayListStaff= listStaff;
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
                employee.setName((String)aValue);
               break;
            case 1:
                employee.setSurname((String)aValue);
            case 2:
                employee.setDateBorn((Calendar)aValue);
                break;
            case 3:
                employee.setAddress((String)aValue);
            case 4:
                employee.setPhone(Integer.valueOf((String)aValue));
                break;
            case 5:
                employee.setEmail((String)aValue);
                break;
            case 6:
                employee.setIsmanager((Boolean)aValue);
            default:
                
        }
         
    }
    public void setEmployee(int numEmployee){
        
        employee=arrayListStaff.getListStaff().get(numEmployee);
        
    }
    
    public void saveEmployee(){
        
    }
    
}
