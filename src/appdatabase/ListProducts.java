/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Manuel Manzano López
 */
public class ListProducts {
    private ArrayList<Product> listProduct;
    
    public ListProducts(){
        listProduct=new ArrayList();
    }
    
    public ListProducts(String Default){
        listProduct=new ArrayList();
        this.setDefault();
    }
    public void addProduct(Product product){
        listProduct.add(product);
        
    }
    public Product getProductById(int codProduct){
        for(Product listProduct1:listProduct){
            if(listProduct1.getCodProduct()==codProduct){
                return listProduct.get(codProduct);
            }
        }
        return null;
    }
    
    public void setDefault(){
        this.addProduct(new Product(1, "Placa Base 1", "MSI", "Intel", 
                new String[]{"Características 1","Caracteristicas 2"}, "La descripción del producto", Color.blue, null));
        this.addProduct(new Product(2, "Placa Base 2", "Gigabyte", "AMD", 
                new String[]{"Características 1","Caracteristicas 2"}, "La descripción del producto", Color.green, null));
        this.addProduct(new Product(3, "Placa Base 3", "Asus", "Intel", 
                new String[]{"Características 1","Caracteristicas 2"}, "La descripción del producto", Color.yellow, null));
        this.addProduct(new Product(4, "Tarjeta Gráfica", "XFX", "AMD", 
                new String[]{"Características 1","Caracteristicas 2"}, "La descripción del producto", Color.red, null));
    }
    
}
