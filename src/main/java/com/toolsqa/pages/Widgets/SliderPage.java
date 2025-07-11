package com.toolsqa.pages.Widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.draganddropBy;
import static utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage {
    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By slidervalue = By.id("sliderValue");

    public String getSlidervalue(){
        return getAttribute(slidervalue, "value");
    }

    public void moveslider(int x, int y){
        //Actions is class in Interaction package
        //Action is inteface
//        Actions act = new Actions(driver);
//        //act.draganddrop, contecxtclick,doubleclick etc
//        act.dragAndDropBy(find(slider), x, y).perform();


        draganddropBy(find(slider), x, y);
    }

}
