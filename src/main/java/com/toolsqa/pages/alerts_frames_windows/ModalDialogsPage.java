package com.toolsqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alerts_fremes_windowsPage {
    private By smallModalButton = By.id("showSmallModal");
    private By smallModaltext = By.xpath("//div[contains(text(), 'small modal')]");
    private By CloseButton = By.id("closeSmallModal") ;

    public void clicksmallmodalButton(){
        click(smallModalButton);

    }

    public String getsmallmodaltext(){
        return find(smallModaltext).getText();
    }

    public void clickCloseButton(){
        click(CloseButton);
    }


}
