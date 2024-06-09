package transport.tcp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("localhost", 8888));

        for (int i = 0; i < 1000; i++) {
            socket.getOutputStream().write(("Hello Server " + i).getBytes(StandardCharsets.UTF_8));
        }

        socket.close();
    }
}
