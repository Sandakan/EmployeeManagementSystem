package ClassPackage;

import java.util.ArrayList;

public class UserDataStorage extends FileSystem {
    User[] defaultUsers = { new User("1", "admin", "Sandakan", "Nipunajith", "ADMIN") };

    public UserDataStorage() {
        super("USERS");
        writeDefaultRecords(getDefaultUserRecords());

    }

    private ArrayList<String> getDefaultUserRecords() {
        ArrayList<String> defaultUserRecords = new ArrayList<>();

        for (User user : defaultUsers) {
            String userRecord = convertUserToRecord(user);
            defaultUserRecords.add(userRecord);
        }

        return defaultUserRecords;
    }

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

    public boolean isUserAvailable(String firstName, String lastName, String userType) {
        ArrayList<User> userData = getData();

        for (User user : userData) {
            if (user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)
                    && user.getUserId().equals(userType))
                return true;
        }
        return false;
    }

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

    private String convertUserToRecord(User user) {
        String[] userDataString = { user.getUserId(), user.getPassword(), user.getFirstName(), user.getLastName(),
                user.getUserType() };

        String record = createRecord(userDataString);
        return record;
    }

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
