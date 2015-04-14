/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase;

import java.util.ArrayList;

/**
 *
 * @author Manuel Manzano López
 */
public class ListShops {
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
        for (Shop listShop1 : listShop) {
            if(listShop1.getCodShop()==codShop){
                return listShop.get(codShop);
            }
        }
        return null;
    }
    private void setDefault(){
        
        this.addShop(new Shop(1, "Tienda de Ubrique", "C/Avenida de Oria, Nº100, 11600, Ubrique, Cádiz",956460000, "tiendaubrique@gm.com"));
        this.addShop(new Shop(2,"Tienda de Arcos", "C/Avenida Miguel Mancheño, Nº50, Arcos, Cádiz", 956700000, "tiendaarcos@gm.com"));
    }
}
