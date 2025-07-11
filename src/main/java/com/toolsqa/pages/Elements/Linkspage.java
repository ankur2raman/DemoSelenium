package com.toolsqa.pages.Elements;

import org.openqa.selenium.By;

import javax.lang.model.util.Elements;

import static utilities.javascriptutility.scrolltoElementJS;

public class Linkspage extends ElementsPage {

    private By badrequestlink = By.id("bad-request");
    private By responselink = By.id("linkResponse");

    public void clickbadrequestlink(){
        scrolltoElementJS(badrequestlink);
        click(badrequestlink);
    }

    public String getresponse(){
        delay(3000);
        return find(responselink).getText();

    }
}
