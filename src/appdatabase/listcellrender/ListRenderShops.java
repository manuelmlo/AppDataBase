/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listcellrender;

import appdatabase.entity.Shop;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Manuel Manzano López
 */
public class ListRenderShops extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        Shop shop = (Shop) value;
        super.setText(shop.getNameShop());
        if (isSelected) {
            this.setBackground(Color.BLUE);
        } else {
            this.setBackground(Color.white);
        }
        return this;

    }
    
    
    
}
