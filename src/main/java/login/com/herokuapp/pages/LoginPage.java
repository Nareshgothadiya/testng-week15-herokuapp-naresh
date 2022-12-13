package login.com.herokuapp.pages;

import login.com.herokuapp.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "username")
    WebElement usernameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"login\"]/button/i")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"content\"]/div/h4")
    WebElement verifyText;


    public void enterUsername(String email) {
        Reporter.log("enterUsername" + usernameField.toString());
        sendTextToElement(usernameField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("enterPassword" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("clickOnLoginButton" + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getVerifyText() {
        Reporter.log("getVerifyText" + verifyText.toString());
        return getTextFromElement(verifyText);
    }

    //**********************
    @CacheLookup
    @FindBy(id = "username")
    WebElement usernameField1;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField1;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"login\"]/button/i")
    WebElement loginButton1;

    @CacheLookup
    @FindBy(xpath = "//div[@class='flash error']")
    WebElement verifyText1;


    public void enterUsername1(String email) {
        sendTextToElement(usernameField1, email);
    }

    public void enterPassword1(String password) {
        sendTextToElement(passwordField1, password);
    }

    public void clickOnLoginButton1() {
        clickOnElement(loginButton1);
    }

    public String getVerifyText1() {
        return getTextFromElement(verifyText1);
    }

    //*********************
    @CacheLookup
    @FindBy(id = "username")
    WebElement usernameField2;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField2;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"login\"]/button/i")
    WebElement loginButton2;

    @CacheLookup
    @FindBy(xpath = "//div[@id='flash-messages']//div[1]")
    WebElement verifyText2;


    public void enterUsername2(String email) {
        Reporter.log("enterUsername2" + usernameField2.toString());
        sendTextToElement(usernameField2, email);
    }

    public void enterPassword2(String password) {
        Reporter.log("enterPassword2" + passwordField2.toString());
        sendTextToElement(passwordField2, password);
    }

    public void clickOnLoginButton2() {
        Reporter.log("clickOnCurrencyLink" + loginButton2.toString());
        clickOnElement(loginButton2);
    }

    public String getVerifyText2() {
        Reporter.log("getVerifyText2" + verifyText2.toString());
        return getTextFromElement(verifyText2);
    }


}
