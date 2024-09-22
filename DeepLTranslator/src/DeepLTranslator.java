import org.json.JSONObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeepLTranslator {
    private static final String API_KEY = "464cea02-09fd-4dd0-8a45-4959ad37f176:fx";
    private static final String API_URL = "https://api-free.deepl.com/v2/translate";

    public static String translate(String text, String sourceLang, String targetLang) throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", "DeepL-Auth-Key " + API_KEY);
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoOutput(true);

        String requestBody = String.format("text=%s&source_lang=%s&target_lang=%s", text, sourceLang, targetLang);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = requestBody.getBytes("utf-8");
            os.write(input, 0, input.length);
        }

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject jsonResponse = new JSONObject(response.toString());
            return jsonResponse.getJSONArray("translations").getJSONObject(0).getString("text");
        } else {
            throw new RuntimeException("Failed : HTTP error code : " + responseCode);
        }
    }
}
