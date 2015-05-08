/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase.entity;

/**
 *
 * @author Manuel Manzano López
 */
public class Shop {
    private final String[] HEAD={"Nombre de la Tienda","Dirección","Teléfono", "E-mail"};
    private int codShop ;
    private String nameShop ;
    private String address;
    private int Telephone;
    private String email; 
    
    public Shop(){
    
    }
    
    public Shop(int codShop, String nameShop, String address, int phone, String email){
        this.codShop=codShop;
        this.nameShop=nameShop;
        this.address=address;
        this.Telephone=phone;
        this.email=email;
    
    }
    public int getCodShop() {
        return codShop;
    }

    public void setCodShop(int codShop) {
        this.codShop = codShop;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int phone) {
        this.Telephone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Object[] getShop(){
        return new Object[]{this.getNameShop(),this.getAddress(),this.getTelephone()
                ,this.getEmail()};
    }
    public String[] getHead(){
        return HEAD;
    }
}
