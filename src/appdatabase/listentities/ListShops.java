/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentities;

import entitiesDataBase.Shops;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Manzano López
 */
public class ListShops {
//    private final String [] HEAD= new Shop().getHead();
    private final String NAME="Tiendas";
    private List<Shops> listShop;
    
    public ListShops(String Default){
        listShop = new ArrayList();
//        this.setDefault();
    }
    
    public ListShops(){
        listShop = new ArrayList();
    }
    
    public void addShop( Shops shop){
        listShop.add(shop);
    }
    
    public Shops getShopById(int codShop){
        if(listShop!=null){
            for (int x=0; x<listShop.size();x++) {
                if(listShop.get(x).getCodShop()==codShop){
                    return listShop.get(codShop);
                }
            }
        }
        return null;
    }
    
    public Shops getShopById(){
        if(listShop!=null){
            return listShop.get(0);
        }else{
            return null;
        }
    }
    
//    private void setDefault(){
//        this.addShop(new Shops(0, "Tienda de Ubrique", "C/Avenida de Oria, Nº100, 11600, Ubrique, Cádiz",956460000, "tiendaubrique@gm.com"));
//        this.addShop(new Shops(1,"Tienda de Arcos", "C/Avenida Miguel Mancheño, Nº50, Arcos, Cádiz", 956700000, "tiendaarcos@gm.com"));
//    }
//    public String[] getHEAD() {
//        return HEAD;
//    }

    public String getNAME() {
        return NAME;
    }
    public List<Shops> getListShop() {
        return listShop;
    }
    public int getSize(){
       return this.listShop.size();
    }
    public void setListShop(List<Shops> list){
        this.listShop=new ArrayList();
        this.listShop=list;     
    }
}
