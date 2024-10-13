package com.mycompany.tcpserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws Exception {
        ServerSocket ourFirstSocket = new ServerSocket(6789);
        while (true) {
            Socket connectionSocket = ourFirstSocket.accept();
            BufferedReader messageFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            String clientSentence = messageFromClient.readLine();
            System.out.println("message=" + clientSentence);
        }
    }
}
