package co.uk.amazon.pages;

import co.uk.amazon.commons.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage{

    public ProductDetailsPage(WebDriver Driver){
        DriverManager.Driver = Driver;
        PageFactory.initElements(Driver, this);
    }

    @FindBy(id = "add-to-cart-button")
    private WebElement AddToCartButton;
    public SmartWagonPage AddToCart(){
        AddToCartButton.click();
        return new SmartWagonPage(Driver);
    }



}
