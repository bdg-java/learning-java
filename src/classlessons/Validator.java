package classlessons;

public class Validator {
    public static boolean validatePassword(char[] password, int expectedSize) {
        return password.length == expectedSize;
    }
}
