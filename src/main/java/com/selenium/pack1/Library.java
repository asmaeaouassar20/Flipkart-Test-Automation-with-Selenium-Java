package com.selenium.pack1;

import io.github.bonigarcia.wdm.WebDriverManager; //pour gérer automatiquement les drivers des navigateurs
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream; // pour lir eun fichier
import java.io.IOException;
import java.time.Duration;
import java.util.Properties; // pour manipuler un fichier de propriétés

public class Library {
    public static WebDriver driver; // variable statique qui contiendra le navigateur
    public static Properties properties; // variable statique contenant les propriétés du fichier de configuration


    // méthode sui lance l'application
    public void launchapplication() throws IOException {

        // ouvrir le fichier de configuration Config.Property
        FileInputStream input = new FileInputStream("src/test/resources/Properties/Config.Property");

        properties=new Properties();
        properties.load(input); // chargement du contenu du fichier dans l'objet Properties

        if(properties.getProperty("browser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup(); // Télécharger et configurer automatiquement ChromeDriver
            driver=new ChromeDriver(); // Lancer Google Chrome
        }else if(properties.getProperty("browser").equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }

        driver.manage().window().maximize();  // Agrandir la fenêtre du navigateur
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20)); // définir une attente implicite de 20seconds

        driver.get(properties.getProperty("url")); // ouvrir l'url définie dans le fichier de config
    }



    // méthode pour fermer le navigateur
    public void down(){
        driver.close();
    }

}
