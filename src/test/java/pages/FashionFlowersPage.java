package pages;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionFlowersPage extends Library {
    SeleniumReusable se;


    public FashionFlowersPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[5]/div/span")
    WebElement BtnClosePopUp;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/a")
    WebElement FashionLink;

    @FindBy(xpath = "//*[@id=\"slot-list-container\"]/div/div[2]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div/div/a")
    WebElement TrendsLink;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div[1]/div/header/div[2]/div[1]/form/div/div/input")
    WebElement InputSearchBar;

    public void closePopUp(){
        se=new SeleniumReusable(driver);
        se.click(BtnClosePopUp);
    }
    public void clickFashionLink(){
        se.click(FashionLink);
    }
    public void clickTrendsLink(){
        se.click(TrendsLink);
    }
    public void clickSearchBar(){
        se.click(InputSearchBar);
    }
    public void searchFlowersKeyWord(){
        se.enterValue(InputSearchBar, "Flowers");
        InputSearchBar.sendKeys(Keys.ENTER);
    }
}
