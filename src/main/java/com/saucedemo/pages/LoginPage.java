package com.saucedemo.pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import utilities.Pagetitlemismatchexceptions;

public class LoginPage extends BasePage {
    private By usernamefield =  By.id("user-name");
    private By passwordfield = By.id("password");
    private By loginbutton = By.id("login-button");
    private By errormessage = By.cssSelector("#login_button_container h3");

    public void setusername(String username){
        set(usernamefield,  username);
    }

    public void setpassword(String password){
        set(passwordfield,  password);
    }

    public Productpage clickloginbutton(){
        click(loginbutton);
        return  new Productpage();
    }

    public Productpage logintoapplication(String username, String password){
        setusername(username);
        setpassword(password);
        return  clickloginbutton();
    }

    public String geterrormessage(){
        return find(errormessage).getText();
    }

    public void validatePageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        if (!actualTitle.equals(expectedTitle)) {
            throw new Pagetitlemismatchexceptions(
                    "Expected title: '" + expectedTitle + "', but got: '" + actualTitle + "'"
            );
        }
    }



}
