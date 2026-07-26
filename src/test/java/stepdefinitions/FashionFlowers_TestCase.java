package stepdefinitions;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FashionFlowersPage;

public class FashionFlowers_TestCase extends Library {
    FashionFlowersPage fp;
    SeleniumReusable se;

    @Given("User to move the Fashion link")
    public void user_to_move_the_fashion_link() {
        fp=new FashionFlowersPage(driver);
        se=new SeleniumReusable(driver);
        fp.closePopUp();
        System.out.println("debug : click on fashion link");
        se.getTitle();
        fp.clickFashionLink();
    }
    @When("Cursor to move to the Trends link")
    public void cursor_to_move_to_the_trends_link() {
        System.out.println("debug : click on Trends link");
        fp.clickTrendsLink();
    }
    @When("Click On Search bar")
    public void click_on_search_bar() {
        System.out.println("debug : click on search bar");
        fp.clickSearchBar();
    }
    @When("Search For Flowers Key word")
    public void search_for_flowers_key_word() {
        System.out.println("debug : search for Flowers key word");
        fp.searchFlowersKeyWord();
    }
    @Then("It should display page title")
    public void it_should_display_page_title() {
        System.out.println("debug : display results");
        se.getTitle();
    }


}
