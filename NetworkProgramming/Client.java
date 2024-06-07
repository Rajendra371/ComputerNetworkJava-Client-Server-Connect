import java.io.*;
import java.net.*;

public class Client
{
    public static void main(String[] args) {
        try(Socket s = new Socket("127.0.0.1",8082))
        {
            
            DataOutputStream dataOut = new DataOutputStream(s.getOutputStream());

            dataOut.writeUTF("Hello Echo server from client side");
            dataOut.close();
            dataOut.flush();
             s.close();
         


        }
        catch(Exception e){
            System.out.println(e.getMessage());


        }
    }
}