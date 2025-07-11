package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class switchToUtility extends utility {
    private static WebDriver.TargetLocator switchTo(){

        return driver.switchTo(); //switchto returns TargetLocator interface
    }

    public static String getAlertText(){
        return switchTo().alert().getText(); // this gettext is from Alert interface
    }

    public static void acceptAlert(){
        switchTo().alert().accept();
    }

    //return driver.switchTo().alert();
    public static void dismissalert(){
        switchTo().alert().dismiss();

    }

    public static void setalerttext(String text){
        switchTo().alert().sendKeys(text);
    }

    public static void switchtoframeString(String value){
        switchTo().frame(value);
    }

    public static void switchtoDefaultContent(){
        switchTo().defaultContent();
    }

    public static void switchtoFrameIndex(int index){
        switchTo().frame(index);
    }

    public static void switchtoFrameWebElement(WebElement element){
        switchTo().frame(element);
    }
    public static void switchtowindow(String handle){
        switchTo().window(handle);
    }



}
