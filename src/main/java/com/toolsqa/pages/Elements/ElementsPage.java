package com.toolsqa.pages.Elements;

import com.toolsqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.javascriptutility.scrolltoElementJS;

public class ElementsPage extends HomePage {
    private By webtablesmenu = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    //private By Linksmenuitem = By.xpath("//li[@id='item-5']//following::span[text()='Links']");
    private By Linksmenuitem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By dynamicpropertiesmenuitem = By.xpath("//li[@id='item-8']//span[text()='Dynamic Properties']");
    private By textBoxmenuitem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");

    public TextBoxPage clicktextbox(){
        scrolltoElementJS(textBoxmenuitem);
        click(textBoxmenuitem);
        return new TextBoxPage();
    }

    public DynamicPropertiesPage clickdynanmicproperties(){
        scrolltoElementJS(dynamicpropertiesmenuitem);
        click(dynamicpropertiesmenuitem);
        return new DynamicPropertiesPage();
    }


    public WebTablesPage clickwebtable(){
        click(webtablesmenu);
        return new WebTablesPage();

    }

    public Linkspage clicklinks(){
        click(Linksmenuitem);
        return new Linkspage();
    }
}
