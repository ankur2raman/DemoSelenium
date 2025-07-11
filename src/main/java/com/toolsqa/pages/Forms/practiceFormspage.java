package com.toolsqa.pages.Forms;

import org.openqa.selenium.By;

import static utilities.javascriptutility.clickJS;
import static utilities.javascriptutility.scrolltoElementJS;

public class practiceFormspage extends FormsPage {
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private By submitbutton =  By.id("submit");

    public void clickfemaleRadioButton(){
        scrolltoElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isfemaleRadioButtonSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void clicksSportsHobbyCheckbox(){
        if(!find(sportsHobbyCheckbox).isSelected()){
            scrolltoElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clicksReadingHobbyCheckbox(){
        if(!find(readingHobbyCheckbox).isSelected()){
            scrolltoElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clicksmusicHobbyCheckbox(){
        if(!find(musicHobbyCheckbox).isSelected()){
            scrolltoElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unclicksReadingHobbyCheckbox(){
        if(find(readingHobbyCheckbox).isSelected()){
            scrolltoElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingHobbyCheckboxSelected(){

        return find(readingHobbyCheckbox).isSelected();
    }


    public void clicksubmitbutton(){
       scrolltoElementJS(submitbutton);
        //click(submitbutton);

    }
}
