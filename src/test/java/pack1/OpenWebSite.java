package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebSite {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

        String url = driver.getCurrentUrl();
        String title = driver.getTitle();

        System.out.println("Current URL is : "+url);
        System.out.println("Title is : "+title);

    }
}
