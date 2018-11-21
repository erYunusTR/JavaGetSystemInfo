package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

@SuppressWarnings("ALL")
public class test4 {
    public static void main(String[] args) {
        System.out.println(getOsInfo() + "/Host:" + getLocalHost() + "/ExtIP:" + getExtIp());

    }

    public static String getLocalHost() {
        InetAddress ip = null;
        String LocalHost = "HostName";

        try {
            ip = InetAddress.getLocalHost();

        } catch (UnknownHostException ignored) {

        }
        if (ip.toString() != null) {
            LocalHost = ip.toString();
        }

        return LocalHost;
    }

    public static String getOsInfo() {
        String nameOS = "os.name";
        String versionOS = "os.version";
        String architectureOS = "os.arch";
        String javaversion = "java.version";
        String javavendor = "java.vendor";


        String OsInf = null;
        try {
            OsInf = "OS:" + System.getProperty(nameOS) + "/OsVersion:" + System.getProperty(versionOS) + "/OsArch:" + System.getProperty(architectureOS) + "/JavaVer:" + System.getProperty(javaversion) + "/JavaVendor:" + System.getProperty(javavendor);
        } catch (Exception ignored) {

        }
        return OsInf;
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
