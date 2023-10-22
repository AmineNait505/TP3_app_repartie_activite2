package activite1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
public class Client {

	public static void main(String[] args) throws IOException, IOException {
        InetAddress serverAddress = InetAddress.getByName("10.26.15.106");
        InetSocketAddress serverSocketAddress = new InetSocketAddress(serverAddress, 1234);

        Socket clientSocket = new Socket();
        clientSocket.connect(serverSocketAddress);

        System.out.println("Connecté au serveur " + serverSocketAddress);	
		clientSocket.close();

	}
	
}