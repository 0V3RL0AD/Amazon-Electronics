package co.uk.amazon.hooks;

import co.uk.amazon.commons.BrowserManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BrowserManager {
    @Before
    public void SetUp(){
        launchBrowser("Chrome");
    }

    @After
    public void TearDown(){
        //closeBrowser();
    }
}
