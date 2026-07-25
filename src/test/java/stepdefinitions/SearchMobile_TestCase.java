package stepdefinitions;

import com.selenium.pack1.Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

import java.io.IOException;

public class SearchMobile_TestCase extends Library {
    SearchPage sp;
    @Given("Launch the Flipkart Application")
    public void launchFlipkartApplication() throws IOException {
        // Code to open browser and Flipkart URL
        launchapplication();
    }

    @When("Close the popup")
    public void closePopup() {
        // Code to close popup
        System.out.println("debug : close popup");
    }

    @Then("It should Navigate to the Home page")
    public void verifyHomePage() {
        // Code to verify home page
        sp=new SearchPage(driver);
        sp.homeScreen();
    }

    @Given("User enter the Text in the Search field")
    public void enterSearchText() {
        // Code to enter search text
        sp.search("Mobile");
    }

    @When("Click the search button")
    public void clickSearchButton() {
        // Code to click search button
        sp.clickSearch();
    }

    @Then("It should navigate to the search result page and display the relevent details")
    public void verifySearchResult() {
        // Code to verify results
    }
}
