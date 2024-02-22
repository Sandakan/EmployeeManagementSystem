package ClassPackage;

import java.util.ArrayList;

public class DepartmentDataStorage extends FileSystem {
    // Department[] defaultDepartments = { new Department("1", "HR") };

    public DepartmentDataStorage() {
        super("DEPARTMENTS");
        // writeDefaultDepartments();
    }

    // public void writeDefaultDepartments() {
    // for (Department department : defaultDepartments) {
    // String[] departmentData = { department.getDepartmentId(),
    // department.getName() };
    // appendFileData(createRecord(departmentData));
    // }
    // }

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
        Department lastDepartment = departmentData.get((noOfDepartments < 0) ? 0 : (noOfDepartments - 1));

        String lastDepartmentId = lastDepartment.getDepartmentId();
        int nextDepartmentId = (Integer.parseInt(lastDepartmentId) + 1);

        return String.valueOf(nextDepartmentId);
    }

    public boolean addDepartment(Department department) {
        try {
            String[] departmentDataString = { department.getDepartmentId(), department.getName() };

            String record = createRecord(departmentDataString);
            appendFileData(record);
            return true;
        } catch (Exception e) {
            System.err.println("An error occurred when adding a new department." + e);
        }
        return false;
    }
}
