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

    @FindBy(id = "searchDropdownBox")
    private WebElement DropdownBox;
    public void DropDown(String string){
        SelectByText(DropdownBox,string);
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement SearchBox;
    public void SearchBar(){
        SearchBox.sendKeys("Samsung");
    }

    @FindBy(id = "nav-search-submit-button")
    private WebElement SearchButton;

    public SearchResultsPage Search(){
        SearchButton.click();
        return new SearchResultsPage(Driver);
    }

    @FindBy (id = "sp-cc-accept")
    private WebElement AcceptCookies;

    public void ClickCookies(){
        AcceptCookies.click();
    }


}
