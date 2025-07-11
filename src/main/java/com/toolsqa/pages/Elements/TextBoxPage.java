package com.toolsqa.pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import javax.lang.model.util.Elements;

import static utilities.ActionsUtility.sendkeys;
import static utilities.GetUtility.getText;
import static utilities.javascriptutility.scrolltoElementJS;
import static utilities.waitutility.explicitwaituntilevisible;

public class TextBoxPage extends ElementsPage {

    private By fullnamefield = By.id("userName");
    private By currentaddressfield = By.xpath("//textarea[@id='currentAddress']");
    private By submitbutton = By.id("submit");
    private By Currentaddressresult = By.xpath("//p[@id='currentAddress']");


    public String getCurrentaddress() {
        explicitwaituntilevisible(5, Currentaddressresult);
        return getText(Currentaddressresult);

    }

    public void clickSubmitButton(){
        scrolltoElementJS(submitbutton);
        click(submitbutton);
    }

    public void setcurrentaddress(String address){
        find(currentaddressfield).sendKeys(address + Keys.ENTER);
        //Did not use set() because it clears the data first

    }

    public void setfullname(String name){
        scrolltoElementJS(fullnamefield);
        //Sendkeys from Actions class and not from WebElement interface
//        Actions act = new Actions(driver);
//        act.sendKeys(find(fullnamefield), Keys.chord(name)).perform();

        sendkeys(find(fullnamefield), Keys.chord(name));
    }

    public void setemail(String email){
        setfullname(Keys.chord(Keys.TAB, email));
    }


}
