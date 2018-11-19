package com.client.util;

import java.io.IOException;
import java.net.Socket;
import java.util.Properties;

public class SocketFactory {
    private static String ip;
    private static int port;

    static {
        Properties properties = new Properties();
        try {
            properties.load(SocketFactory.class.getResourceAsStream("socketinfo.properties"));
            ip = properties.getProperty("ip");
            port = Integer.valueOf(properties.getProperty("port"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Socket getSocket() throws IOException {
        return new Socket(ip, port);
    }
}
