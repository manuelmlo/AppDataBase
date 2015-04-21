/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.defaulttablerender;

import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Manuel Manzano López
 */
public class ColourRender extends DefaultTableCellRenderer {
    
    public ColourRender(){
        super();
    }
    @Override
    protected void setValue(Object value){
        if(value!=null){
            super.setBackground((Color) value);
        }else{
            super.setBackground(Color.white);
        }
        
    }
    
    
}
