package stepdefinitions;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MultipleSearchPage;

public class MultipleSearch_TestCase extends Library {

    MultipleSearchPage msp;


    @Given("Enter the {string} in the search field")
    public void enter_the_in_the_search_field(String searchText) {
        msp=new MultipleSearchPage(driver);
        msp.enterSearch(searchText);
    }
    @When("click the search button")
    public void click_the_search_button() {
        msp.clickSearch();
    }
    @Then("It should navigate to the next page and display the corresponding page")
    public void it_should_navigate_to_the_next_page_and_display_the_corresponding_page() {
        SeleniumReusable se=new SeleniumReusable(driver);
        se.getTitle();
    }
}
