package solid.srp;

public class UserValidation {
    public boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }
}
