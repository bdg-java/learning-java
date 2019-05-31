package com.lesson7;

public class InvoiceItemImplementation {
    public static void main(String[] args) {
        InvoiceItem it1 = new InvoiceItem("100", "info", 1, 120);
        System.out.println("GetId of invoice: " + it1.getId());
        System.out.println("GetDesc of invoice: " + it1.getDesc());
        System.out.println("GetQty of invoice: " + it1.getQty());
        System.out.println("GetUnitPrice of invoice: " + it1.getUnitPrice());
        System.out.println("GetTotal of invoice: " + it1.getTotal());
        System.out.println(it1);

    }
}
