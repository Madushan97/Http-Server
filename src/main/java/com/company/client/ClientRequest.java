package com.company.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import static com.company.client.RequestHandler.*;
import static com.company.client.Response.sendResponse;

public class ClientRequest {

    public static void handleClientRequest(Socket clientSocket) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        OutputStream out = clientSocket.getOutputStream();

        String requestLine = in.readLine();
        if (requestLine == null) {
            return;
        }

        System.out.println("Received request : " + requestLine);

        String[] token = requestLine.split(" ");
        String method = token[0];
        String response = "";

        switch (method) {
            case "GET":
                response = handleGetRequest();
                break;
            case "POST":
                response = handlePostRequest();
                break;
            case "PUT":
                response = handlePutRequest();
                break;
            case "DELETE":
                response = handleDeleteRequest();
                break;
        }

        sendResponse(out, response);
        clientSocket.close();
    }
}
