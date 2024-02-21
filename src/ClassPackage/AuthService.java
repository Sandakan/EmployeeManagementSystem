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
            String epfNumber = data[4];
            String department = data[5];
            String designation = data[6];

            if (id.equals(userId) && pass.equals(password)) {
                System.out.println("Login success");

                User user = new User(id, pass, firstName, lastName, epfNumber, department, designation);
                return user;
            }
        }
        System.out.println("Incorrect credentials.");
        return null;
    }
}
