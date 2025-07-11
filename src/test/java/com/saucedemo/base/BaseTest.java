package com.saucedemo.base;

import com.Base.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import static com.Base.BasePage.delay;

public class BaseTest {
    protected BasePage basePage;
    protected LoginPage loginPage;
    protected WebDriver driver;
    private String Url= "https://www.saucedemo.com";

    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
    }
    @AfterClass
    public void teardown(){
        delay(3000);
        driver.quit();
    }
}
