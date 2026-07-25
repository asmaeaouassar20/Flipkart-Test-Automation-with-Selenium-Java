package com.selenium.reusableFunctions;

import com.selenium.pack1.Library;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SeleniumReusable extends Library {
    public SeleniumReusable(WebDriver driver){
        this.driver = driver;
    }

    public void EnterValue(WebElement element, String text){
        element.sendKeys(text);
    }

    public void click(WebElement element){
        element.click();
    }

    public void getTitle(){
        System.out.println(driver.getTitle());
    }


    // Take the screenshot of the testcase
    // Méthode pour prendre et enregistrer une capture d'écran
    public void screenshot(String path){
        TakesScreenshot TS=(TakesScreenshot) driver;
        File source=TS.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(source, new File(path));
        } catch (IOException e) {
            System.out.println("Screenshot not found");
        }
    }


    public void getText(List<WebElement> elementsList){
        List<WebElement> listOfWebElements= elementsList;
        System.out.println("Number of web elements in the page is : "+listOfWebElements.size());

        for(WebElement webElement:listOfWebElements){
            String text = webElement.getText();
            System.out.println(text);
        }
    }

    public void getTextForSpecificValue(WebElement element){
        String text = element.getText();
        System.out.println("Extracted text : " + text);
    }
}
