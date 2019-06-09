package Classed;

public class InvoiceItem {

    private String id;
    private String Desc;
    private int qty;
    private double unitPrice;

    private InvoiceItem ( String id, String Desc, int qty, double initPrice){

        this.id = id;
        this.Desc = Desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getid (){
        return this.id;
    }

    public String getDesc (){
        return this.Desc;
    }

    public int getqty (){
        return this.qty;
    }

    public void setqty (int qty){
        this.qty = qty;
    }

    public double getunitPrice (){
        return this.unitPrice;
    }

    public void setunitPrice ( double initPrice){
        this.unitPrice = unitPrice;
    }
     public double getTotat ( ){
        return this.unitPrice * this.qty;
     }

     public String toString (){
        return " InvoiceItem: " + this.id + " , " + this.Desc + " , " + this.qty + " , " + this.unitPrice + "";
     }



}
