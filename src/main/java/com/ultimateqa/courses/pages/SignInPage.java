package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By welcomeText = By.xpath("//h1[@class='page__heading']");
    By emailField = By.id("user[email]");
    By passwordField = By.name("user[password]");
    By signInButton = By.xpath("//input[@class='button button-primary g-recaptcha']");
    By getErrorMessage = By.cssSelector(".form-error__list-item");

    public void enterEmailAddress(String email){

        sendTextToElement(emailField,email);
    }

    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }

    public void clickOnSignInButton(){

        clickOnElement(signInButton);
    }
    public String getWelcomeMessage(){

        return getTextFromElement(welcomeText);
    }

    public String getErrorMessage(){

        return getTextFromElement(getErrorMessage);
    }


}
