package designpatterns.structural.decorator;

public class FileDataSource implements DataSource {
   private String name;

    public  FileDataSource(String name){
        this.name = name;
    }


    @Override
    public void writeData(String data) {
            //file write data logic
        System.out.println("file write");

    }

    @Override
    public String readData() {
      //  File file = new File(name);
        //read file by name
        System.out.println("read file");
        return null;
    }
}
