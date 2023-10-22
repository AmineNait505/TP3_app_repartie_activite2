package activite1;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread{

	private static int numClient=0;

	public static void main(String[] args) {
		new Server().start();
	}
	@Override	
	public void run() {
		
		try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Le serveur est en écoute sur le port 1234");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread clientThread = new Thread(new ClientProcess(clientSocket,++numClient));
                clientThread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        	}
    	}
	}

class ClientProcess extends Thread {
    Socket clientSocket;
    private int numClient;

    public ClientProcess(Socket clientSocket, int numClient) {
        this.clientSocket = clientSocket;
        this.numClient = numClient;
    }
    @Override
    public void run() {
        try {
            System.out.println("Le client numéro "+numClient +" est connecté !");
            System.out.println("Nouvelle connexion entrante depuis " + clientSocket.getRemoteSocketAddress());
            (new PrintWriter(clientSocket.getOutputStream(),true)).println("Bien, Vous etes le client numero : "+numClient);
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}