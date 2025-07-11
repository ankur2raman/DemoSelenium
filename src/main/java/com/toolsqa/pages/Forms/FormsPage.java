package com.toolsqa.pages.Forms;

import com.toolsqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.javascriptutility.scrolltoElementJS;

public class FormsPage extends HomePage {
    private By practiceFormMenuItems = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public practiceFormspage clickPracticeForm(){
        scrolltoElementJS(practiceFormMenuItems);
        click(practiceFormMenuItems);
        return new practiceFormspage();

    }
}
