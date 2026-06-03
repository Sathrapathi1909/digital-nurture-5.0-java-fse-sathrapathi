import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket("localhost", 5000);

            DataInputStream input =
                    new DataInputStream(socket.getInputStream());

            DataOutputStream output =
                    new DataOutputStream(socket.getOutputStream());

            output.writeUTF("Hello Server");

            String serverMessage = input.readUTF();

            System.out.println("Server: " + serverMessage);

            input.close();
            output.close();
            socket.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}