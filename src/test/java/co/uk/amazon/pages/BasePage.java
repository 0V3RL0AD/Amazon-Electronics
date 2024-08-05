package co.uk.amazon.pages;

import co.uk.amazon.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Configuration;
import utils.Environment;

import java.io.IOException;

public class BasePage extends DriverManager {
    public String BASE_URL;
    private org.openqa.selenium.support.ui.Select Select;

    private String URL(){
        try {
            if (new Environment().specifiedEnvironment() == null)
            {
                BASE_URL = new Configuration().getPropertiesParameters("prodUrl");

            } else
            {
                BASE_URL = new Environment().specifiedEnvironment();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return BASE_URL;
    }

    public void launchURL(){
        Driver.navigate().to(URL());
    }

    public void SelectByText(WebElement element, String text){
        Select = new Select(element);
        Select.selectByVisibleText(text);
    }

    public void SelectByValue(WebElement element, String value){
        Select = new Select(element);
        Select.selectByValue(value);
    }


}
