import java.net.*; import java.io.*;
public class Server {
    public static void main(String[] args) throws Exception {
        Socket s = new ServerSocket(1234).accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while (!(msg = in.readLine()).equals("exit")) {
            System.out.println("Client: " + msg);
            out.println(cin.readLine());
        }
        s.close();
    }
}
