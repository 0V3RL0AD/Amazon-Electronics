package co.uk.amazon.hooks;

import co.uk.amazon.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Configuration;

import java.io.IOException;


public class Hooks extends BrowserManager {
    @Before
    public void SetUp(){
        String browser;
        try {
            browser = new Configuration().getPropertiesParameters("browser");
            launchBrowser("browser");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @After
    public void TearDown(){
        //closeBrowser();
    }
}
