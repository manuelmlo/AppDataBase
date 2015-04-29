/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.format;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Manuel Manzano López
 */
public class MaxLenghtString extends PlainDocument {
    private int value;
    
    public MaxLenghtString(int value){
        this.value=value;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(this.getLength()+ str.length()<=value){
            super.insertString(offs, str, a);
        }
         
    }
    
    
    
}
