import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class RestAPIclient {

    public static void main(String[] args) {
        try {
            // --- Step 1: Choose a public REST API (Open-Meteo) ---
            double latitude = 12.97;   // Bengaluru
            double longitude = 77.59;

            String apiUrl = String.format(
                "https://api.open-meteo.com/v1/forecast?latitude=%.2f&longitude=%.2f&current_weather=true",
                latitude, longitude
            );

            // --- Step 2: Establish HTTP Connection ---
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            // --- Step 3: Check Response Code ---
            int responseCode = conn.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("Failed: HTTP error code : " + responseCode);
            }

            // --- Step 4: Read API Response ---
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                response.append(output);
            }
            conn.disconnect();

            // --- Step 5: Parse JSON using org.json ---
            JSONObject jsonObj = new JSONObject(response.toString());
            JSONObject currentWeather = jsonObj.getJSONObject("current_weather");

            double temperature = currentWeather.getDouble("temperature");
            double windspeed = currentWeather.getDouble("windspeed");
            String time = currentWeather.getString("time");

            // --- Data is available in variables ---
            // temperature, windspeed, time

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
