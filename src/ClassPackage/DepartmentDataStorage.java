package ClassPackage;

import java.util.ArrayList;

public class DepartmentDataStorage extends FileSystem {
    Department[] defaultDepartments = { new Department("1", "HR") };

    public DepartmentDataStorage() {
        super("DEPARTMENTS");
        writeDefaultRecords(getDefaultDepartmentRecords());
    }

    private ArrayList<String> getDefaultDepartmentRecords() {
        ArrayList<String> defaultDepartmentRecords = new ArrayList<>();

        for (Department department : defaultDepartments) {
            String departmentRecord = convertDepartmentToRecord(department);
            defaultDepartmentRecords.add(departmentRecord);
        }

        return defaultDepartmentRecords;
    }

    public ArrayList<Department> getData() {
        ArrayList<String[]> fileData = this.readFileData();
        ArrayList<Department> departmentData = new ArrayList<Department>();

        for (String[] data : fileData) {
            if (data.length > 1) {
                String id = data[0];
                String name = data[1];

                Department department = new Department(id, name);
                departmentData.add(department);
            }
        }

        return departmentData;
    }

    public boolean isDepartmentAvailable(String name) {
        ArrayList<Department> departmentData = getData();

        for (Department department : departmentData) {
            if (department.getName().equals(name))
                return true;
        }
        return false;
    }

    public String getNextDepartmentId() {
        ArrayList<Department> departmentData = getData();
        int noOfDepartments = departmentData.size();

        if (noOfDepartments > 0) {
            Department lastDepartment = departmentData.get((noOfDepartments - 1));

            String lastDepartmentId = lastDepartment.getDepartmentId();
            int nextDepartmentId = (Integer.parseInt(lastDepartmentId) + 1);

            return String.valueOf(nextDepartmentId);
        }
        return "0";
    }

    private String convertDepartmentToRecord(Department department) {
        String[] departmentDataString = { department.getDepartmentId(), department.getName() };

        String record = createRecord(departmentDataString);
        return record;
    }

    public boolean addDepartment(Department department) {
        try {
            String departmentRecord = convertDepartmentToRecord(department);
            appendFileData(departmentRecord);
            return true;
        } catch (Exception e) {
            System.err.println("An error occurred when adding a new department." + e);
        }
        return false;
    }
}
