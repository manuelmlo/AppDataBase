/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentities;

import appdatabase.entity.Shop;
import java.util.ArrayList;

/**
 *
 * @author Manuel Manzano López
 */
public class ListShops {
    private final String NAME="Tiendas";
    private ArrayList<Shop> listShop;
    
    public ListShops(String Default){
        listShop = new ArrayList();
        this.setDefault();
    }
    
    public ListShops(){
        listShop = new ArrayList();
    }
    
    public void addShop( Shop shop){
        listShop.add(shop);
    }
    
    public Shop getShopById(int codShop){
        if(listShop!=null){
            for (int x=0; x<listShop.size();x++) {
                if(listShop.get(x).getCodShop()==codShop){
                    return listShop.get(codShop);
                }
            }
        }
        return null;
    }
    
    public Shop getShopById(){
        if(listShop!=null){
            return listShop.get(0);
        }else{
            return null;
        }
    }
    
    private void setDefault(){
        
        this.addShop(new Shop(1, "Tienda de Ubrique", "C/Avenida de Oria, Nº100, 11600, Ubrique, Cádiz",956460000, "tiendaubrique@gm.com"));
        this.addShop(new Shop(2,"Tienda de Arcos", "C/Avenida Miguel Mancheño, Nº50, Arcos, Cádiz", 956700000, "tiendaarcos@gm.com"));
    }

    public ArrayList<Shop> getListShop() {
        return listShop;
    }
    public int getSize(){
       return this.listShop.size();
    }
    
}
