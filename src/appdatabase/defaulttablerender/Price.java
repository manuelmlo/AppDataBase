/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.defaulttablerender;

import java.text.NumberFormat;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Manuel Manzano López
 */
public class Price extends DefaultTableCellRenderer{
    public Price(){
        super();
    }
    
    @Override
    protected void setValue(Object value) {
        NumberFormat format= NumberFormat.getCurrencyInstance();
        setText(format.format(value));
    }
    
}
