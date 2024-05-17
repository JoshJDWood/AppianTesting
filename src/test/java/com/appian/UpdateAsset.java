package com.appian;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.appian.GenerateRandomString.generateRandomString;

public class UpdateAsset extends SetUpTests{

    @Test
    public void updateAsset(){
        String serialNum = generateRandomString();

        selector.getAssetManagementTab().click();
        selector.getAssetRecordLink().click();
        selector.getUpdateAssetButton().click();
        selector.getUpdateNameInput().clear();
        selector.getUpdateNameInput().sendKeys("Windows Hp 5000 Workstation");
        selector.getUpdateSerialNumInput().clear();
        selector.getUpdateSerialNumInput().sendKeys(serialNum);
        selector.getSubmitAssignAsset().click();

        Assert.assertNotNull(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='" + serialNum + "']"))));
    }
}
