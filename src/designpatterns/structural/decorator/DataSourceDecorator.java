package designpatterns.structural.decorator;

public class DataSourceDecorator implements DataSource {
    private DataSource wrapper;

    DataSourceDecorator(DataSource dataSource) {
        wrapper = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();

    }
}
