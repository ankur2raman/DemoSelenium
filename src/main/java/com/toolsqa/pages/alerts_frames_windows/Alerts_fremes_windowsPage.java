package com.toolsqa.pages.alerts_frames_windows;

import com.toolsqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.javascriptutility.scrolltoElementJS;

public class Alerts_fremes_windowsPage extends HomePage {
    private By modaldialogmenuitem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private By alertsmenuitem = By.xpath("//li[@id='item-1']//span[text()= 'Alerts']");
    private By framesmenuitem = By.xpath("//li[@id='item-2']//span[text()='Frames']");
    private By browserWindowMenuitem = By.xpath("//li[@id='item-0']//span[text()='Browser Windows']");

    public AlertsPage clickalerts(){
        scrolltoElementJS(alertsmenuitem);
        click(alertsmenuitem);
        return new AlertsPage();
    }

    public ModalDialogsPage clickModalDialog(){
        scrolltoElementJS(modaldialogmenuitem);
        click(modaldialogmenuitem);
        return new ModalDialogsPage();

    }

    public FramesPage clickFrames(){
        scrolltoElementJS(framesmenuitem);
        click(framesmenuitem);
        return new FramesPage();

    }

    public BrowserWindowPage clickBrowserWindows(){
        scrolltoElementJS(browserWindowMenuitem);
        click(browserWindowMenuitem);
        return new BrowserWindowPage();
    }

}
