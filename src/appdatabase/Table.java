/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manuel Manzano López
 */
public class Table extends JTable{
    private JTable  tableDisplay;
 
    
    
    public Table(JTable jtable){
        this.tableDisplay = jtable;
    }
    /**
     * Método que modifica el Modelo de la tabla.
     * @param data
     * @param head
     */
    public void setTableModel(Object[][] data, String [] head){
        tableDisplay.setModel(new DefaultTableModel(data, head)); 
    } 
}
