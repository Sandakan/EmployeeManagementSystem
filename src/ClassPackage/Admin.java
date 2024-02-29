package ClassPackage;

/* 
 * Admin Class
 * 
 * This class cannot be directly initialized unless the static `getAnAdminFromUser` method is called.
 * 
 */
final public class Admin extends User {
    // Private constructor of the Admin class
    private Admin(String userId, String password, String firstName, String lastName) {
        super(userId, password, firstName, lastName, "ADMIN");

    }

    // Static method used to return an Admin class from the User class
    public static Admin getAnAdminFromUser(User user) {
        if (user.getUserType().equals("ADMIN")) {
            Admin admin = new Admin(user.getUserId(), user.getPassword(), user.getFirstName(), user.getLastName());
            return admin;
        }
        return null;

    }

}
