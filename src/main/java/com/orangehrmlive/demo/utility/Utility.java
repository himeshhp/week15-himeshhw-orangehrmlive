package com.orangehrmlive.demo.utility;

import com.orangehrmlive.demo.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends ManageBrowser {
    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }
    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }
}
