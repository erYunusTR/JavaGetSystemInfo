package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test1 {
    public static void main(String[] args) {

        System.out.println(getLocalHost());

    }

    public static String getLocalHost1() {
        InetAddress ip = null;

        try {
            ip = InetAddress.getLocalHost();

        } catch (UnknownHostException ignored) {

        }
        return ip.toString();
    }

    public static String getLocalHost() {
        InetAddress ip = null;
        String LocalHost = "HostName";

        try {
            ip = InetAddress.getLocalHost();

        } catch (UnknownHostException ignored) {

        }
        if (ip.toString()!=null){
            LocalHost=ip.toString();
        }

        return LocalHost;
    }
}
