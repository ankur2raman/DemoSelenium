package com.Driver;

import org.openqa.selenium.WebDriver;


public class DriverManager {

    private static WebDriver driver;

    public static WebDriver getDriver(String browser) {
        if (driver == null) {
            driver = DriverFactory.createDriver(browser);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
