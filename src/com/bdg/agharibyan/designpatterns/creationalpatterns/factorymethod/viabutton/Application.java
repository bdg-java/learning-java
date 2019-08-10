package com.bdg.agharibyan.designpatterns.creationalpatterns.factorymethod.viabutton;

public class Application {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        if(System.getProperty("os.name").equals("Windows 7")){
            dialog = new WindowsDialog();
        } else{
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic(){
        dialog.render();
    }
}
