/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiesDataBase;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manuel Manzano López
 */
@Entity
@Table(name = "shops")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shops.findAll", query = "SELECT s FROM Shops s"),
    @NamedQuery(name = "Shops.findByCodShop", query = "SELECT s FROM Shops s WHERE s.codShop = :codShop"),
    @NamedQuery(name = "Shops.findByNameShop", query = "SELECT s FROM Shops s WHERE s.nameShop = :nameShop"),
    @NamedQuery(name = "Shops.findByAddress", query = "SELECT s FROM Shops s WHERE s.address = :address"),
    @NamedQuery(name = "Shops.findByTelephone", query = "SELECT s FROM Shops s WHERE s.telephone = :telephone"),
    @NamedQuery(name = "Shops.findByEmail", query = "SELECT s FROM Shops s WHERE s.email = :email")})
public class Shops implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodShop")
    private Integer codShop;
    @Column(name = "NameShop")
    private String nameShop;
    @Column(name = "Address")
    private String address;
    @Column(name = "Telephone")
    private String telephone;
    @Column(name = "Email")
    private String email;
    @OneToMany(mappedBy = "codShop")
    private Collection<Staff> staffCollection;

    public Shops() {
    }

    public Shops(Integer codShop) {
        this.codShop = codShop;
    }

    public Integer getCodShop() {
        return codShop;
    }

    public void setCodShop(Integer codShop) {
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<Staff> getStaffCollection() {
        return staffCollection;
    }

    public void setStaffCollection(Collection<Staff> staffCollection) {
        this.staffCollection = staffCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codShop != null ? codShop.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shops)) {
            return false;
        }
        Shops other = (Shops) object;
        if ((this.codShop == null && other.codShop != null) || (this.codShop != null && !this.codShop.equals(other.codShop))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiesDataBase.Shops[ codShop=" + codShop + " ]";
    }
    
}
