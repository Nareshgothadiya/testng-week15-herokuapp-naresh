package login.com.herokuapp.testsuite;

import login.com.herokuapp.pages.LoginPage;
import login.com.herokuapp.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void UserShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getVerifyText(), "Welcome to the Secure Area. When you are done click logout below.", "Error Message not displayed");

    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheUsernameErrorMessage() {

        loginPage.enterUsername1("tomsmith1");
        loginPage.enterPassword1("SuperSecretPassword!");
        loginPage.clickOnLoginButton1();
        Assert.assertEquals(loginPage.getVerifyText1(), "Your username is invalid!\n" + "×", "Error Message not displayed");

    }

    @Test(groups = {"regression"})
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUsername2("tomsmith1");
        loginPage.enterPassword2("SuperSecretPassword");
        loginPage.clickOnLoginButton2();
        Assert.assertEquals(loginPage.getVerifyText2(), "Your username is invalid!\n" + "×", "Error Message not displayed");

    }

}