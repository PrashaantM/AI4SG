package org.apache.housingapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HousingFinder {
    public static List<Housing> getHousingData(String fileName) {
        List<Housing> housingData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String address = data[0];
                double price = Double.parseDouble(data[1]);
                String location = data[2];
                List<String> proximityServices = Arrays.asList(data[3].split(" "));
                boolean available = Boolean.parseBoolean(data[4]);

                housingData.add(new Housing(address, price, location, proximityServices, available));
            }
        } catch (IOException e) {
            System.out.println("Error loading housing data: " + e.getMessage());
        }
        return housingData;
    }
}
