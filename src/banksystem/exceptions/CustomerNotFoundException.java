package banksystem.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    private final String message;

    public CustomerNotFoundException(int id) {
        this.message = "Customer id {" + id + "} is not found ...";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
