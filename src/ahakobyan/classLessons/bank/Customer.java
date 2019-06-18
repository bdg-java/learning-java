package ahakobyan.classLessons.bank;

public class Customer extends AbstractBankEntity {

    private String customerName;
    private String customerSurname;
    private Address customerAddress;

    public Customer(String customerName, String customerSurname, Address customerAddress) {
        this.customerAddress = customerAddress;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return this.customerSurname;
    }

    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }

    public Address getCustomerAddress() {
        return this.customerAddress;
    }

    public void setCustomerAddress(Address customerAddress) {
        this.customerAddress = customerAddress;
    }
}
