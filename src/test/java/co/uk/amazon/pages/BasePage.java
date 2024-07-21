package co.uk.amazon.pages;

import co.uk.amazon.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager {
    public String BASE_URL = "https://www.amazon.co.uk";
    private org.openqa.selenium.support.ui.Select Select;

    public void launchURL(){
        Driver.navigate().to(BASE_URL);
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
