package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
    By productText = By.xpath("//span[@class='title']");
    By size = By.xpath("//div[@class='inventory_item']");
    By productSize = By.xpath("//div[@class='inventory_item']");
    public String getProductText(){
        return getTextFromElement(productText);
    }
    public String getProductSize(){
        List<WebElement> size = driver.findElements(productSize);
        return String.valueOf(size);
    }
}
