package ahakobyan.classLessons.bank.Customer;

public class CustomerCreationException extends RuntimeException {

    private String message;

    public CustomerCreationException() {
        this.message = "Invalid parameters...";
    }

    public String getMessage() {
        return this.message;
    }

}
