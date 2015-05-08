package appdatabase.entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entitiesDataBase.Products;
import entitiesDataBase.Shops;

/**
 *
 * @author Manuel Manzano López
 */
public class Stock {
    private Shops Shop;
    private Products Product;
    private int stockItem;
    
    public Stock(){
    
    }
    public Stock(Shops codShop, Products codProduct, int stock){
        this.Shop= codShop;
        this.Product=codProduct;
        this.stockItem=stock;

    }

    public Shops getShop() {
        return Shop;
    }

    public void setShop(Shops Shop) {
        this.Shop = Shop;
    }

    public Products getProduct() {
        return Product;
    }

    public void setProduct(Products Product) {
        this.Product = Product;
    }

    public int getStockItem() {
        return stockItem;
    }

    public void setStockItem(int stockItem) {
        this.stockItem = stockItem;
    }

    public Object[] getStock(){
        return new Object[]{this.getShop(),this.getProduct(),this.getStockItem()};
    }
    
}
