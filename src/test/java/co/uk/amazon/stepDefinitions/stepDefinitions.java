package co.uk.amazon.stepDefinitions;

import co.uk.amazon.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class stepDefinitions extends BasePage {
    HomePage homePage = PageFactory.initElements(Driver, HomePage.class);
    SearchResultsPage searchResultsPage = PageFactory.initElements(Driver, SearchResultsPage.class);
    ProductDetailsPage productDetailsPage = PageFactory.initElements(Driver, ProductDetailsPage.class);
    SmartWagonPage smartWagonPage = PageFactory.initElements(Driver, SmartWagonPage.class);
    CartPage cartPage = PageFactory.initElements(Driver, CartPage.class);

    @Given("I navigate to Amazon homepage")
    public void i_navigate_to_amazon_homepage() {
        launchURL();
        homePage.ClickCookies();
    }

    @When("I enter Samsung into the search field")
    public void iEnterSamsungIntoTheSearchField() {
        homePage.SearchBar();
    }

    @And("I change the department to {string}")
    public void iChangeTheDepartmentTo(String string) {
        homePage.DropDown(string);
        homePage.Search();
    }

    @When("I choose the 5th Search Result")
    public void i_choose_the_5th_search_result() {
        searchResultsPage.SelectFifthResult();
    }

    @When("I add the product to the basket")
    public void i_add_the_product_to_the_basket() {
        productDetailsPage.AddToCart();
    }

    @Then("I should see the product in the basket")
    public void i_should_see_the_product_in_the_basket() {
        smartWagonPage.GoToCart();
    }



}
