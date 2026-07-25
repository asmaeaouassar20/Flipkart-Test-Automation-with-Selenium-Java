package stepdefinitions;

public class SearchMobile_TestCase {
    @Given("Launch the Flipkart Application")
    public void launchApplication() {
        // Code to open browser and Flipkart URL
    }

    @When("Close the popup")
    public void closePopup() {
        // Code to close popup
    }

    @Then("It should Navigate to the Home page")
    public void verifyHomePage() {
        // Code to verify home page
    }

    @Given("User enter the Text in the Search field")
    public void enterSearchText() {
        // Code to enter search text
    }

    @When("Click the search button")
    public void clickSearchButton() {
        // Code to click search button
    }

    @Then("It should navigate to the search result page and display the relevent details")
    public void verifySearchResult() {
        // Code to verify results
    }
}
