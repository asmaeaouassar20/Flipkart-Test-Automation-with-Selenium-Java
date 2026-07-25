package com.selenium.framwork.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500)); //sert à définir un temps d'attente implicite pour Selenium.
        driver.get("https://admin-demo.nopcommerce.com/login");

        String title = driver.getTitle();
        System.out.println("title is : " + title);

        WebElement email=driver.findElement(By.id("Email"));
        email.clear();
        email.sendKeys("admin@yourstore.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("admin");

        WebElement loginBTN = driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button"));
        String textInLoginBTN = loginBTN.getText();
        System.out.println("Text of login button : "+ textInLoginBTN);
        loginBTN.click();

        driver.close();
        driver.quit();
    }
}
