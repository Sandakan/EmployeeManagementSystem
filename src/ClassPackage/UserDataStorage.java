package ClassPackage;

import java.util.ArrayList;

public class UserDataStorage extends FileSystem {
    public UserDataStorage() {
        super("USERS");
    }

    public ArrayList<User> getData() {
        ArrayList<String[]> fileData = this.readFileData();
        ArrayList<User> userData = new ArrayList<User>();

        for (String[] data : fileData) {
            String id = data[0];
            String pass = data[1];
            String firstName = data[2];
            String lastName = data[3];
            String epfNumber = data[4];
            String department = data[5];
            String designation = data[6];

            User user = new User(id, pass, firstName, lastName, epfNumber, department, designation);
            userData.add(user);
        }

        return userData;
    }

    public boolean isUserAvailable(String firstName, String lastName, String epfNumber) {
        ArrayList<User> userData = getData();

        for (User user : userData) {
            if (user.getFirstName().equals(firstName) && user.getLastName().equals(lastName)
                    && user.getEpfNumber().equals(epfNumber))
                return true;
        }
        return false;
    }

    public String getNextUserId() {
        ArrayList<User> userData = getData();
        int noOfUsers = userData.size();
        User lastUser = userData.get((noOfUsers < 0) ? 0 : (noOfUsers - 1));

        String lastUserId = lastUser.getUserId();
        int nextUserId = (Integer.parseInt(lastUserId) + 1);

        return String.valueOf(nextUserId);
    }

    public void addUser(User user) {
        String[] userDataString = { user.getUserId(), user.getPassword(), user.getFirstName(), user.getLastName(),
                user.getEpfNumber(), user.getDepartment(), user.getDesignation() };

        String record = createRecord(userDataString);
        appendFileData(record);
    }
}
