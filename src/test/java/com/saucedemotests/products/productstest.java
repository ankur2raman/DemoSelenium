package com.saucedemotests.products;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.Productpage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class productstest extends BaseTest {
    @Test
    public void testproductheaderisdisplayed(){
     Productpage productpage = loginPage.logintoapplication( "standard_user", "secret_sauce");
       // Assert.assertTrue(productpage.isproductheaderdisplayed());
        assertTrue(productpage.isproductheaderdisplayed(), "product header is not displayed");
    }
}
