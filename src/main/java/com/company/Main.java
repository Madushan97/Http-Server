package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static com.company.client.ClientRequest.handleClientRequest;

public class Main {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started on port : 8080");

        while (true) {
            try (Socket clientSocket = serverSocket.accept()) {
                handleClientRequest(clientSocket);
            }
        }
    }
}
