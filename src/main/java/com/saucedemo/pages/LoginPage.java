package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By productText = By.xpath("//span[@class='title']");

    public void enterUserName(String name){
        sendTextToElement(userNameField,name);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickLoginButton(){
        clickOnElement(loginButton);
    }



}
