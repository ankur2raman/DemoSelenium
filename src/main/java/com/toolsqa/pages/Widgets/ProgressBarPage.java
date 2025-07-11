package com.toolsqa.pages.Widgets;

import org.openqa.selenium.By;


import static utilities.GetUtility.getText;
import static utilities.waitutility.fluentwaitUntilVisible;

public class ProgressBarPage extends WidgetsPage{
    private By startbutton = By.id("startStopButton");
    private By progressBarvalue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public void clickstartbutton(){
        click(startbutton);
    }

    public String getprogressvarvalue(){
        fluentwaitUntilVisible(30, progressBarvalue);
        return getText(progressBarvalue);

    }
}
