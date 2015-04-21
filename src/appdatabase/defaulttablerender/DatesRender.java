/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.defaulttablerender;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Manuel Manzano López
 */
public class DatesRender extends DefaultTableCellRenderer{
    
    public DatesRender(){
        super();
    }

    @Override
    protected void setValue(Object value) {
        value=new Date(System.currentTimeMillis());
        DateFormat format=DateFormat.getDateInstance();      
        setText(format.format(value));
    }
    
    
}
