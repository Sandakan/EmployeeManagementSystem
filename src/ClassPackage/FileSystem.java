/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
// import org.json.simple.*;

/**
 *
 * @author adsan
 */

final public class FileSystem {

    final private String filePath = "D://EmployeeManagementSystemAppData//";
    final private String fileName;

    File file;

    public FileSystem(String fileName) {
        this.fileName = fileName;
        initialize();

        // String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
        // Object obj = JSONValue.parse(s);
        // JSONArray array = (JSONArray) obj;

        // System.out.println("The 2nd element of array");
        // System.out.println(array.get(1));
        // System.out.println();
    }

    public boolean isFileAvailable() {
        return file.exists();
    }

    private void createParentFolder() {
        File parentFolder = new File(filePath);
        if (!parentFolder.exists()) {
            parentFolder.mkdirs();
        }
    }

    private void createANewFile() {
        try {
            file.createNewFile();
            System.out.println("File in path " + getFullFilePath() + " created successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred when trying to create a new file in path " + getFullFilePath()
                    + ".\nERROR : " + e);
        }
    }

    private void initialize() {
        this.file = new File(getFullFilePath());

        createParentFolder();
        if (!isFileAvailable()) {
            createANewFile();
        }
    }

    public String getFileName() {
        return fileName + ".txt";
    }

    private String getFullFilePath() {
        return filePath + getFileName();
    }

    public ArrayList<String[]> readFileData() {
        ArrayList<String[]> records = new ArrayList<String[]>();

        try {
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(":");
                records.add(data);
            }

            scanner.close();
            reader.close();

        } catch (IOException e) {
            System.err.println("Error occurred when reading data from " + getFullFilePath());
        }
        return records;
    }

    private void writeFileData(String data, boolean append) {
        try {
            FileWriter writer = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
            writer.close();

        } catch (IOException e) {
            System.err.println("Error occurred when writing data from " + getFullFilePath());
        }
    }

    // other main methods
    // public ArrayList<HashMap<String, String>> getFileData() {
    // ArrayList<String> records = readFileData();

    // switch (fileName) {
    // case "USERS": {
    // ArrayList<HashMap<String, String>> userRecords = new
    // ArrayList<HashMap<String, String>>();

    // if (records.size() == 0)
    // return userRecords;

    // for (String record : records) {
    // String[] userData = record.split(":");

    // HashMap<String, String> user = new HashMap<String, String>();
    // user.put("userId", userData[0]);
    // user.put("password", userData[1]);
    // user.put("firstName", userData[2]);
    // user.put("lastName", userData[3]);
    // user.put("userType", userData[4]);
    // userRecords.add(user);

    // }

    // return userRecords;
    // }

    // default:
    // return new ArrayList<HashMap<String, String>>();
    // }

    // }

    public void appendFileData(String data) {
        writeFileData(data, true);
    }
}
