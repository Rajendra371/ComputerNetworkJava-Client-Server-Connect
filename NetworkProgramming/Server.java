import java.io.*;
import java.net.*;

public class Server
{
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8082))
        {
            System.out.println("listening ....");
            Socket clientSocket = serverSocket.accept();

            DataInputStream dataInp = new DataInputStream(clientSocket.getInputStream());

            String str =(String) dataInp.readUTF();
            System.out.println("message"+str);
            serverSocket.close();


        }
        catch(Exception e){
            System.out.println(e.getMessage());


        }
    }
}