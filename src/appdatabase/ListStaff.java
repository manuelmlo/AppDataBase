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
public class ListStaff {
    private ArrayList<Employe> liststaff;
    
    public ListStaff(){
        liststaff = new ArrayList();
    }
    public ListStaff(String Default){
        this.setDefault();
    }
    
    public void addEmployer(Employe employer){
        liststaff.add(employer);
    }
    
    public Employe getEmployerById(int codEmploye){
        
        for(Employe liststaff1:liststaff){
            if(liststaff1.getCodEmploye()== codEmploye){
                return liststaff.get(codEmploye);
            }
        }
        return null;
    }
    public void setDefault(){
        this.addEmployer(new Employe(1, "Manuel", "López", "C/Ancha, Nº13, Arcos,11630", 656231569, null,new ListShops("Default").getShopById(1) ));
        this.addEmployer(new Employe(2, "Pedro", "García", null, 648972315, null, new ListShops("Default").getShopById(1)));
        this.addEmployer(new Employe(3, "Rocio", "Fernandez", null, 671235678, null, new ListShops("Default").getShopById(0)));
        this.addEmployer(new Employe(4, "Maria", "Leiva", null, 623145678, null, new ListShops("Default").getShopById(0)));
        
    }
    public ArrayList<Employe> getListStaff() {
        return liststaff;
    }
    public int getSize(){
       return this.liststaff.size();
    }
}
