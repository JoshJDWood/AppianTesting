package com.appian;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppianSelectors {
    WebDriver driver;
    WebDriverWait wait;
    public AppianSelectors(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    //Wait function
    public void waitForMilliseconds(int in){
        try {
            Thread.sleep(in);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Asset management selections
    public WebElement getAssetManagementTab(){
        //Changed this to an elementToBeClickable for the relinquish test
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[1]/div[3]/div/div/div/div/nav[2]/div[1]/ul/li[2]/a")));
    }

    //Add asset selections
    public WebElement getAddNewAssetButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='XrayComponentSelectionManager']/div/div/div[2]/div/div[1]/div[1]/div[2]/div/div[1]/div/div/button")));
    }
    public WebElement getNewAssetWorkstation(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='action-dialog-body']/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[1]/div[1]/div")));
    }
    public WebElement getNewAssetNameInput(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("0c45e8e7d1eb10542047b5eae4c186e4")));
    }
    public WebElement getNewAssetSerialNumInput(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("81af77ceba6d02fa6c3ad06ebbc28554")));
    }
    public WebElement getNewAssetSubmitButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='action-dialog-body']/div/div[1]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/button")));
    }
    //Assign Asset Selections
    public WebElement getAssetRecordLink(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='XrayComponentSelectionManager']/div/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td[3]/div/p/a")));
    }
    public WebElement getUpdateAssetButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='XrayComponentSelectionManager']/div/div/div[1]/div/div/div[2]/div/div[1]/button")));
    }
    public WebElement getAssignOwnerField(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='a5bb7b558ae027f764c9fa67e2c01c1f_input']")));
    }
    public WebElement getSubmitAssignAsset(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='related-action-body']/div/div/div[1]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/button")));
    }
    public WebElement getAssetSummaryOwner(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='XrayComponentSelectionManager']/div/div/div[1]/div[4]/div[2]/div/div[2]/div/div[2]/div/p/a")));
    }
    //Update Asset selections
    public WebElement getUpdateNameInput(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("30e88629ad6176f2795dfff5c84d6495")));
    }
    public WebElement getUpdateSerialNumInput(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("f37889015f4707d40e80189112d78b2d")));
    }
    //Relinquish Asset Selections
    public WebElement getITCentralRelinquishButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='XrayComponentSelectionManager']/div/div[1]/div/div/div/div/div[2]/div/div/table/tbody/tr/td[4]/div/p/a")));
    }
    public WebElement getRelinquishAssetRelinquishButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='related-action-body']/div/div/div[1]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/button")));
    }
    public WebElement getRelinquishAssetOkayButton(){
        waitForMilliseconds(2000);
        if (!driver.findElements(By.xpath("/html/body/div[14]/div/div/div[2]/div[2]/div/div/button")).isEmpty()){
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[14]/div/div/div[2]/div[2]/div/div/button")));
        }
        else{
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[15]/div/div/div[2]/div[2]/div/div/button")));
        }
    }
    public WebElement getRelinquishAssetConfirmButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='related-action-body']/div/div/div[1]/div/div/div/div[3]/div/div/div/div/div/button")));
    }

    //--------------------------------
    //Maintenance Requests Selectors
    //New Maintenance Request
    public WebElement getNewMaintenanceRequestButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='XrayComponentSelectionManager']/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/div/button")));
    }
    public WebElement getPasswordSupportButton(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='action-dialog-body']/div/div[1]/div/div/div/div[2]/div/div/div/div[1]/div[2]/div/div[1]/div[3]/div")));
    }
    public WebElement setPriorityDropdown(){
//        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/div/appian-action-dialog/div/div/div[1]/div/div/div/div[2]/div/div/div/div[2]/div[1]/div/div[2]/div/div/div/svg"));
//        Select select = new Select(dropdown);
//        select.selectByIndex(index);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("0c0576fa5f94a31b52bf1f18f8aab58b_value_span")));
    }

    public WebElement getMaintenanceRequestTab(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='content']/div[1]/div[3]/div/div/div/div/nav[2]/div[1]/ul/li[3]/a")));
    }


}
