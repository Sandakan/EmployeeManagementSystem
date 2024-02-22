package ClassPackage;

import java.util.ArrayList;

public class DesignationDataStorage extends FileSystem {
    // Designation[] defaultDesignations = { new Designation("1", "HR_MANAGER"), new
    // Designation("2", "HR_ASSISTANT") };

    public DesignationDataStorage() {
        super("DESIGNATIONS");
        // writeDefaultDesignations();
    }

    // public void writeDefaultDesignations() {
    // for (Designation designation : defaultDesignations) {
    // String[] designationData = { designation.getDesignationId(),
    // designation.getName() };
    // appendFileData(createRecord(designationData));
    // }
    // }

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
        Designation lastDesignation = designationData.get((noOfDesignations < 0) ? 0 : (noOfDesignations - 1));

        String lastDesignationId = lastDesignation.getDesignationId();
        int nextDesignationId = (Integer.parseInt(lastDesignationId) + 1);

        return String.valueOf(nextDesignationId);
    }

    public boolean addDesignation(Designation designation) {
        try {
            String[] designationDataString = { designation.getDesignationId(), designation.getName() };

            String record = createRecord(designationDataString);
            appendFileData(record);
            return true;
        } catch (Exception e) {
            System.err.println("An error occurred when adding a new designation." + e);
        }
        return false;
    }
}
