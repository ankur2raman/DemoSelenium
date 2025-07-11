package part3.toolsqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

import static com.Base.BasePage.delay;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate(){
        String month = "December";
        String monthnumber = "12";
        String day = "21";
        String year = "2034";

       var datepickerPage =  homePage.gotowidgets().clickDatePicker();
        datepickerPage.clickSelectDateField();
        datepickerPage.selectMonth(month);
        datepickerPage.selectYear(year);
        datepickerPage.clickDay(day);
        delay(2000);

        String actualDate = datepickerPage.getDate();
        String expectedDate = monthnumber+"/"+day+"/"+year;

        Assert.assertEquals(actualDate,expectedDate, "actual date is incorrect. Actual Date is "+actualDate+ "expected Date is "+expectedDate);

    }
}
