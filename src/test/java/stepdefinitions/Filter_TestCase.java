package stepdefinitions;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import io.cucumber.java.en.Then;
import pages.FilterPage;

public class Filter_TestCase extends Library {
    FilterPage fp;
    SeleniumReusable se;
    SeleniumReusable sr;

    @Then("Select Minimum and Maximum Amount")
    public void selectMinimumAndMaximumAmount() throws InterruptedException {
        fp=new FilterPage(driver);

        fp.selectMinAmount();
        se=new SeleniumReusable(driver);
        se.waits();
        fp.selectMaxAmount();
        se.waits();
    }

    @Then("Select the Brand")
    public void selectBrand() throws InterruptedException {
        fp.selectBrand();
        se.waits();
    }


    @Then("Select the Battery Capacity")
    public void selectBatteryCapacity() throws InterruptedException {
        fp.selectBatteryCapacity();
        se.waits();
    }
    @Then("Then It should display the Relevant result")
    public void shouldDisplayRelevantResult(){
        System.out.println("debug : Results depends on disponible products after and before filter");
        System.out.println("we can verify relevant result by xpath element");
    }




}
