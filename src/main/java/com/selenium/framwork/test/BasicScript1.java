package com.selenium.framwork.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicScript1 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500)); //sert à définir un temps d'attente implicite pour Selenium.
        driver.get("https://jilali-talk-frontend-sfrr-one.vercel.app/login?returnUrl=%2Frooms%2Fvoice");

        String title = driver.getTitle();
        System.out.println("title is " + title);

        WebElement email=driver.findElement(By.id("app-input-0"));
        email.sendKeys("jilali@gmail.com");

        WebElement password = driver.findElement(By.id("app-input-1"));
        password.sendKeys("jilali@2026");

        WebElement loginBTN = driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/form/app-button/button"));
        loginBTN.click();
    }
}
