/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiesDataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Manuel
 */
@Entity
@Table(name = "products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByCodProduct", query = "SELECT p FROM Products p WHERE p.codProduct = :codProduct"),
    @NamedQuery(name = "Products.findByNameProduct", query = "SELECT p FROM Products p WHERE p.nameProduct = :nameProduct"),
    @NamedQuery(name = "Products.findByMark", query = "SELECT p FROM Products p WHERE p.mark = :mark"),
    @NamedQuery(name = "Products.findByModel", query = "SELECT p FROM Products p WHERE p.model = :model"),
    @NamedQuery(name = "Products.findByType", query = "SELECT p FROM Products p WHERE p.type = :type"),
    @NamedQuery(name = "Products.findByColor", query = "SELECT p FROM Products p WHERE p.color = :color"),
    @NamedQuery(name = "Products.findByUrl", query = "SELECT p FROM Products p WHERE p.url = :url"),
    @NamedQuery(name = "Products.findByPrice", query = "SELECT p FROM Products p WHERE p.price = :price")})
public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CodProduct")
    private Integer codProduct;
    @Column(name = "NameProduct")
    private String nameProduct;
    @Column(name = "Mark")
    private String mark;
    @Column(name = "Model")
    private String model;
    @Column(name = "Type")
    private String type;
    @Lob
    @Column(name = "Specifications")
    private String specifications;
    @Lob
    @Column(name = "Description")
    private String description;
    @Column(name = "Color")
    private Integer color;
    @Column(name = "Url")
    private String url;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Price")
    private BigDecimal price;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "products")
    private Collection<Stocks> stocksCollection;

    public Products() {
    }

    public Products(Integer codProduct) {
        this.codProduct = codProduct;
    }

    public Integer getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(Integer codProduct) {
        this.codProduct = codProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @XmlTransient
    public Collection<Stocks> getStocksCollection() {
        return stocksCollection;
    }

    public void setStocksCollection(Collection<Stocks> stocksCollection) {
        this.stocksCollection = stocksCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProduct != null ? codProduct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.codProduct == null && other.codProduct != null) || (this.codProduct != null && !this.codProduct.equals(other.codProduct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiesDataBase.Products[ codProduct=" + codProduct + " ]";
    }
    
    public Object[] getProduct(){
        return new Object[]{this.getNameProduct(),this.getModel(),
            this.getMark(),this.getType(),this.getSpecifications(),
            this.getDescription(),this.getColor(),this.getUrl(),this.getPrice()};
    }
}
