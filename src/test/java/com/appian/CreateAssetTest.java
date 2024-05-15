package com.appian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.appian.AppianSelectors;

import java.time.Duration;

public class CreateAssetTest extends SetUpTests{
    AppianSelectors selector = new AppianSelectors(driver);

    @Test
    public void createAnAssetTest() {
        WebElement assetManagementTab = selector.getAssetManagementTab();
        assetManagementTab.click();
    }
}
