package osinfo;

public class Main {
    public static void main(String[] args) {
        String nameOS = "os.name";
        String versionOS = "os.version";
        String architectureOS = "os.arch";
        String javaversion = "java.version";
        String javavmversion = "java.vm.version";
        String javavendor = "java.vendor";
        String javahome = "java.home";
        String username = "user.name";
        String userhome = "user.home";
        String userdir = "user.dir";



        System.out.println("************************");
        System.out.println("The information about OS");
        System.out.println("************************");

        System.out.println("\nName of the OS=" + System.getProperty(nameOS));

        System.out.println("\nVersion of the OS=" + System.getProperty(versionOS));

        System.out.println("\nArchitecture of THe OS=" + System.getProperty(architectureOS));

        System.out.println("\nJava Version=" + System.getProperty(javaversion));

        System.out.println("\nJava VM Version=" + System.getProperty(javavmversion));

        System.out.println("\nJava Vendor=" + System.getProperty(javavendor));

        System.out.println("\nJava Home=" + System.getProperty(javahome));

        System.out.println("\nUser Name=" + System.getProperty(username));

        System.out.println("\nUser Home=" + System.getProperty(userhome));

        System.out.println("\nUser Dir=" + System.getProperty(userdir));
    }
}
