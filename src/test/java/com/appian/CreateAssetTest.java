package com.appian;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.appian.GenerateRandomString.generateRandomString;

public class CreateAssetTest extends SetUpTests{

    @Test
    public void createAnAssetTest() {
        String serialNum = generateRandomString();

        selector.getAssetManagementTab().click();
        selector.getAddNewAssetButton().click();
        selector.getNewAssetWorkstation().click();
        selector.getNewAssetNameInput().sendKeys("Macbook Pro 123");
        selector.getNewAssetSerialNumInput().sendKeys(serialNum);
        selector.getNewAssetSubmitButton().click();

        Assert.assertNotNull(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + serialNum + "']"))));
    }
}
