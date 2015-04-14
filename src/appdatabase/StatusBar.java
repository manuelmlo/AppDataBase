/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Locale;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author Manuel
 */
public class StatusBar extends JPanel{
    private int numseparator;
    private int posSeparator=JSeparator.VERTICAL;
    private Border border=new BevelBorder(BevelBorder.LOWERED);
    private final Dimension  SIZE= new Dimension(1000, 200);
    JSeparator separator = new JSeparator(posSeparator);
    
    
    public StatusBar(){
        this(JSeparator.VERTICAL, new BevelBorder(BevelBorder.LOWERED));
        
    }
//    public StatusBar(int numseparator){
//        this.numseparator=numseparator;
//        
//    }
    public StatusBar(int posSeparator, Border border){
        super();
        if(border==null){
            this.border=border;
        }
        if(posSeparator!=JSeparator.VERTICAL){
            this.posSeparator=posSeparator;
        }
        this.setBorder( this.border);
        this.setLayout(new BorderLayout());
        separator.setMaximumSize(SIZE);
        separator.setMaximumSize(SIZE);
        this.add(separator,BorderLayout.CENTER);
        this.repaint();

    }
    
    
}
