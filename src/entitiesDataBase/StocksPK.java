/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiesDataBase;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Manuel
 */
@Embeddable
public class StocksPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CodShop")
    private int codShop;
    @Basic(optional = false)
    @Column(name = "CodProduct")
    private int codProduct;

    public StocksPK() {
    }

    public StocksPK(int codShop, int codProduct) {
        this.codShop = codShop;
        this.codProduct = codProduct;
    }

    public int getCodShop() {
        return codShop;
    }

    public void setCodShop(int codShop) {
        this.codShop = codShop;
    }

    public int getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(int codProduct) {
        this.codProduct = codProduct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codShop;
        hash += (int) codProduct;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StocksPK)) {
            return false;
        }
        StocksPK other = (StocksPK) object;
        if (this.codShop != other.codShop) {
            return false;
        }
        if (this.codProduct != other.codProduct) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiesDataBase.StocksPK[ codShop=" + codShop + ", codProduct=" + codProduct + " ]";
    }
    
}
