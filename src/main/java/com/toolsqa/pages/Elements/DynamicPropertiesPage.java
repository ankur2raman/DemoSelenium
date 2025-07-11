package com.toolsqa.pages.Elements;

import org.openqa.selenium.By;

import static utilities.GetUtility.getText;
import static utilities.waitutility.*;

import javax.lang.model.util.Elements;

public class DynamicPropertiesPage extends ElementsPage{
    private By visibleafterbutton = By.id("visibleAfter");

    public String getvisibleafterbuttontext() {
        explicitwaituntilevisible(5, visibleafterbutton);
        String visibletext = getText(visibleafterbutton);
        System.out.println("Buttonvisibletext = " + visibletext);
        return visibletext;
    }
}
