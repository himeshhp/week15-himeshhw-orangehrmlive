package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement userNameField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(xpath = "//button[text()[normalize-space()='Login']]")
    WebElement loginButton;
    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement displayedText;
    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    WebElement forgotPasswordLink;
    @FindBy(xpath = "//h6[text()='Reset Password']")
    WebElement resetText;

    public void enterUserName(String userName) {
        Reporter.log("Entered user name " + userName + " in user name field " + userNameField.toString());
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        Reporter.log("Entered password " + password + " in password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicked on login button " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getAfterLoginText() {
        return getTextFromElement(displayedText);
    }

    public void clickOnForgotPasswordLink() {
        Reporter.log("Clicked on forgot password link " + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
    }

    public String getResetText() {
        return getTextFromElement(resetText);
    }
}
