import java.io.*; 
import java.net.*;

public class TCPServer1 
{
    public static void main(String[] args) throws IOException 
{
        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String msg;

        while (true) 
       {
            msg = in.readLine();
            if (msg.equalsIgnoreCase("exit")) break;

            System.out.println("Client: " + msg);
            System.out.print("Server: ");

            msg = kb.readLine();
            out.println(msg);

            if (msg.equalsIgnoreCase("exit")) break;
        }
        socket.close(); 
        server.close();
    }
}
