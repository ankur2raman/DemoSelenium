package com.toolsqa.pages.Widgets;

import org.openqa.selenium.By;

import static utilities.DropDownUtlity.selectbyvisibletext;

public class DatePickermenuPage extends WidgetsPage{
    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthdropdown = By.cssSelector(".react-datepicker__month-select");
    private By yeardropdown = By.cssSelector(".react-datepicker__year-select");

    private By dayvalue(String day){
        return By.xpath(
                "//div[contains(@class, 'react-datepicker__day') and not(contains(@class, 'outside-month')) and text()='"+day+"']");

    }

    public boolean isDayinMonth(String day){
        return find(dayvalue(day)).isDisplayed();

    }

    public void clickDay(String day){
        click(dayvalue(day));

    }

    public void clickSelectDateField(){
        click(selectDateField);

    }

    public String getDate(){
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month){
        selectbyvisibletext(monthdropdown, month);

    }

    public void selectYear(String year){
        selectbyvisibletext(yeardropdown, year);

    }


}
