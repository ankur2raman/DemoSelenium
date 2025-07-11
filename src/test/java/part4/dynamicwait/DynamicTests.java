package part4.dynamicwait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class DynamicTests extends BaseTest {


    public void testvisibleafterbuttontext(){
       var dynamicpage = homePage.gotoElements().clickdynanmicproperties();
        String actualtext= dynamicpage.getvisibleafterbuttontext();
        String expectedtext= "Visible After 5 Seconds";
        Assert.assertEquals(actualtext, expectedtext, "Actual text is incorrect");
    }


    public void testprogressbar(){
        var progressbbarpage = homePage.gotowidgets().clickProgressBar();
        progressbbarpage.clickstartbutton();
        String actualvalue = progressbbarpage.getprogressvarvalue();
        System.out.println("progressbar value is: " + actualvalue);
        String expectedvalue= "100%";
        assertEquals(actualvalue, expectedvalue);


    }
}
