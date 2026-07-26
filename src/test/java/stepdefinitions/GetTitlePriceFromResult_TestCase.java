package stepdefinitions;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GetTitlePriceFromResultPage;

import java.util.List;

public class GetTitlePriceFromResult_TestCase extends Library {

    SeleniumReusable se ;
    GetTitlePriceFromResultPage getTP;

    @Given("Enter the search text in the search field")
    public void enter_the_search_text_in_the_search_field() {
        getTP = new GetTitlePriceFromResultPage(driver);
        getTP.closePopUpBtn();
        getTP.enterSearch("Shirts");
    }
    @When("Click the search icon")
    public void click_the_search_icon() {
        getTP.clickSearchBtnIcon();
    }
    @Then("It should display the search result and get the title and price")
    public void it_should_display_the_search_result_and_get_the_title_and_price() {
        System.out.println("---  Result of searching : Shirt  ---");
        se = new SeleniumReusable(driver);

        WebElement titleElement = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div[3]/div/div/a[1]"));
        WebElement priceElement = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div[3]/div/div/a[2]/div/div[1]"));

        System.out.println(" > Title is : ");
        se.getTextForSpecificValue(titleElement);

        System.out.println(" > Price is : ");
        se.getTextForSpecificValue(priceElement);
    }

}
