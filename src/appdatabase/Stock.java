/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase;

/**
 *
 * @author Manuel Manzano López
 */
public class Stock {
    private Shop codShop;
    private Product codProduct;
    private int stock;
    
    public Stock(){
    
    }
    public Stock(Shop codShop, Product codProduct, int stock){
        this.codShop= codShop;
        this.codProduct=codProduct;
        this.stock=stock;

    }

    public Shop getCodShop() {
        return codShop;
    }

    public void setCodShop(Shop codShop) {
        this.codShop = codShop;
    }

    public Product getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(Product codProduct) {
        this.codProduct = codProduct;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
