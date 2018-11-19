package carServer.Utils;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;

public class ServerSocketFactory {
    private static int port;

    static {
        Properties properties = new Properties();
        try {
            properties.load(ServerSocketFactory.class.getResourceAsStream("socketinfo.properties"));
            port = Integer.valueOf(properties.getProperty("port"));
            System.out.println("port:"+port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ServerSocket getSocket() throws IOException {
        return new ServerSocket(port);
    }
}
