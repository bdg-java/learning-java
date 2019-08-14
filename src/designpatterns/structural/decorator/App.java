package designpatterns.structural.decorator;

public class App {
    public static void main(String[] args) {

        DataSourceDecorator dataSourceDecorator =new CompressionDecorator(
                new EncryptionDecorator(new FileDataSource("name")));
        DataSourceDecorator dataSourceDecorator1 =
                new EncryptionDecorator(new CompressionDecorator(new FileDataSource("name")));
    }
}
