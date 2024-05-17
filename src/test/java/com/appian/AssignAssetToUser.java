package com.appian;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignAssetToUser extends SetUpTests{

    @Test
    public void assignAssetToUser(){

        selector.getAssetManagementTab().click();
        selector.getAssetRecordLink().click();
        selector.getUpdateAssetButton().click();
        WebElement assignOwnerField = selector.getAssignOwnerField();
        assignOwnerField.sendKeys("Joshua Wood");

        //Wait for a few seconds
        selector.waitForMilliseconds(1500);

        assignOwnerField.sendKeys(Keys.ENTER);
        selector.getSubmitAssignAsset().click();

        String owner = selector.getAssetSummaryOwner().getText();
        Assert.assertEquals(owner, "Joshua Wood");
    }
}
