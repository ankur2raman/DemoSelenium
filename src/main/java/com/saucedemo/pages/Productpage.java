package com.saucedemo.pages;

import com.Base.BasePage;
import org.openqa.selenium.By;

public class Productpage extends BasePage {
    private By productHeader= By.xpath("//span[text()='Products']");

    public boolean isproductheaderdisplayed(){
        return find(productHeader).isDisplayed();
    }


}
