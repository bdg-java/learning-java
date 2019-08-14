package designpatterns.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    CompressionDecorator(DataSource dataSource){
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return deCompress(super.readData());
    }


    public String compress(String data){
        return "compressed";
    }

    public String deCompress(String data){
        return "decompressed";
    }
}
