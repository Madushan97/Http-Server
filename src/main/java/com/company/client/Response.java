package com.company.client;

import java.io.IOException;
import java.io.OutputStream;

public class Response {

    public static void sendResponse(OutputStream out, String response) throws IOException {
        out.write(response.getBytes());
        out.flush();
    }
}
