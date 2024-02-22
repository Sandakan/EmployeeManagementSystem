package ClassPackage;

public class User {

    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    /**
     * "
     * An EPF number is a unique identification number given to every individual
     * enrolled in the Employee Provident Fund (EPF) scheme. It consist of both
     * numbers and alphabets.
     * "
     * - Google
     * 
     * Eg: CO COL 1234567 001
     */
    private String epfNumber;
    private String department;
    private String designation;

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

    public String getEpfNumber() {
        return epfNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public boolean checkCredentials(String password) {
        return getPassword().equals(password);
    }

    public User(String userId, String password, String firstName, String lastName, String epfNumber,
            String department) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.epfNumber = epfNumber;
        this.department = department;
        this.designation = "EMPLOYEE";
    }

    public User(String userId, String password, String firstName, String lastName, String epfNumber,
            String department, String designation) {
        this.userId = userId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.epfNumber = epfNumber;
        this.department = department;
        this.designation = designation;
    }

}
