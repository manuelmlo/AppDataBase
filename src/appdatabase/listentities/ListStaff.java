/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.listentities;

import appdatabase.entity.Employee;
import entitiesDataBase.Staff;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Manuel Manzano López
 */
public class ListStaff {

    private final String[] HEAD={"Nombre","Apellidos","Fecha Nacimiento",
        "Dirección","Teléfono", "E-mail","Empleado","Tienda"};
    private final String NAME = "Empleados";
    private List<Staff> liststaff;

    public ListStaff() {
        liststaff = new ArrayList();
    }

    public ListStaff(String Default) {
        liststaff = new ArrayList();
//        this.setDefault();

    }

    public void addEmployee(Staff employee) {
        liststaff.add(employee);

    }

    public Staff getEmployerById(int codEmploye) {

        for (Staff liststaff1 : liststaff) {
            if (liststaff1.getCodEmployer() == codEmploye) {
                return liststaff.get(codEmploye);
            }
        }
        return null;

    }

//    public void setDefault() {
//        Calendar time = Calendar.getInstance();
//        this.addEmployee(new Staff (0, "Manuel", "López Hernandez",null, "C/Ancha, Nº13, Arcos,11630", 656231569, "manuel@gm.com", true, new ListShops().getShopById(1)));
//        this.addEmployee(new Staff(1, "Pedro", "García Benitez", null, "C/Corredera, Nº21, Arcos,11630", 648972315, "pedrog@yho.es", false, new ListShops().getShopById(1)));
//        this.addEmployee(new Staff (2, "Rocio", "Fernandez Castellano", null, "C/, Nº1, Arcos,11630", 671235678, "rociofer@got.com", true, new ListShops().getShopById(0)));
//        this.addEmployee(new Staff (3, "Maria", "Leiva Barrera", null, "C/Ancha, Nº13, Arcos,11630", 623145678, "marialb@gm.com", false, new ListShops().getShopById(0)));
//
//    }

    public String[] getHEAD() {
        return HEAD;
    }

    public String getNAME() {
        return NAME;
    }

    public List<Staff> getListStaff() {
        return liststaff;
    }

    public int getSize() {
        return this.liststaff.size();
    }
}
