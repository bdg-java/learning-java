package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viabutton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
