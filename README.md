*COMPANY:* CODTECH IT SOLUTIONS

*NAME:* SUDHARSAN R

*INTERN ID:* CT06DY2993

*DOMAIN:* JAVA PROGRAMMMING

*DURATION:* 6 WEEKS

*MENTOR:* NEELA SANTHOSH

# REST API Client in Java

## Objective
To develop a Java application that fetches and processes current weather data from a public REST API (Open-Meteo), demonstrating HTTP requests and JSON parsing.

## Features
- Connects to the **Open-Meteo API** to fetch current weather data.
- Parses JSON response using the **org.json** library.
- Retrieves specific weather details:
  - Temperature
  - Wind speed
  - Timestamp of the weather report
- Designed for easy integration into larger Java applications.

## Implementation Details
1. **HTTP GET Request**  
   - Establishes an HTTP connection to the API endpoint.
   - Configures request headers and checks for successful response codes.

2. **Reading Response**  
   - Uses `BufferedReader` to read API response line by line.
   - Aggregates response into a single string.

3. **JSON Parsing**  
   - Utilizes `org.json.JSONObject` to parse JSON.
   - Extracts relevant fields like temperature, wind speed, and time.

4. **Error Handling**  
   - Handles `IOException` and other runtime exceptions for robust execution.

## Usage
- Include `org.json` library in your project.
- Set the desired latitude and longitude for your location.
- Run the program to fetch and process current weather data.
- Variables `temperature`, `windspeed`, and `time` can be used programmatically for further processing.

## Use Case
This utility is ideal for Java developers who want to:
- Learn REST API integration.
- Parse JSON data in Java.
- Build weather-related or real-time data applications.


