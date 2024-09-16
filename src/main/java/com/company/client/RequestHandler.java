package com.company.client;

import com.company.models.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class RequestHandler {

    public static String handleGetRequest() throws JsonProcessingException {
        try {
            Student student = new Student();
            ObjectMapper objectMapper = new ObjectMapper();

            InputStream inputStream = RequestHandler.class.getClassLoader().getResourceAsStream("data.json");
            if (inputStream != null) {
                byte[] jsonData = inputStream.readAllBytes();
                String jsonResponse = new String(jsonData, StandardCharsets.UTF_8);

                // Create the HTTP response with the JSON content
                String response = "HTTP/1.1 200 OK\r\n" +
                        "Content-Type: application/json\r\n" +
                        "Content-Length: " + jsonResponse.length() + "\r\n\r\n" +
                        jsonResponse;

                return response;

            } else {
                throw new FileNotFoundException("File not found in resources: data.json");
            }


        } catch (Exception e) {
            e.printStackTrace();
            return "HTTP/1.1 500 Internal Server Error\r\n\r\n";
        }
    }

    public static String handlePostRequest() {
        return null;

    }

    public static String handlePutRequest() {
        return null;

    }

    public static String handleDeleteRequest() {
        return null;

    }
}
