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
public class Shop {
    private int codShop ;
    private String nameShop ;
    private String address;
    private int phone;
    private String email; 
    
    public Shop(){
    
    }
    
    public Shop(int codShop, String nameShop, String address, int phone, String email){
        this.codShop=codShop;
        this.nameShop=nameShop;
        this.address=address;
        this.phone=phone;
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
  
}
