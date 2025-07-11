package com.saucedemotests;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testloginerrormessage(){
        loginPage.setusername("standard_user");
        loginPage.setpassword("xdgdr");
        loginPage.clickloginbutton();
        String actualMessage = loginPage.geterrormessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"));
        //Assert.assertFalse(actualMessage.contains("Epic sadface"));
        //loginPage.validatePageTitle("sfnksdjf");
        loginPage.validatePageTitle("Swag Labs");

    }

}
