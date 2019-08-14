package designpatterns.structural.decorator;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);

    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data){
       byte[] res =  data.getBytes();
       return Base64.getEncoder().encodeToString(res);

    }

    private String decode(String data){
      byte[] res =    Base64.getDecoder().decode(data);
      return res.toString();
    }
}
