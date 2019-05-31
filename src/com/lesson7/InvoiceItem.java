package com.lesson7;

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

    public int getQty() {
        return this.qty;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setQty(int qty) {
        if (qty < 0)
            System.out.println("Qty is not valid........");
        else this.qty = qty;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.qty * this.unitPrice;
    }

    public String toString() {
        return "Invoice: " + this.id + " " + this.desc + " " + this.unitPrice + " " + this.qty;
    }

}
