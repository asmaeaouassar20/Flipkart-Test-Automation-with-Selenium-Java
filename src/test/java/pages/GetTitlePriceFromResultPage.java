package pages;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetTitlePriceFromResultPage extends Library {

    SeleniumReusable se;

    public GetTitlePriceFromResultPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "q")
    WebElement SearchInput;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div[2]/div/div/div/div/div/header/div[1]/div[1]/form/div/button")
    WebElement BtnSearchIcon;

    @FindBy(xpath = "/html/body/div[5]/div/span")
    WebElement BtnClosePopUp;

    public void closePopUpBtn(){
        se=new SeleniumReusable(driver);
        se.click(BtnClosePopUp);
    }

    public void enterSearch(String searchText){
        se.enterValue(SearchInput,searchText);
    }

    public void clickSearchBtnIcon(){
        se.click(BtnSearchIcon);
    }
}
