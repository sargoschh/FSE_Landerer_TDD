package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class MySeleniumTest {
    // Instanzvariable für den WebDriver, die zum Steuern des Browsers verwendet wird
    private WebDriver driver;

    // Set-Up-Methode, die vor jedem Test ausgeführt wird
    @Before
    public void setUp() {
        // Setzen des Pfades zum GeckoDriver, der für Firefox erforderlich ist
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        // Erstellen einer neuen FirefoxDriver-Instanz
        driver = new FirefoxDriver();
    }

    // Testmethode, die die Google-Suche testet
    @Test
    public void testSearch() {
        // Öffnen der Google-Website
        driver.get("https://www.google.com");
        // Akzeptieren von Cookies auf der Google-Website
        acceptGoogleCookies(driver);

        // Suchfeld auf der Google-Website suchen und Text eingeben
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        // Absenden des Suchformulars
        searchBox.submit();

        // Warten, bis die Suchergebnisse geladen sind
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".g")));

        // Überprüfen der Suchergebnisse
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".g"));
        boolean seleniumFound = false;

        // Durchlaufen der Suchergebnisse und Überprüfen, ob "Selenium" im Text enthalten ist
        for (WebElement result : searchResults) {
            if (result.getText().toLowerCase().contains("selenium")) {
                seleniumFound = true;
                break;
            }
        }

        // Bestätigen, dass mindestens ein Suchergebnis "Selenium" enthält
        assertTrue("Selenium not found in search results.", seleniumFound);
    }

    // Hilfsmethode zum Akzeptieren von Cookies auf der Google-Website
    public void acceptGoogleCookies(WebDriver driver) {
        try {
            // Warten auf das Cookie-Banner, falls es vorhanden ist
            Thread.sleep(2000);
            WebElement cookieBanner = driver.findElement(By.id("CXQnmb"));
            // Klicken auf den "Ich stimme zu"-Button, um Cookies zu akzeptieren
            WebElement acceptButton = cookieBanner.findElement(By.id("L2AGLb"));
            acceptButton.click();
        } catch (TimeoutException e) {
            System.out.println("Cookie banner not found. Proceeding without accepting cookies.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Tear-Down-Methode, die nach jedem Test ausgeführt wird
    @After
    public void tearDown() {
        // Schließen des Browsers und Beenden des WebDriver
        driver.quit();
    }
}
