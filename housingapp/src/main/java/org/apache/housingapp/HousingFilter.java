package org.apache.housingapp;

import java.util.ArrayList;
import java.util.List;

public class HousingFilter {
    public static List<Housing> filterHousingOptions(UserProfile profile, List<Housing> housingData) {
        List<Housing> filteredHousing = new ArrayList<>();
        for (Housing house : housingData) {
            boolean matchesPrice = house.getPrice() <= profile.getIncome() * 0.3;
            boolean matchesLocation = house.getLocation().toLowerCase()
                    .contains(profile.getPreferredLocation().toLowerCase());
            boolean matchesProximity = profile.getProximityPreferences().stream().allMatch(
                    service -> house.getProximityServices().stream().anyMatch(s -> s.contains(service.trim())));
            boolean matchesAvailability = house.isAvailable();

            if (matchesPrice && matchesLocation && matchesProximity && matchesAvailability) {
                filteredHousing.add(house);
            }
        }
        return filteredHousing;
    }
}
