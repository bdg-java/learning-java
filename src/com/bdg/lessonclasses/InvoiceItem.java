package com.bdg.lessonclasses;

public class InvoiceItem {
 private String id;
 private String desc;
 private int qty;
 private double unitPrice;

public InvoiceItem(String id, String desc, int qty, double unitPrice) {
    this.id = id;
    this.desc = desc;
    this.qty = qty;
    this.unitPrice = unitPrice;
}

    public String getId() {
        return this.id;
    }

    public String getDesc() {
    return this.desc;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
     return unitPrice*qty;
    }

    public String toString() {
        return "InvoiceItem[id: "+this.id + ", desc: " + this.desc + ", qty: "+this.qty+ ", unitPrice: "+this.unitPrice + "]";
    }


    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("123456789", "round", 10, 10);
        System.out.println(invoiceItem.toString());
        System.out.println(invoiceItem.getTotal());
        System.out.println(invoiceItem.getDesc());
        System.out.println(invoiceItem.getUnitPrice());
    }

}