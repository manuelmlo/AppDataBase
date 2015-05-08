/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiesDataBase;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "stocks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stocks.findAll", query = "SELECT s FROM Stocks s"),
    @NamedQuery(name = "Stocks.findByCodShop", query = "SELECT s FROM Stocks s WHERE s.stocksPK.codShop = :codShop"),
    @NamedQuery(name = "Stocks.findByCodProduct", query = "SELECT s FROM Stocks s WHERE s.stocksPK.codProduct = :codProduct"),
    @NamedQuery(name = "Stocks.findByStock", query = "SELECT s FROM Stocks s WHERE s.stock = :stock")})
public class Stocks implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StocksPK stocksPK;
    @Column(name = "Stock")
    private Integer stock;
    @JoinColumn(name = "CodShop", referencedColumnName = "CodShop", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Shops shops;
    @JoinColumn(name = "CodProduct", referencedColumnName = "CodProduct", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Products products;

    public Stocks() {
    }

    public Stocks(StocksPK stocksPK) {
        this.stocksPK = stocksPK;
    }

    public Stocks(int codShop, int codProduct) {
        this.stocksPK = new StocksPK(codShop, codProduct);
    }

    public StocksPK getStocksPK() {
        return stocksPK;
    }

    public void setStocksPK(StocksPK stocksPK) {
        this.stocksPK = stocksPK;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Shops getShops() {
        return shops;
    }

    public void setShops(Shops shops) {
        this.shops = shops;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stocksPK != null ? stocksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stocks)) {
            return false;
        }
        Stocks other = (Stocks) object;
        if ((this.stocksPK == null && other.stocksPK != null) || (this.stocksPK != null && !this.stocksPK.equals(other.stocksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiesDataBase.Stocks[ stocksPK=" + stocksPK + " ]";
    }
    public Object[] getStocks(){
        return new Object[]{this.getShops(),this.getProducts(),this.getStock()};
    }
}
