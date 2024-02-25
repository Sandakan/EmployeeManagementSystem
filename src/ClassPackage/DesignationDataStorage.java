package ClassPackage;

import java.util.ArrayList;

public class DesignationDataStorage extends FileSystem {
    Designation[] defaultDesignations = { new Designation("1", "HR_MANAGER"), new Designation("2", "HR_ASSISTANT") };

    public DesignationDataStorage() {
        super("DESIGNATIONS");
        writeDefaultRecords(getDefaultDesignationRecords());
    }

    private ArrayList<String> getDefaultDesignationRecords() {
        ArrayList<String> defaultDesignationRecords = new ArrayList<>();

        for (Designation designation : defaultDesignations) {
            String designationRecord = convertDesignationToRecord(designation);
            defaultDesignationRecords.add(designationRecord);
        }

        return defaultDesignationRecords;
    }

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

    public boolean isDesignationAvailable(String name) {
        ArrayList<Designation> designationData = getData();

        for (Designation designation : designationData) {
            if (designation.getName().equals(name))
                return true;
        }
        return false;
    }

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

    private String convertDesignationToRecord(Designation designation) {
        String[] designationDataString = { designation.getDesignationId(), designation.getName() };

        String record = createRecord(designationDataString);
        return record;
    }

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
