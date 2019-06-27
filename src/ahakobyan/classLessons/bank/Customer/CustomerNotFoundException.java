package ahakobyan.classLessons.bank.Customer;

public class CustomerNotFoundException extends RuntimeException {

    private  String message;

    public CustomerNotFoundException() {
        this.message = "With This Parameters Customer Not Found...";
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
