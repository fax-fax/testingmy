package com.company;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static final int SERVER_PORT = 50001;

    public static void main (String[] args) {
        System.out.println("SocketServer Start/RU: Старт");
        try {
            ServerSocket server = new ServerSocket(SERVER_PORT);
            Socket clientConn = server.accept();
            DataOutputStream serverOutput = new DataOutputStream(clientConn.getOutputStream());
            serverOutput.writeBytes("Java revisited\n");
            clientConn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}