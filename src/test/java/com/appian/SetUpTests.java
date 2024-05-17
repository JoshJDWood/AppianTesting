package com.appian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class SetUpTests {
    public WebDriver driver;
    public WebDriverWait wait;
    AppianSelectors selector;

    @BeforeClass
    public void setUp() {
        // Specify the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        // Specify the path to the custom Chrome profile
        String chromeProfilePath = "C:\\Users\\Josh\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1";

        // Set up ChromeOptions to use the custom profile
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=" + chromeProfilePath);

        // Initialize the ChromeDriver with the custom profile
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        driver.manage().window().maximize();
        selector = new AppianSelectors(driver, wait);

        driver.get("https://us.appian.community/suite/sites/w2398ais-acme-it-central");

        //sign in (DO NOT DELETE!!!!)
//        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okta-signin-username")));
//        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
//        WebElement signInButton = driver.findElement(By.id("okta-signin-submit"));
//
//        usernameField.sendKeys("joshwoodsta@gmail.com");
//        passwordField.sendKeys("$8j_pDZUZ9v#qnj");
//        signInButton.click();

        //break point to add sms
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
