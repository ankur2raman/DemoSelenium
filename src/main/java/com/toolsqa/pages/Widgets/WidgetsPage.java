package com.toolsqa.pages.Widgets;

import com.toolsqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.javascriptutility.scrolltoElementJS;

public class WidgetsPage extends HomePage {
    private By selectmenu = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By datepickermenuitem = By.xpath("//li[@id='item-2']/span[text()='Date Picker']");
    private By progressbarmenuitem = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");
    private By Slidermenuitem = By.xpath("//li[@id='item-3']//span[text() ='Slider']");

    public SliderPage clickslider(){
        scrolltoElementJS(Slidermenuitem);
        click(Slidermenuitem);
        return new SliderPage();
    }

    public ProgressBarPage clickProgressBar(){
        scrolltoElementJS(progressbarmenuitem);
        click(progressbarmenuitem);
        return new ProgressBarPage();
    }

    public SelectMenuPage clickSelectMenu(){
        scrolltoElementJS(selectmenu);
        click(selectmenu);
        return new SelectMenuPage();
    }
    public DatePickermenuPage clickDatePicker(){
        scrolltoElementJS(datepickermenuitem);
        click(datepickermenuitem);
        return new DatePickermenuPage();

    }
}
