package solid.srp;


public class UserRegistration {
    UserValidation userValidation;
    UserPersistance userPersistance;
    public UserRegistration(UserValidation userValidation, UserPersistance userPersistance) {
        this.userValidation = userValidation;
        this.userPersistance = userPersistance;
    }
    public void registerUser(String username, String password) {

        if(!userValidation.isValidPassword(password)) {
            throw new IllegalArgumentException("Password does not meet the criteria.");
        }
        userPersistance.saveUser(username, password);

    }
}
