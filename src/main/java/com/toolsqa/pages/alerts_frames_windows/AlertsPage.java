package com.toolsqa.pages.alerts_frames_windows;

import com.toolsqa.pages.Widgets.WidgetsPage;
import org.openqa.selenium.By;

public class AlertsPage extends Alerts_fremes_windowsPage{
    private By informationalertbutton = By.id("alertButton");
    private By confirmationalertbutton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private By promptalertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");


    public void clickInformationButoon(){
        click(informationalertbutton);
    }

    public void clickConfirmationButton(){
        click(confirmationalertbutton);
    }

    public String getConfirmationresult(){
        return find(confirmationResult).getText();
    }

    public void clickPromptButton(){
        click(promptalertButton);
    }

    public String getPromptResult(){
        return find(promptResult).getText();
    }




}


