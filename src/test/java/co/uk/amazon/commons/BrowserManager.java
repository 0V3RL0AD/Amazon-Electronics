package co.uk.amazon.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager{
    WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    WebDriver initFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();

    }

    WebDriver initHeadlessChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable gpu", "--headless");
        return new ChromeDriver(options);
    }

    public void launchBrowser (String Browser){
        switch(Browser)
        {
            case "Chrome":
                Driver = initChromeDriver();
                break;
            case "Firefox":
                Driver = initFirefoxDriver();
                break;
            case  "Headless":
                Driver = initHeadlessChrome();
                break;

            default:
                Driver = initChromeDriver();
                break;
        }
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        Driver.manage().deleteAllCookies();
        Driver.quit();
    }
}
