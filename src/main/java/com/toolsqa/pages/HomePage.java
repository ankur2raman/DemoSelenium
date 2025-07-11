package com.toolsqa.pages;

import com.Base.BasePage;
import com.toolsqa.pages.Elements.ElementsPage;
import com.toolsqa.pages.Forms.FormsPage;
import com.toolsqa.pages.Widgets.WidgetsPage;
import com.toolsqa.pages.alerts_frames_windows.Alerts_fremes_windowsPage;
import org.openqa.selenium.By;

import static utilities.javascriptutility.scrolltoElementJS;

public class HomePage extends BasePage {
    private By formscard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementscard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetscard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertsFramewindowscard= By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");


    public FormsPage gotoForms(){
        scrolltoElementJS(formscard);
        click(formscard);
        return new FormsPage();
    }

    public ElementsPage gotoElements(){
        scrolltoElementJS(elementscard);
        click(elementscard);
        return new ElementsPage();
    }

    public WidgetsPage gotowidgets(){
        scrolltoElementJS(widgetscard);
        click(widgetscard);
        return new WidgetsPage();

    }
    public Alerts_fremes_windowsPage gotoalertsframeswindowscard(){
        scrolltoElementJS(alertsFramewindowscard);
        click(alertsFramewindowscard);
        return new Alerts_fremes_windowsPage();
    }
}
