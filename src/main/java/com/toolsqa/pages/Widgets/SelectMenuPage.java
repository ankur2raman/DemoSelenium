package com.toolsqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utilities.javascriptutility.*;
import static utilities.DropDownUtlity.*;

public class SelectMenuPage extends WidgetsPage{

    private By standardmutliselect = By.id("cars");
    public void selectstandardmulti(String text){
        scrolltoElementJS(standardmutliselect);
//        Select select = new Select(find(standardmutliselect));
//        select.selectByVisibleText(text);
        selectbyvisibletext(standardmutliselect, text);
    }

    public void selectstandardmulti(int index){
        scrolltoElementJS(standardmutliselect);
        selectbyIndex(standardmutliselect, index);
    }

    public void delectstandardmulti(String value){
        scrolltoElementJS(standardmutliselect);
        deselectbyvalue(standardmutliselect, value);

    }
    public List<String> getallSelectedmultiOptions(){
        return getallSelectedOptions(standardmutliselect);

    }



}
