package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {
    ProductPage productPage = new ProductPage();
    LoginPage loginPage = new LoginPage();
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        productPage.getProductSize();
    }

}
