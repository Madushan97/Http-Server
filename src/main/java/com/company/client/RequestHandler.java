package com.company.client;

import com.company.models.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RequestHandler {

    public static String handleGetRequest() throws JsonProcessingException {
        try {
            Student student = new Student();

            // Convert the student object to JSON using Jackson
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonResponse = objectMapper.writeValueAsString(student);

            // Create the HTTP response with the JSON content
            String response = "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: application/json\r\n" +
                    "Content-Length: " + jsonResponse.length() + "\r\n\r\n" +
                    jsonResponse;

            return response;
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
