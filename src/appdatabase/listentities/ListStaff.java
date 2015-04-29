/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentities;

import appdatabase.entity.Employee;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Manuel Manzano López
 */
public class ListStaff {

    private final String[] HEAD = new Employee().getHead();
    private final String NAME = "Empleados";
    private List<Employee> liststaff;

    public ListStaff() {
        liststaff = new ArrayList();
    }

    public ListStaff(String Default) {
        liststaff = new ArrayList();
        this.setDefault();

    }

    public void addEmployee(Employee employee) {
        liststaff.add(employee);

    }

    public Employee getEmployerById(int codEmploye) {

        for (Employee liststaff1 : liststaff) {
            if (liststaff1.getCodEmploye() == codEmploye) {
                return liststaff.get(codEmploye);
            }
        }
        return null;

    }

    public void setDefault() {
        this.addEmployee(new Employee(0, "Manuel", "López Hernandez", null, "C/Ancha, Nº13, Arcos,11630", 656231569, "manuel@gm.com", true, new ListShops("Default").getShopById(1)));
        this.addEmployee(new Employee(1, "Pedro", "García Benitez", null, "C/Corredera, Nº21, Arcos,11630", 648972315, "pedrog@yho.es", false, new ListShops("Default").getShopById(1)));
        this.addEmployee(new Employee(2, "Rocio", "Fernandez Castellano", null, "C/, Nº1, Arcos,11630", 671235678, "rociofer@got.com", true, new ListShops("Default").getShopById(0)));
        this.addEmployee(new Employee(3, "Maria", "Leiva Barrera", null, "C/Ancha, Nº13, Arcos,11630", 623145678, "marialb@gm.com", false, new ListShops("Default").getShopById(0)));

    }

    public String[] getHEAD() {
        return HEAD;
    }

    public String getNAME() {
        return NAME;
    }

    public List<Employee> getListStaff() {
        return liststaff;
    }

    public int getSize() {
        return this.liststaff.size();
    }
}
