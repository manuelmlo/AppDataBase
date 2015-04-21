/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.entity;

/**
 *
 * @author Manuel Manzano López
 */
public class Stock {
    private final String[] HEAD={"Tienda","Producto","Stock"};
    private Shop Shop;
    private Product Product;
    private int stockItem;
    
    public Stock(){
    
    }
    public Stock(Shop codShop, Product codProduct, int stock){
        this.Shop= codShop;
        this.Product=codProduct;
        this.stockItem=stock;

    }

    public Shop getShop() {
        return Shop;
    }

    public void setShop(Shop Shop) {
        this.Shop = Shop;
    }

    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product Product) {
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
    
    public String[] getHead(){
        return HEAD;
    }
}
