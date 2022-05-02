package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    //create the logintest object
    HomePage homePage = new HomePage();
    SignInPage loginPage = new SignInPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //* click on the ‘Sign In’ link
        homePage.clickOnSignInButton();
        //* Verify the text ‘Welcome Back!’
        //this os form requirement
        String expectedSignInText = "Welcome Back!";
        String actualSignInText = loginPage.getWelcomeMessage();
        Assert.assertEquals(expectedSignInText,actualSignInText);
    }

    @Test
    public void verifyTheErrorMessage(){
        // click on the ‘Sign In’ link
        homePage.clickOnSignInButton();
        //* Enter invalid username
        loginPage.enterEmailAddress("megha");
        //* Enter invalid password
        loginPage.enterPassword("megha123");
        //* Click on Login button
        loginPage.clickOnSignInButton();
        //* Verify the error message ‘Invalid email
        // or password.
        String expectedErrorMessage = "Invalid email or password.";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }

}
