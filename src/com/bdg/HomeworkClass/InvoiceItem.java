package com.bdg.HomeworkClass;

public class InvoiceItem {

     private int id;
     private String desc;
     private int qty;
     private double unitPrice;

     public InvoiceItem( int id, String desc, int qty, double unitPrice ){
         this.id = id;
         this.desc = desc;
         this.qty = qty;
         this.unitPrice = unitPrice;
     }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public String getDesc() {
        return desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
         return unitPrice * qty;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
