package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static com.company.client.ClientRequest.handleClientRequest;

public class Main {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("Server started on port : 9090");

        while (true) {
            try (Socket clientSocket = serverSocket.accept()) {
                handleClientRequest(clientSocket);
            }
        }
    }
}
