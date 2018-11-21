package test;

public class test2 {
    public static void main(String[] args) {
        System.out.println(getOsInfo());

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
}
