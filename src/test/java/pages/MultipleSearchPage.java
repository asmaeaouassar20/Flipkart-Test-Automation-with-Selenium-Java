package pages;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultipleSearchPage extends Library {
    SeleniumReusable se;
    public MultipleSearchPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/header/div[1]/div[1]/form/div/div/input")
    WebElement SearchField;

    public void enterSearch(String searchText){
        se=new SeleniumReusable(driver);
        se.enterValue(SearchField, searchText);
    }
    public void clickSearch(){
        SearchField.sendKeys(Keys.ENTER);
    }

}
