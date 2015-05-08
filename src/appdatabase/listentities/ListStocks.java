/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentities;

import entitiesDataBase.Stocks;
import java.util.ArrayList;

/**
 *
 * @author Manuel Manzano López
 */
public class ListStocks {
    private final String[] HEAD={"Tienda","Producto","Stock"};
    private final String NAME="Stock";
    private ArrayList<Stocks> listStock;
    
    public ListStocks(){
        listStock= new ArrayList();
    }
    public ListStocks(String Default){
        listStock= new ArrayList();
//        this.setDefault();
    }
    public void addStock(Stocks stock){
        listStock.add(stock);
    }
   
    public Stocks getStockById(int shop, int product){
        for (Stocks listStock1 : listStock) {
            if (listStock1.getShops().getCodShop() == 
                    shop && listStock1.getProducts().getCodProduct() == product) {
                return listStock1;
            }
        }
        return null;
    }
//    public void setDefault(){
//        this.addStock(new Stocks(new ListShops().getShopById(0),new ListProducts().getProductById(0), 3));
//        this.addStock(new Stocks(new ListShops().getShopById(1),new ListProducts().getProductById(0), 5));
//        this.addStock(new Stocks(new ListShops().getShopById(0),new ListProducts().getProductById(1), 8));
//        this.addStock(new Stocks(new ListShops().getShopById(1),new ListProducts().getProductById(1), 4));
//        this.addStock(new Stocks(new ListShops().getShopById(0),new ListProducts().getProductById(2), 6));
//        this.addStock(new Stocks(new ListShops().getShopById(1),new ListProducts().getProductById(2), 2));
//    }

    public String[] getHEAD() {
        return HEAD;
    }

    public String getNAME() {
        return NAME;
    }
    
    public ArrayList<Stocks> getListStock() {
        return listStock;
    }
    public int getSize(){
       return this.listStock.size();
    }
}
