/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listcellrender;

import appdatabase.entity.Product;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author Manuel Manzano López
 */
public class ListRenderProducts extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        Product product = (Product) value;
        this.setText(product.getNameProduct());
        if (isSelected) {
            this.setBackground(Color.BLUE);
        } else {
            this.setBackground(Color.white);
        }
        return this;
    }

}
