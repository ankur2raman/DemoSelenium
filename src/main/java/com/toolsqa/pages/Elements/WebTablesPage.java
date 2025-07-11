package com.toolsqa.pages.Elements;

import org.openqa.selenium.By;

public class WebTablesPage extends ElementsPage{
    private By registrationAgefield = By.id("age");
    private By submitbutton = By.id("submit");

    public void clickEdit(String email){
        By edit = By.xpath("(//div[text()='"+email+"']//following::span[@title='Edit'])[1]");
        click(edit);

    }

    public void setage(String age){
        set(registrationAgefield,age);

    }
    public void clicksubbutton(){
        click(submitbutton);
    }

    public String getagefromtable(String email){
        By tableage = By.xpath("//div[text()='"+email+"']/preceding::div[1]");
        return find(tableage).getText();
    }
}
