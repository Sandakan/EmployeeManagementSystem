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

abstract class FileSystem {

    final private String dataSeperator = ":";
    final private String filePath = "D://EmployeeManagementSystemAppData//";
    final private String fileName;

    File file;

    public FileSystem(String fileName) {
        this.fileName = fileName;
        initialize();
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

    public String createRecord(String[] data) {
        return String.join(dataSeperator, data);
    }

    public String getFileName() {
        return fileName + ".txt";
    }

    private String getFullFilePath() {
        return filePath + getFileName();
    }

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

    public void appendFileData(String data) {
        writeFileData(data, true);
    }

    @SuppressWarnings("rawtypes")
    public abstract ArrayList getData();
}
