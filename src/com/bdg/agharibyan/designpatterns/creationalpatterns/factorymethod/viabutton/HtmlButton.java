package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viabutton;

public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>CountWordsInSentenceAndReverseWord button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click.Button says - Hello");
    }
}
