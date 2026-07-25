package pages;

import com.selenium.pack1.Library;
import com.selenium.reusableFunctions.SeleniumReusable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Library {
    SeleniumReusable se;

    public SearchPage(WebDriver driver){
        // initialiser le driver
        this.driver=driver;

        // initialiser les éléments de la page
        PageFactory.initElements(driver, this);
    }


    // Localiser le champ de recherche
    @FindBy(xpath = "//input[@name='q']")
    WebElement Searchtext;

    // localiser l'élément de la page d'accueil
    @FindBy(xpath = "//html[@lang='en-IN']")
    WebElement Homepage;

    // localiser l'élément <html> ayant la classe "fonts-Loaded"
    @FindBy(xpath = "//html[@class='fonts-loaded']")
    WebElement SearchResult;


    // méthode pour saisir un text
    public void search(String text){
        se = new SeleniumReusable(driver);
        se.EnterValue(Searchtext,text);
    }


    // méthode pour lancer la recherche (avec la touche Enter)
    public void clickSearch(){
        Searchtext.sendKeys(Keys.ENTER);
    }

    // Méthode pour vérifier l'affichage de la page d'accueil
    public void homeScreen(){
        System.out.println("is home screen displayed : "+Homepage.isDisplayed());
    }

    public void result(){
        System.out.println("is result displayed : " + SearchResult.isDisplayed());
        System.out.println("Title of page result : "+driver.getTitle());
    }


}
