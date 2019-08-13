package designpatterns.creational.factorymethod;

public class Application {
    static Dialog dialog;

    public static void main(String[] args) {

            if(args.length  ==0)//some logic
            {
                dialog = new HtmlDialog();
            }else {
                dialog = new WindowsDialog();
            }

            dialog.renderWindow();

    }
}
