package utilities;

import org.openqa.selenium.By;

import java.util.Set;

public class GetUtility extends utility{

    public static String getwindowHandle() {
        return driver.getWindowHandle();
    }

    public static Set<String> getwindowHandles() {
        return driver.getWindowHandles();
    }
    public static String getText(By locator){
        return driver.findElement(locator).getText();

    }
    public static String getAttribute(By locator, String attribute){
        return driver.findElement(locator).getAttribute(attribute);

    }

    public static String getURl(){
        return driver.getCurrentUrl();
    }
}
