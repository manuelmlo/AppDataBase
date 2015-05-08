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
 * @author Manuel
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
    @NamedQuery(name = "Staff.findByAddress", query = "SELECT s FROM Staff s WHERE s.address = :address"),
    @NamedQuery(name = "Staff.findByTelephone", query = "SELECT s FROM Staff s WHERE s.telephone = :telephone"),
    @NamedQuery(name = "Staff.findByEmail", query = "SELECT s FROM Staff s WHERE s.email = :email"),
    @NamedQuery(name = "Staff.findByIsBoss", query = "SELECT s FROM Staff s WHERE s.isBoss = :isBoss")})
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
    @Column(name = "Address")
    private String address;
    @Column(name = "Telephone")
    private String telephone;
    @Column(name = "Email")
    private String email;
    @Column(name = "IsBoss")
    private Boolean isBoss;
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

    public Boolean getIsBoss() {
        return isBoss;
    }

    public void setIsBoss(Boolean isBoss) {
        this.isBoss = isBoss;
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
    public Object[] getEmployee(){
        return new Object[]{this.getNameEmployer(),this.getSurNameEmployer(),this.getDateBorn(),this.getAddress(),this.getTelephone()
                ,this.getEmail(),this.getIsBoss(),this.getCodShop()};
    }
}
