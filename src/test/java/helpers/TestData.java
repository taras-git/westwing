package helpers;

import app.helpers.UserData;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class TestData {

    public static UserData getCredentials(){
        Properties properties = getProps();
        String login = properties.getProperty("user.login");
        String pass = properties.getProperty("user.password");
        return new UserData(login, pass);
    }

    private static Logger getLogger() {
        Logger logger = LogManager.getLogger("");
        DOMConfigurator.configure("src/main/resources/log4j.xml");
        return logger;
    }

    private static Properties getProps(){
        Properties prop = new Properties();
        Logger logger = getLogger();

        try (InputStream input = ClassLoader.getSystemResourceAsStream("testcase.properties")) {
            if (input == null) {
                logger.error("Sorry, unable to find testcase.properties");
                return prop;
            }
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
}
