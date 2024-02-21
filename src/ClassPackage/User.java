package ClassPackage;

public class User {

    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String userType;

    public String getUserId() {
        return userId;
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

    public User(String userId, String password, String firstName, String lastName) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = "EMPLOYEE";
    }

    protected User(String userId, String password, String firstName, String lastName, String userType) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }

}
