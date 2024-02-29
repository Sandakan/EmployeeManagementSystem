package ClassPackage;

import java.util.ArrayList;

/* 
 * Employee Data Storage class
 * 
 * Used to handle data related to employees.
 * Uses the FileSystem class to access files.
 * 
 */
public class EmployeeDataStorage extends FileSystem {
    public EmployeeDataStorage() {
        super("EMPLOYEES");
    }

    /**
     * Used to get employee data.
     * Returns an arraylist of Employee instances that can be iterated.
     */
    public ArrayList<Employee> getData() {
        ArrayList<String[]> fileData = this.readFileData();
        ArrayList<Employee> employeeData = new ArrayList<Employee>();

        for (String[] data : fileData) {
            String id = data[0];
            String firstName = data[1];
            String lastName = data[2];
            String epfNumber = data[3];
            String department = data[4];
            String designation = data[5];

            Employee employee = new Employee(id, firstName, lastName, epfNumber, department, designation);
            employeeData.add(employee);
        }

        return employeeData;
    }

    /**
     * Checks whether there is a employee available with the provided firstName,
     * lastName and epfNumber
     */
    public boolean isEmployeeAvailable(String firstName, String lastName, String epfNumber) {
        ArrayList<Employee> employeeData = getData();

        for (Employee employee : employeeData) {
            if (employee.getEpfNumber().equals(epfNumber))
                return true;
        }
        return false;
    }

    /**
     * Used to get the next employee id by reading available employee ids and
     * determining
     * the next integer as the next employee id
     * Returns 0 if there are no records
     */
    public String getNextEmployeeId() {
        ArrayList<Employee> employeeData = getData();
        int noOfEmployees = employeeData.size();

        if (noOfEmployees > 0) {
            Employee lastEmployee = employeeData.get((noOfEmployees - 1));
            String lastEmployeeId = lastEmployee.getEmployeeId();
            int nextEmployeeId = (Integer.parseInt(lastEmployeeId) + 1);

            return String.valueOf(nextEmployeeId);
        }
        return "0";
    }

    /** Used to convert a Employee instance to a string so that it can be saved */
    private String convertEmployeeToRecord(Employee employee) {
        String[] employeeDataString = { employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(),
                employee.getEpfNumber(), employee.getDepartment(), employee.getDesignation() };

        String record = createRecord(employeeDataString);
        return record;
    }

    /** Used to add a new employee to the system */
    public boolean addEmployee(Employee employee) {
        try {
            String employeeRecord = convertEmployeeToRecord(employee);
            appendFileData(employeeRecord);
            return true;
        } catch (Exception e) {
            System.err.println("An error occurred when adding a new employee." + e);
        }
        return false;
    }

    /**
     * Used to search employees by different search criteria
     * 
     */
    public ArrayList<Employee> searchEmployees(String firstName, String lastName, String epfNumber, String department,
            String designation) {
        ArrayList<Employee> employeeData = getData();
        ArrayList<Employee> filteredEmployeeData = new ArrayList<>();

        for (Employee employee : employeeData) {
            /*
             * Checks whether the parameter is null or blank,
             * Then checks if the lowercased string parameter will match
             * 
             * If parameter is null or blank, the trinary operator will return true.
             * Else it will go to check for the parameter and return either true or false
             */
            boolean isFirstNameAvailable = ((firstName != null && !firstName.isBlank())
                    ? (employee.getFirstName().toLowerCase().contains(firstName.toLowerCase()))
                    : true);
            boolean isLastNameAvailable = ((lastName != null && !lastName.isBlank())
                    ? (employee.getLastName().toLowerCase().contains(lastName.toLowerCase()))
                    : true);
            boolean isEpfNumberAvailable = ((epfNumber != null && !epfNumber.isBlank())
                    ? (employee.getEpfNumber().toLowerCase().contains(epfNumber.toLowerCase()))
                    : true);
            boolean isDepartmentAvailable = ((department != null && !department.isBlank())
                    ? (employee.getDepartment().equals(department))
                    : true);
            boolean isDesignationAvailable = ((designation != null && !designation.isBlank())
                    ? (employee.getDesignation().equals(designation))
                    : true);

            if (isFirstNameAvailable && isLastNameAvailable && isEpfNumberAvailable && isDepartmentAvailable
                    && isDesignationAvailable) {
                filteredEmployeeData.add(employee);
            }
        }

        return filteredEmployeeData;
    }
}
