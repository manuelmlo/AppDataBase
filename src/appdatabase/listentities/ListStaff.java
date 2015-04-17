/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentities;

import appdatabase.entity.Employee;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Manuel Manzano López
 */
public class ListStaff {
    private final String NAME="Empleados";
    private ArrayList<Employee> liststaff;
    
    public ListStaff(){
        liststaff = new ArrayList();
    }
    public ListStaff(String Default){
        this.setDefault();
    }
    
    public void addEmployer(Employee employer){
        liststaff.add(employer);
    }
    
    public Employee getEmployerById(int codEmploye){
        
        for(Employee liststaff1:liststaff){
            if(liststaff1.getCodEmploye()== codEmploye){
                return liststaff.get(codEmploye);
            }
        }
        return null;
        
    }
    public void setDefault(){
        this.addEmployer(new Employee(0, "Manuel", "López", null,"C/Ancha, Nº13, Arcos,11630", 656231569, null,true,new ListShops("Default").getShopById(1)));
        this.addEmployer(new Employee(1, "Pedro", "García", null,"C/Corredera, Nº21, Arcos,11630", 648972315, null, false,new ListShops("Default").getShopById(1)));
        this.addEmployer(new Employee(2, "Rocio", "Fernandez", null,"C/, Nº1, Arcos,11630", 671235678, null, true,new ListShops("Default").getShopById(0)));
        this.addEmployer(new Employee(3, "Maria", "Leiva",null ,"C/Ancha, Nº13, Arcos,11630", 623145678, null,false ,new ListShops("Default").getShopById(0)));
        
    }
    public ArrayList<Employee> getListStaff() {
        return liststaff;
}
    public int getSize(){
       return this.liststaff.size();
    }
}
