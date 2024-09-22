package org.apache.housingapp;

import java.util.List;

public class HousingResponse {
    private List<Housing> filteredHousing;

    // Constructor
    public HousingResponse(List<Housing> filteredHousing) {
        this.filteredHousing = filteredHousing;
    }

    // Getters and Setters
    public List<Housing> getFilteredHousing() {
        return filteredHousing;
    }

    public void setFilteredHousing(List<Housing> filteredHousing) {
        this.filteredHousing = filteredHousing;
    }
}
