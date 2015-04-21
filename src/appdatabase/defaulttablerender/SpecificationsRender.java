/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.defaulttablerender;

import java.awt.MenuItem;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Manuel Manzano López
 */
public class SpecificationsRender extends DefaultTableCellRenderer{
    
    public SpecificationsRender(){
        super();
    }
    protected void setValue(Object value){
        
        if(!(value==null)){
//            JMenu menu= new JMenu("Especificaciones");
//            String[] aux = (String[])value;
//            for(int i=0;i<aux.length;i++){
//                menu.add(new JMenuItem(aux[i]));
//            }
//            add(menu);
//            String[] aux=(String[])value;
            add(new JButton("carasterísticas"));
            
        }else{
            super.setText("No hay Especificaciones");
        }  
    } 
}
