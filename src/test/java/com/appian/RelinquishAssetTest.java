package com.appian;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class RelinquishAssetTest extends SetUpTests{

    @Test
    public void relinquishAssetTest(){
        selector.getITCentralRelinquishButton().click();
        selector.getRelinquishAssetRelinquishButton().click();
        selector.getRelinquishAssetOkayButton().click();
        selector.getRelinquishAssetConfirmButton().click();

        //Check asset has been relinquished
        selector.waitForMilliseconds(45000);
        List<WebElement> expected = new ArrayList<>();
        List<WebElement> actual = driver.findElements(By.xpath("//*[@id='XrayComponentSelectionManager']/div/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[4]/div/p/a"));
        Assert.assertEquals(actual, expected);
    }
}
