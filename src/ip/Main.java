package ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws IOException {


        deneme1();

        deneme2();

        System.out.println(getComputername());

        System.out.println(getIpAdress());
    }

    private static void deneme1() throws IOException {
        String ip = null;
        try {
            URL whatismyip = new URL("http://checkip.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
            ip = in.readLine();
        } catch (IOException ignored) {

        }

        System.out.println(ip);  //internet yoksa null dönüyo
    }


    private static void deneme2() throws IOException {
        String ip = null;
        try {
            URL whatismyip = new URL("http://myexternalip.com/raw");
            BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
            ip = in.readLine();
        } catch (IOException ignored) {

        }

        System.out.println(ip);   //internet yoksa null dönüyo
    }

    public static String getComputername() throws UnknownHostException {

        return InetAddress.getLocalHost().getHostName();
    }


    public static String getIpAdress() throws UnknownHostException {

        return InetAddress.getLocalHost().getHostAddress();
    }

}
