import java.net.*; import java.io.*;
public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        String msg;
        while (!(msg = cin.readLine()).equals("exit")) {
            out.println(msg);
            System.out.println("Server: " + in.readLine());
        }
        s.close();
    }
}
