package main.java.com.anisa;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
public class App1 {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("config.properties")) {
            Properties prop = new Properties();
            // set the properties value
            System.setProperty("config.properties", "UTF-8");
            prop.setProperty("db.url", "localhost");
            prop.setProperty("db.user", "سلام");
            prop.setProperty("db.password", "password");
            // save properties to project root folder
            prop.store(output, null);
            System.out.println(prop);
        } catch (IOException io) {
            io.printStackTrace();
        }

    }
}
