package ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {


        deneme1();

        deneme2();


    }

    private static void deneme1() throws IOException {
        URL whatismyip = new URL("http://checkip.amazonaws.com");
        BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));

        String ip = in.readLine();
        System.out.println(ip);
    }


    private static void deneme2() throws IOException {
        URL whatismyip = new URL("http://myexternalip.com/raw");
        BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));

        String ip = in.readLine();
        System.out.println(ip);
    }


}
