package utils;

import java.io.IOException;

public class Environment {
    String environment = System.getProperty("environment");
    String runEnvironment;

    public String specifiedEnvironment() throws IOException {
        if (!(environment == null))
        {
            switch (environment){
                case "prod":
                    runEnvironment = new Configuration().getPropertiesParameters("prodUrl");
                    break;
                case "test":
                    runEnvironment = new Configuration().getPropertiesParameters("testUrl");
                    break;
                case "uat":
                    runEnvironment = new Configuration().getPropertiesParameters("uatUrl");
                    break;
            }
        }
        return runEnvironment;
    }
}
