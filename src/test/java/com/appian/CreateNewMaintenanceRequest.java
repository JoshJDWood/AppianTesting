package com.appian;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateNewMaintenanceRequest extends SetUpTests{

    @Test
    public void createNewMaintenanceRequest(){
        selector.getNewMaintenanceRequestButton().click();
        selector.getPasswordSupportButton().click();
        selector.setPriorityDropdown().sendKeys("High");
    }
}
