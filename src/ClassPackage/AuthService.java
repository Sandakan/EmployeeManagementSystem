package ClassPackage;

import java.util.ArrayList;

final public class AuthService {
    protected UserDataStorage userDataStorage;

    public AuthService() {
        this.userDataStorage = new UserDataStorage();
    }

    public User checkUserCredentials(String userId, String password) {
        ArrayList<User> userData = userDataStorage.getData();

        for (User user : userData) {
            if (user.getUserId().equals(userId) && user.checkCredentials(password)) {
                System.out.println("Login success");
                return user;
            }
        }
        System.out.println("Incorrect credentials.");
        return null;
    }
}
