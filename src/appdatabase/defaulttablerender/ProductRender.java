/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.defaulttablerender;

import appdatabase.entity.Product;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Manuel
 */
public class ProductRender extends DefaultTableCellRenderer {

    @Override
    protected void setValue(Object value) {
        if(value!=null){
            Product tmp;
            tmp= (Product)value;
            super.setValue(tmp.getNameProduct());
        }else{
            super.setValue(null);
        }
         
    }
    
}
