/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Manuel Manzano López
 */
public class Product {
    private int codProduct;
    private String nameProduct;
    private String builder;
    private String mark;
    private String type;
    private String[] specifications;
    private String descriptions;
    private Color colour;
    private ArrayList<Image> photos;

    public Product(){
    
    }
    public Product(int codProduct,String nameProduct,String builder, 
            String type, String[] specifications,String descriptions, 
            Color colour, Image photo ){
        this.codProduct=codProduct;
        this.nameProduct=nameProduct;
        this.builder=builder;
        this.mark=mark;
        this.type=type;
        this.specifications=specifications;
        this.colour=colour;
        this.photos.add(photo);
    }

    public int getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(int codProduct) {
        this.codProduct = codProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String[] specifications) {
        this.specifications = specifications;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }
    
    public ArrayList<Image> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Image> photos) {
        this.photos = photos;
    }
    
    public Image getPhotos(int photo) {
        return photos.get(photo);
        
    }

    public void setPhotos(Image photo) {
        this.photos.add(photo);
    }
}
