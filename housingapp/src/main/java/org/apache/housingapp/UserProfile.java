package org.apache.housingapp;

import java.util.List;

public class UserProfile {
    private String name;
    private double income;
    private int familySize;
    private String preferredLocation;
    private List<String> proximityPreferences;
    private String language;

    // Constructor
    public UserProfile(String name, double income, int familySize, String preferredLocation,
            List<String> proximityPreferences, String language) {
        this.name = name;
        this.income = income;
        this.familySize = familySize;
        this.preferredLocation = preferredLocation;
        this.proximityPreferences = proximityPreferences;
        this.language = language;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }

    public String getPreferredLocation() {
        return preferredLocation;
    }

    public void setPreferredLocation(String preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public List<String> getProximityPreferences() {
        return proximityPreferences;
    }

    public void setProximityPreferences(List<String> proximityPreferences) {
        this.proximityPreferences = proximityPreferences;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
