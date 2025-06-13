import java.io.*;  
import java.net.*;

public class TCPClient1 
{
    public static void main(String[] args) throws IOException 
{
        Socket socket = new Socket("localhost", 5000);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String msg;

        while (true) 
       {
            System.out.print("Client: ");
            msg = userInput.readLine();
            output.println(msg);

            if ("exit".equalsIgnoreCase(msg)) break;

            msg = input.readLine();
            System.out.println("Server: " + msg);

            if ("exit".equalsIgnoreCase(msg)) break;
        }
        socket.close();
    }
}
