package ClassPackage;

import java.util.ArrayList;

/* 
 * User Data Storage class
 * 
 * Used to handle data related to user accounts.
 * Uses the FileSystem class to access files.
 * 
 */
public class UserDataStorage extends FileSystem {
    User[] defaultUsers = { new User("1", "admin", "Sandakan", "Nipunajith", "ADMIN") };

    public UserDataStorage() {
        super("USERS");
        writeDefaultRecords(getDefaultUserRecords());

    }

    /** Write default records if the users.txt file is empty. */
    private ArrayList<String> getDefaultUserRecords() {
        ArrayList<String> defaultUserRecords = new ArrayList<>();

        for (User user : defaultUsers) {
            String userRecord = convertUserToRecord(user);
            defaultUserRecords.add(userRecord);
        }

        return defaultUserRecords;
    }

    /**
     * Used to get user data.
     * Returns an arraylist of User instances that can be iterated.
     */
    public ArrayList<User> getData() {
        ArrayList<String[]> fileData = this.readFileData();
        ArrayList<User> userData = new ArrayList<User>();

        for (String[] data : fileData) {
            if (data.length >= 5) {
                String id = data[0];
                String pass = data[1];
                String firstName = data[2];
                String lastName = data[3];
                String userType = data[4];

                User user = new User(id, pass, firstName, lastName, userType);
                userData.add(user);
            }
        }

        return userData;
    }

    /**
     * Checks whether there is a user available with the provided firstName,
     * lastName and userType
     */
    public boolean isUserAvailable(String firstName, String lastName, String userType) {
        ArrayList<User> userData = getData();

        for (User user : userData) {
            if (user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)
                    && user.getUserId().equals(userType))
                return true;
        }
        return false;
    }

    /**
     * Used to get the next user id by reading available user ids and determining
     * the next integer as the next user id
     * Returns 0 if there are no records
     */
    public String getNextUserId() {
        ArrayList<User> userData = getData();
        int noOfUsers = userData.size();

        if (noOfUsers > 0) {
            User lastUser = userData.get((noOfUsers - 1));
            String lastUserId = lastUser.getUserId();
            int nextUserId = (Integer.parseInt(lastUserId) + 1);

            return String.valueOf(nextUserId);
        }
        return "0";
    }

    /** Used to convert a User instance to a string so that it can be saved */
    private String convertUserToRecord(User user) {
        String[] userDataString = { user.getUserId(), user.getPassword(), user.getFirstName(), user.getLastName(),
                user.getUserType() };

        String record = createRecord(userDataString);
        return record;
    }

    /** Used to add a new user to the system */
    public boolean addUser(User user) {
        try {
            String userRecord = convertUserToRecord(user);
            appendFileData(userRecord);
            return true;
        } catch (Exception e) {
            System.err.println("An error occurred when adding a new user." + e);
        }
        return false;
    }
}
