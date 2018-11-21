package hostname;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip;
        String hostname;


            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);

            System.out.println("Your current Hostname : " + hostname);


    }
}
