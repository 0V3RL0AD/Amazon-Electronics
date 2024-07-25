package co.uk.amazon.pages;

import co.uk.amazon.commons.DriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartWagonPage extends BasePage{
    public SmartWagonPage(WebDriver Driver){
        DriverManager.Driver = Driver;
        PageFactory.initElements(Driver, this);
    }

    @FindBy(id = "sw-gtc")
    private WebElement CartButton;
    public CartPage GoToCart(){
        CartButton.click();
        return new CartPage(Driver);
    }


}
