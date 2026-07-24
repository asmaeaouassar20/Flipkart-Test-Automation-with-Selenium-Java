package com.selenium.framwork.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        // Télécharge et configure ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Lance Chrome
        WebDriver driver = new ChromeDriver();

        // Ouvre une page
        driver.get("https://www.google.com");

        // Affiche le titre de la page
        System.out.println("Titre : " + driver.getTitle());

        // Ferme le navigateur
        driver.quit();
    }
}
