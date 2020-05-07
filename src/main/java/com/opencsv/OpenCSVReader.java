package com.opencsv;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCSVReader {
    private static final String SAMPLE_CSV_FILE_PATH = "/home/datta/Desktop/Intellige Projects/OpenCSV Dependency/src/main/resources/sample.csv";
    public static void main(String[] args) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVReader csvReader = new CSVReader(reader);
        ) {
            //reading Record one by one
            String[] nextRecord;
            while ( (nextRecord = csvReader.readNext()) != null) {
                System.out.println("Name : " +nextRecord[0]);
                System.out.println("Email : " +nextRecord[1]);
                System.out.println("Phone : " +nextRecord[2]);
                System.out.println("Country : " +nextRecord[3]);
                System.out.println("==========================");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


