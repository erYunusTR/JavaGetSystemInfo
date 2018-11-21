package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class test3 {
    public static void main(String[] args) {
        System.out.println(getExtIp());
    }

    private static String getExtIp() {
        String ip = null;
        String ipx = "NoInternetConnection";
        try {
            URL whatismyip = new URL("http://myexternalip.com/raw");
            BufferedReader in = new BufferedReader(new InputStreamReader(whatismyip.openStream()));
            ip = in.readLine();
        } catch (IOException ignored) {

        }
        if (ip != null) {
            ipx = ip;
        }
        return ipx;
    }
}
