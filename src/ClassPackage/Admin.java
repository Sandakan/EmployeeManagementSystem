package ClassPackage;

final public class Admin extends User {

    private Admin(String userId, String password, String firstName, String lastName, String epfNumber,
            String department, String designation) {
        super(userId, password, firstName, lastName, epfNumber, department, designation);

    }

    public static Admin getAnAdminFromUser(User user) {
        if (user.getDesignation().equals("ADMIN")) {
            Admin admin = new Admin(user.getUserId(), user.getPassword(), user.getFirstName(), user.getLastName(),
                    user.getEpfNumber(), "HEAD_OFFICE", "ADMIN");
            return admin;
        }
        return null;

    }

}
