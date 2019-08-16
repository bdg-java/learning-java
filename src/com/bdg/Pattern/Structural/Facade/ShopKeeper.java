package com.bdg.Pattern.Structural.Facade;

public class ShopKeeper {

    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop xiaomi;

    public ShopKeeper() {
        this.iphone = new Iphone();
        this.samsung = new Samsung();
        this.xiaomi = new Xiaomi();
    }

    public void iphoneSale(){
        iphone.modelNo();
        iphone.price();
    }
    public void samsungSale(){
        samsung.modelNo();
        samsung.price();
    }
    public void xiaomisale(){
        xiaomi.modelNo();
        xiaomi.price();
    }
}
