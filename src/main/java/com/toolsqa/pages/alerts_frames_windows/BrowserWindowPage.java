package com.toolsqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.switchToUtility.switchtowindow;

public class BrowserWindowPage extends Alerts_fremes_windowsPage{
    private By newWindowButton = By.id("windowButton");

    public  void clicknewWindowbutton(){
        click(newWindowButton);

    }

    public void switchtonewwindow(){

        //1. get current main window handle
        String currenthandle = driver.getWindowHandle();
        System.out.println("Current Window Handle is: " + currenthandle);
        //2. get all window handles
        Set<String> allHandles= driver.getWindowHandles();
        System.out.println("All Window Handles are: " + allHandles.size());

        for(String handle : allHandles){
            if(currenthandle.equals(handle)){
                System.out.println("1st window ID is: " + handle);
            }
            else {
                //3. switch to new window using window handle
                //driver.switchTo().window(handle);
                switchtowindow(handle);
                System.out.println("2nd window ID is: " + handle);
            }
        }


    }

}
