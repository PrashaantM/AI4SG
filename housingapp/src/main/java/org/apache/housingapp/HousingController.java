package org.apache.housingapp;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/housing")
public class HousingController {

    @PostMapping("/search")
    public HousingResponse searchHousing(@RequestBody UserProfile profile) {
        List<Housing> housingData = HousingFinder.getHousingData("housing_data.csv");
        List<Housing> filteredHousing = HousingFilter.filterHousingOptions(profile, housingData);

        // Return the filtered housing as a response
        return new HousingResponse(filteredHousing);
    }

    @PostMapping("/translate")
    public String translate(@RequestBody TranslationRequest translationRequest) throws Exception {
        return DeepLTranslator.translate(
                translationRequest.getText(),
                translationRequest.getSourceLang(),
                translationRequest.getTargetLang());
    }
}
