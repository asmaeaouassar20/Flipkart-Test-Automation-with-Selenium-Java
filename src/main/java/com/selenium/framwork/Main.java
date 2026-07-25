package com.selenium.framwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vestracar.ma/login");

        String title = driver.getTitle();
        System.out.println("title is " + title);

        WebElement email=driver.findElement(By.id("mat-input-2"));
        email.sendKeys("ensafiennesthree@gmail.com");

        WebElement password = driver.findElement(By.id("mat-input-3"));
        password.sendKeys("Insaf@123");

        WebElement loginBTN = driver.findElement(By.xpath("/html/body/app-root/div/main/app-login/div/div/form/div[1]/button"));
        loginBTN.click();
    }
}