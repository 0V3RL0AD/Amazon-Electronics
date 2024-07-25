package co.uk.amazon.pages;

import co.uk.amazon.commons.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends BasePage{

    public SearchResultsPage(WebDriver Driver){
        DriverManager.Driver = Driver;
        PageFactory.initElements(Driver, this);
    }

    @FindBy(css = ".s-product-image-container")
    private List<WebElement> searchResults;

    public ProductDetailsPage SelectFifthResult(){
        if (searchResults.size() >= 5) {
            WebElement fifthResult = searchResults.get(4);
            fifthResult.click();
        }
        return new ProductDetailsPage(Driver);
    }

}
