/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.defaulttablerender;

import appdatabase.entity.Shop;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Manuel
 */
public class ShopRender extends DefaultTableCellRenderer{

    @Override
    protected void setValue(Object value) {
        if(value!=null){
            Shop tmp;
            tmp = (Shop) value;
             super.setValue(tmp.getNameShop()); 
        }else{
            super.setValue(null);
        }
       
    }

}
