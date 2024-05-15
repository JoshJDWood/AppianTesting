package com.appian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppianSelectors {
    WebDriver driver;
    WebDriverWait wait;
    public AppianSelectors(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement getAssetManagementTab(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[1]/div[3]/div/div/div/div/nav[2]/div[1]/ul/li[2]/a/div")));
    }
}
