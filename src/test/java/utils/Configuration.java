package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    public String getPropertiesParameters(String prop) throws IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src/test/java/utils/config.properties");
        properties.load(inputStream);
        return properties.getProperty(prop);
    }

}
