package ClassPackage;

import java.util.ArrayList;

final public class AuthService {
    protected FileSystem fs;

    public AuthService() {
        fs = new FileSystem("USERS");
    }

    public User checkUserCredentials(String userId, String password) {
        ArrayList<String[]> userData = fs.readFileData();

        for (String[] data : userData) {
            String id = data[0];
            String pass = data[1];
            String firstName = data[2];
            String lastName = data[3];
            String userType = data[4];

            if (id.equals(userId) && pass.equals(password)) {
                System.out.println("Login success");

                User user = new User(id, pass, firstName, lastName, userType);
                return user;
            }
        }
        System.out.println("Incorrect credentials.");
        return null;
    }
}
