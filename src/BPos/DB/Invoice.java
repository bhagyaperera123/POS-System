package BPos.DB;
// Generated Aug 23, 2016 10:19:13 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Invoice generated by hbm2java
 */
public class Invoice  implements java.io.Serializable {


     private Integer idInvoice;
     private Customer customer;
     private Discount discount;
     private PaymentType paymentType;
     private String dateTime;
     private Double totalAmount;
     private Set invoiceItems = new HashSet(0);
     private Set customerDues = new HashSet(0);
     private Set invoiceCredits = new HashSet(0);
     private Set CReturnses = new HashSet(0);

    public Invoice() {
    }

	
    public Invoice(Discount discount, PaymentType paymentType) {
        this.discount = discount;
        this.paymentType = paymentType;
    }
    public Invoice(Customer customer, Discount discount, PaymentType paymentType, String dateTime, Double totalAmount, Set invoiceItems, Set customerDues, Set invoiceCredits, Set CReturnses) {
       this.customer = customer;
       this.discount = discount;
       this.paymentType = paymentType;
       this.dateTime = dateTime;
       this.totalAmount = totalAmount;
       this.invoiceItems = invoiceItems;
       this.customerDues = customerDues;
       this.invoiceCredits = invoiceCredits;
       this.CReturnses = CReturnses;
    }
   
    public Integer getIdInvoice() {
        return this.idInvoice;
    }
    
    public void setIdInvoice(Integer idInvoice) {
        this.idInvoice = idInvoice;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Discount getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    public PaymentType getPaymentType() {
        return this.paymentType;
    }
    
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public String getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public Double getTotalAmount() {
        return this.totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Set getInvoiceItems() {
        return this.invoiceItems;
    }
    
    public void setInvoiceItems(Set invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
    public Set getCustomerDues() {
        return this.customerDues;
    }
    
    public void setCustomerDues(Set customerDues) {
        this.customerDues = customerDues;
    }
    public Set getInvoiceCredits() {
        return this.invoiceCredits;
    }
    
    public void setInvoiceCredits(Set invoiceCredits) {
        this.invoiceCredits = invoiceCredits;
    }
    public Set getCReturnses() {
        return this.CReturnses;
    }
    
    public void setCReturnses(Set CReturnses) {
        this.CReturnses = CReturnses;
    }




}


