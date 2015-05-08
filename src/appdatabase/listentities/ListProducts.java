/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentities;

import entitiesDataBase.Products;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Manuel Manzano López
 */
public class ListProducts {
    private final String[] HEAD={"Nombre","Fabricante","Modelo","Tipo", 
        "Especificaciones","Descripción","Color","Fotos","Precio"};
    
    private final String NAME="Productos";
    private ArrayList<Products> listProduct;
    
    public ListProducts(){
        listProduct=new ArrayList();
    }
    
    public ListProducts(String Default){
        listProduct=new ArrayList();
//        this.setDefault();
    }
    public void addProduct(Products product){
        listProduct.add(product);
        
    }
    public Products getProductById(int codProduct){
        for(Products listProduct1:listProduct){
            if(listProduct1.getCodProduct()==codProduct){
                return listProduct.get(codProduct);
            }
        }
        return null;
    }
    
//    public void setDefault(){
//        this.addProduct(new Products(0, "Placa Base 1", "MSI","X88-M", "Intel", 
//                new String[]{"Características 1","Caracteristicas 2"}, "La descripción del producto", Color.blue, null,90));
//        this.addProduct(new Products(1, "Placa Base 2", "Gigabyte","G88-X", "AMD", 
//                new String[]{"Características 1","Caracteristicas 2"}, "La descripción del producto", Color.green, null,89.9));
//        this.addProduct(new Products(2, "Placa Base 3", "Asus","A78-45", "Intel", 
//                new String[]{"Características 1","Caracteristicas 2"}, "La descripción del producto", Color.yellow, null,75.55));
//        this.addProduct(new Products(3, "Tarjeta Gráfica", "XFX","XFX-R7", "AMD", 
//                new String[]{"Características 1","Caracteristicas 2"}, "La descripción del producto", Color.red, null,129.46));
//    }
    public ArrayList<Products> getListProducts() {
        return listProduct;
    }
    public int getSize(){
       return this.listProduct.size();
    }

    public String getNAME() {
        return NAME;
    }
    public String[] getHEAD() {
        return HEAD;
    }
}
