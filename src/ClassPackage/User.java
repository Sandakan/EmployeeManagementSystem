package ClassPackage;

/**
 * User class
 */
public class User {

    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String userType;

    public String getUserId() {
        return userId;
    }

    protected String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserType() {
        return userType;
    }

    /**
     * Used to check credentials without returning the password to prevent password
     * fields
     */
    public boolean checkCredentials(String password) {
        return getPassword().equals(password);
    }

    public User(String userId, String password, String firstName, String lastName, String userType) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }

}
