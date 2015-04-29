/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiesDataBase;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manuel Manzano López
 */
@Entity
@Table(name = "staff")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s"),
    @NamedQuery(name = "Staff.findByCodEmployer", query = "SELECT s FROM Staff s WHERE s.codEmployer = :codEmployer"),
    @NamedQuery(name = "Staff.findByNameEmployer", query = "SELECT s FROM Staff s WHERE s.nameEmployer = :nameEmployer"),
    @NamedQuery(name = "Staff.findBySurNameEmployer", query = "SELECT s FROM Staff s WHERE s.surNameEmployer = :surNameEmployer"),
    @NamedQuery(name = "Staff.findByDateBorn", query = "SELECT s FROM Staff s WHERE s.dateBorn = :dateBorn"),
    @NamedQuery(name = "Staff.findByDni", query = "SELECT s FROM Staff s WHERE s.dni = :dni"),
    @NamedQuery(name = "Staff.findByAddress", query = "SELECT s FROM Staff s WHERE s.address = :address"),
    @NamedQuery(name = "Staff.findByCp", query = "SELECT s FROM Staff s WHERE s.cp = :cp"),
    @NamedQuery(name = "Staff.findByTelephone", query = "SELECT s FROM Staff s WHERE s.telephone = :telephone"),
    @NamedQuery(name = "Staff.findByEmail", query = "SELECT s FROM Staff s WHERE s.email = :email")})
public class Staff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodEmployer")
    private Integer codEmployer;
    @Column(name = "NameEmployer")
    private String nameEmployer;
    @Column(name = "SurNameEmployer")
    private String surNameEmployer;
    @Column(name = "DateBorn")
    @Temporal(TemporalType.DATE)
    private Date dateBorn;
    @Column(name = "DNI")
    private String dni;
    @Column(name = "Address")
    private String address;
    @Column(name = "Cp")
    private String cp;
    @Column(name = "Telephone")
    private String telephone;
    @Column(name = "Email")
    private String email;
    @JoinColumn(name = "CodShop", referencedColumnName = "CodShop")
    @ManyToOne
    private Shops codShop;

    public Staff() {
    }

    public Staff(Integer codEmployer) {
        this.codEmployer = codEmployer;
    }

    public Integer getCodEmployer() {
        return codEmployer;
    }

    public void setCodEmployer(Integer codEmployer) {
        this.codEmployer = codEmployer;
    }

    public String getNameEmployer() {
        return nameEmployer;
    }

    public void setNameEmployer(String nameEmployer) {
        this.nameEmployer = nameEmployer;
    }

    public String getSurNameEmployer() {
        return surNameEmployer;
    }

    public void setSurNameEmployer(String surNameEmployer) {
        this.surNameEmployer = surNameEmployer;
    }

    public Date getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
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

    public Shops getCodShop() {
        return codShop;
    }

    public void setCodShop(Shops codShop) {
        this.codShop = codShop;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEmployer != null ? codEmployer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.codEmployer == null && other.codEmployer != null) || (this.codEmployer != null && !this.codEmployer.equals(other.codEmployer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiesDataBase.Staff[ codEmployer=" + codEmployer + " ]";
    }
    
}
