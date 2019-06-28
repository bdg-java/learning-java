package banksystem.exceptions;

public class CardTypeNotFoundException extends RuntimeException {
    public final String Default_Message = "Card Type not found ... ";
    public final String message;

    public CardTypeNotFoundException(String cardName) {
        this.message = String.format(Default_Message, cardName);
    }

    public String getMessage() {
        return this.message;
    }
}



