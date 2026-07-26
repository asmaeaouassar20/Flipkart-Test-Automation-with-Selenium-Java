package pages;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterPage extends Library {
    SeleniumReusable se;
    public FilterPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[8]/div[4]/div[1]/select")
    WebElement SelectElmMinAmount;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[8]/div[4]/div[3]/select")
    WebElement SelectElmMaxAmount;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[2]/div[1]/div[2]/div/label/div[1]")
    WebElement BrandElement;


    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[5]/div[1]")
    WebElement BatterySelectElementArrow;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[5]/div[2]/div/div[2]/div/label/div[1]")
    WebElement caseIntervalBatteryCapacity;


    public void selectMinAmount(){
        se = new SeleniumReusable(driver);
        se.scrolldown(SelectElmMinAmount);
        se.selectFromDropdown(SelectElmMinAmount, "10000");
    }

    public void selectMaxAmount(){
        se=new SeleniumReusable(driver);
        se.selectFromDropdown(SelectElmMaxAmount, "20000");
    }

    public void selectBrand(){
        se=new SeleniumReusable(driver);
        se.click(BrandElement);
    }


    public void selectBatteryCapacity(){
        se.scrolldown(BatterySelectElementArrow);
        se.click(BatterySelectElementArrow);
        se.click(caseIntervalBatteryCapacity);
    }
}
