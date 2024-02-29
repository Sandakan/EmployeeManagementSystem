package ClassPackage;

import java.util.ArrayList;

/* 
 * Designation Data Storage class
 * 
 * Used to handle data related to designations.
 * Uses the FileSystem class to access files.
 * 
 */
public class DesignationDataStorage extends FileSystem {
    Designation[] defaultDesignations = { new Designation("1", "HR_MANAGER"), new Designation("2", "HR_ASSISTANT") };

    public DesignationDataStorage() {
        super("DESIGNATIONS");
        writeDefaultRecords(getDefaultDesignationRecords());
    }

    /** Write default records if the designations.txt file is empty. */
    private ArrayList<String> getDefaultDesignationRecords() {
        ArrayList<String> defaultDesignationRecords = new ArrayList<>();

        for (Designation designation : defaultDesignations) {
            String designationRecord = convertDesignationToRecord(designation);
            defaultDesignationRecords.add(designationRecord);
        }

        return defaultDesignationRecords;
    }

    /**
     * Used to get designation data.
     * Returns an arraylist of Designation instances that can be iterated.
     */
    public ArrayList<Designation> getData() {
        ArrayList<String[]> fileData = this.readFileData();
        ArrayList<Designation> designationData = new ArrayList<Designation>();

        for (String[] data : fileData) {
            String id = data[0];
            String name = data[1];

            Designation designation = new Designation(id, name);
            designationData.add(designation);
        }

        return designationData;
    }

    /**
     * Checks whether there is a designation available with the provided name
     */
    public boolean isDesignationAvailable(String name) {
        ArrayList<Designation> designationData = getData();

        for (Designation designation : designationData) {
            if (designation.getName().equals(name))
                return true;
        }
        return false;
    }

    /**
     * Used to get the next designation id by reading available designation ids and
     * determining
     * the next integer as the next designation id
     * Returns 0 if there are no records
     */
    public String getNextDesignationId() {
        ArrayList<Designation> designationData = getData();
        int noOfDesignations = designationData.size();
        if (noOfDesignations > 0) {

            Designation lastDesignation = designationData.get((noOfDesignations - 1));

            String lastDesignationId = lastDesignation.getDesignationId();
            int nextDesignationId = (Integer.parseInt(lastDesignationId) + 1);

            return String.valueOf(nextDesignationId);
        }
        return "0";
    }

    /**
     * Used to convert a Designation instance to a string so that it can be saved
     */
    private String convertDesignationToRecord(Designation designation) {
        String[] designationDataString = { designation.getDesignationId(), designation.getName() };

        String record = createRecord(designationDataString);
        return record;
    }

    /** Used to add a new designation to the system */
    public boolean addDesignation(Designation designation) {
        try {
            String designationRecord = convertDesignationToRecord(designation);
            appendFileData(designationRecord);
            return true;
        } catch (Exception e) {
            System.err.println("An error occurred when adding a new designation." + e);
        }
        return false;
    }
}
