package ClassPackage;

final public class Admin extends User {

    private Admin(String userId, String password, String firstName, String lastName) {
        super(userId, password, firstName, lastName, "ADMIN");

    }

    public static Admin getAnAdminFromUser(User user) {
        if (user.getUserType().equals("ADMIN")) {
            Admin admin = new Admin(user.getUserId(), user.getPassword(), user.getFirstName(), user.getLastName());
            return admin;
        }
        return null;

    }

}
