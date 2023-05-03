package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    ProductPage productPage = new ProductPage();
    LoginPage loginPage = new LoginPage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        productPage.getProductText();
    }
}
