<hr/>

# Selenium Automation Testing – Flipkart

Projet d'automatisation des tests fonctionnels de **Flipkart** développé avec **Java, Selenium WebDriver, Cucumber (BDD), JUnit** et **Extent Reports**.

Le projet couvre plusieurs scénarios de test, notamment :

* Recherche de produits par mot-clé.
* Filtrage des résultats.
* Extraction du titre et du prix d'un produit spécifique.
* Exécution de scénarios avec **Scenario Outline**.
* Génération de rapports HTML avec **Extent Reports**.
* Capture automatique de captures d'écran en cas d'exécution des tests.

Ce projet met en œuvre le **Page Object Model (POM)** afin d'améliorer la maintenabilité, la lisibilité et la réutilisabilité du code de test.

<hr/>
<br/><br/><br/><br/>

# flipkart
link : <a href="https://www.flipkart.com/" >flipkart</a>

#  Selenium Java Dependency
Add selenium Java Dependency in pom.xml.  
Link : <a href="https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.43.0"> Selenium Java Dependency</a>  

**Selenium Java** : bibliothèque qui permet à un programme Java de contrôler automatiquement un navigateur web (tests, clics, formulaires, navigation).

# Selenium Manager
Add selenium Java Dependency in pom.xml.  
Link : <a href="https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-manager" >Selenium Manager dependency</a>

**Selenium Manager** : est un outil intégré à Selenium 4.6+ qui télécharge et configure automatiquement le bon pilote de navigateur (ChromeDriver, GeckoDriver, etc.).
 ==> Plus besoin de télécharger les drivers manuellement.

# WebDriverManager
**WebDriverManager** sert à télécharger, installer et configurer automatiquement le pilote (driver) du navigateur (par exemple ChromeDriver pour Chrome).  
Lien :<a href="https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/6.1.0" >WebDriverManager</a>  

Sans WebDriverManager :  
- vous devez télécharger le driver manuellement.  
- indiquer son chemin dans votre code.

# Flipkart End to End Selenium Java Automation Project
Automatiser un scénario utilisateur réel et complet sur "Flipkart"

# Un fichier .feature
Un fichier **.feature** sert à décrire les tests en langage naturel (BDD) avec Cucumber.

**Il permet de :**  
décrire le comportement attendu d'une application ;
écrire des scénarios compréhensibles par les développeurs, testeurs et clients ;
relier ces scénarios à du code Selenium qui exécute les actions.  

==> **le fichier .feature décrit le test, et le code Java l'exécute.**

### Configurer le support Cucumber/Gherkin. sur intelliJ IDEA
<a href="https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.34.3">Dépendance</a>  
Pour que votre IDE comprenne l'extension .feature, vous devez installer et configurer le support Cucumber/Gherkin:
- Allez dans : File > Settings > Plugins
- Installer Cucumber for Java et Gherkin
- ![](C:/Users/PC/Desktop/cucumenber.png)
- Ajouter la dépendance Cucumber dans pom.xml


### BDD
**BDD** signifie Behavior Driven Development (Développement piloté par le comportement).  

C'est une méthode de développement où l'on décrit les fonctionnalités d'une application du point de vue de l'utilisateur avant d'écrire le code.

# JUnit and Cucumber dependencies
- <a href="https://mvnrepository.com/artifact/junit/junit/4.13.2" >JUnit 4</a>
- <a href="https://mvnrepository.com/artifact/io.cucumber/cucumber-junit/7.34.4" >Cucumber for JUnit</a>

# extentreports cucumber7 adapter
<a href="https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber7-adapter" >extentreports cucumber7 adapter</a>  
C'est le pont entre Cucumber (qui exécute tes scénarios Gherkin) et ExtentReports (qui génère un joli rapport HTML). Sans elle, Cucumber ne sait pas comment parler à ExtentReports

### Génération de rapport dans target/extent-reports
![img.png](img.png)

# XPath

XPath (XML Path Language) est un langage qui permet de localiser et sélectionner des éléments dans un document XML ou HTML.  
Exemple :  
- ``` //h1 ``` → sélectionne tous les titres h1
- ``` //div[@class='menu'] ``` → sélectionne les div dont la classe est menu.

Il est très utilisé en web scraping, tests automatisés (Selenium) et pour manipuler des fichiers XML.

# Gherkin
Gherkin est un langage simple utilisé pour écrire des scénarios de test métier (souvent avec l’outil Cucumber).  
Il permet de décrire le comportement attendu d’une application avec des mots proches du langage naturel


