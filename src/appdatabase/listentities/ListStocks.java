/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentities;

import appdatabase.entity.Stock;
import java.util.ArrayList;

/**
 *
 * @author Manuel Manzano López
 */
public class ListStocks {
    private final String[] HEAD= new Stock().getHead();
    private final String NAME="Stock";
    private ArrayList<Stock> listStock;
    
    public ListStocks(){
        listStock= new ArrayList();
    }
    public ListStocks(String Default){
        listStock= new ArrayList();
        this.setDefault();
    }
    public void addStock(Stock stock){
        listStock.add(stock);
    }
   
    public Stock getStockById(int shop, int product){
        for (Stock listStock1 : listStock) {
            if (listStock1.getShop().getCodShop() == 
                    shop && listStock1.getProduct().getCodProduct() == product) {
                return listStock1;
            }
        }
        return null;
    }
    public void setDefault(){
        this.addStock(new Stock(new ListShops("Default").getShopById(0),new ListProducts("Default").getProductById(0), 3));
        this.addStock(new Stock(new ListShops("Default").getShopById(1),new ListProducts("Default").getProductById(0), 5));
        this.addStock(new Stock(new ListShops("Default").getShopById(0),new ListProducts("Default").getProductById(1), 8));
        this.addStock(new Stock(new ListShops("Default").getShopById(1),new ListProducts("Default").getProductById(1), 4));
        this.addStock(new Stock(new ListShops("Default").getShopById(0),new ListProducts("Default").getProductById(2), 6));
        this.addStock(new Stock(new ListShops("Default").getShopById(1),new ListProducts("Default").getProductById(2), 2));
    }

    public String[] getHEAD() {
        return HEAD;
    }

    public String getNAME() {
        return NAME;
    }
    
    public ArrayList<Stock> getListStock() {
        return listStock;
    }
    public int getSize(){
       return this.listStock.size();
    }
}
