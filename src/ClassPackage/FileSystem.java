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

/**
 *
 * @author adsan
 */

/*
 * FileSystem class
 */
abstract class FileSystem {

    final private String dataSeperator = ":";
    final private String filePath = "D://EmployeeManagementSystemAppData//";
    final private String fileName;

    File file;

    /**
     * Constructor to initialize the FileSystem
     * 
     * @param fileName file name without the file extension to be used to store data
     */
    public FileSystem(String fileName) {
        this.fileName = fileName;
        initialize();
    }

    /** Checks whether the specified file exists */
    public boolean isFileAvailable() {
        return file.exists();
    }

    /**
     * Checks whether the parent folder of the data file exists, creating the parent
     * folder if doesn't
     */
    private void createParentFolder() {
        File parentFolder = new File(filePath);
        if (!parentFolder.exists()) {
            parentFolder.mkdirs();
        }
    }

    /**
     * Used to write default records of data if there are no records available in
     * the data file
     */
    protected void writeDefaultRecords(ArrayList<String> defaultRecords) {
        try {
            boolean isFileEmpty = !file.exists() || file.length() == 0;

            if (isFileEmpty) {
                for (String record : defaultRecords) {
                    appendFileData(record);
                }
                System.out.println("Successfully wrote default records to " + this.getFileName());
            }

        } catch (Exception e) {
            System.err.println("Error occurred when writing default records to the file." + e);
        }
    }

    /**
     * Creates a new file with the specified file name in a pre-defined parent path.
     */
    private void createANewFile() {
        try {
            file.createNewFile();
            System.out.println("File in path " + getFullFilePath() + " created successfully.");
        } catch (IOException e) {
            System.err.println("Error occurred when trying to create a new file in path " + getFullFilePath()
                    + ".\nERROR : " + e);
        }
    }

    /** Used to initialize the main methods of the FileSystem */
    private void initialize() {
        this.file = new File(getFullFilePath());

        createParentFolder();
        if (!isFileAvailable()) {
            createANewFile();
        }
    }

    /** Used to join an array of strings to a single string */
    public String createRecord(String[] data) {
        return String.join(dataSeperator, data);
    }

    /** Returns the file name with the file extension */
    public String getFileName() {
        return fileName + ".txt";
    }

    /** Returns the full file path with the file extension */
    private String getFullFilePath() {
        return filePath + getFileName();
    }

    /**
     * Returns the read records from the data file as array list with string arrays
     */
    protected ArrayList<String[]> readFileData() {
        ArrayList<String[]> records = new ArrayList<String[]>();

        try {
            FileReader reader = new FileReader(file);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(dataSeperator);
                records.add(data);
            }

            scanner.close();
            reader.close();

        } catch (IOException e) {
            System.err.println("Error occurred when reading data from " + getFullFilePath());
        }
        return records;
    }

    /**
     * Used to write data to the data file as a record, with the option to append
     */
    protected void writeFileData(String data, boolean append) {
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

    /** Used to append data to the data file as a record */
    public void appendFileData(String data) {
        writeFileData(data, true);
    }

    @SuppressWarnings("rawtypes")
    public abstract ArrayList getData();
}
