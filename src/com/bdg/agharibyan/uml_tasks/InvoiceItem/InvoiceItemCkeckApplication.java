package com.bdg.agharibyan.uml_tasks.InvoiceItem;

public class InvoiceItemCkeckApplication {
    public static void main(String[] args) {

        InvoiceItem object = new InvoiceItem("645", "desc", 5, 6.0);

        System.out.println(object.getID());
        System.out.println(object.getDesc());
        System.out.println(object.getQty());
        object.setQty(10);
        System.out.println(object.getQty());
        System.out.println(object.getUnitPrice());
        object.setUnitPrice(10.5);
        System.out.println(object.getUnitPrice());
        System.out.println(object.getTotal());
        System.out.println(object.toString());
    }
}
