package co.uk.amazon.pages;

import co.uk.amazon.commons.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver Driver){
        DriverManager.Driver = Driver;
        PageFactory.initElements(Driver, this);
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement SearchBox;

    public void SearchBar(){
        SearchBox.sendKeys("Samsung");
    }
}
