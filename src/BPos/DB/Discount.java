package BPos.DB;
// Generated Aug 23, 2016 10:19:13 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Discount generated by hbm2java
 */
public class Discount  implements java.io.Serializable {


     private Integer idDiscount;
     private Integer value;
     private Integer status;
     private Set productses = new HashSet(0);
     private Set invoices = new HashSet(0);

    public Discount() {
    }

    public Discount(Integer value, Integer status, Set productses, Set invoices) {
       this.value = value;
       this.status = status;
       this.productses = productses;
       this.invoices = invoices;
    }
   
    public Integer getIdDiscount() {
        return this.idDiscount;
    }
    
    public void setIdDiscount(Integer idDiscount) {
        this.idDiscount = idDiscount;
    }
    public Integer getValue() {
        return this.value;
    }
    
    public void setValue(Integer value) {
        this.value = value;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Set getProductses() {
        return this.productses;
    }
    
    public void setProductses(Set productses) {
        this.productses = productses;
    }
    public Set getInvoices() {
        return this.invoices;
    }
    
    public void setInvoices(Set invoices) {
        this.invoices = invoices;
    }




}


