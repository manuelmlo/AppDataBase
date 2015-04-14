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
public class Employe {
    private int codEmploye;
    private String name;
    private String surname;
    private String address;
    private int phone;
    private String email;
    private Shop codshop;
    
    public Employe(){
    
    }
    
    public Employe(int codEmploye, String name, String surname,String address,
            int phone, String email, Shop codShop){
        this.codEmploye=codEmploye;
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.phone=phone;
        this.email=email;
        this.codshop=codShop;
    }
    
    public int getCodEmploye() {
        return codEmploye;
    }

    public void setCodEmploye(int codEmploye) {
        this.codEmploye = codEmploye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Shop getCodshop() {
        return codshop;
    }

    public void setCodshop(Shop codshop) {
        this.codshop = codshop;
    }
    
    
}
