package part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class FramesTest extends BaseTest {

    //switch to frames using String, index, WebElement
    @Test
    public void testframebigbox(){
        var framespage= homePage.gotoalertsframeswindowscard().clickFrames();
        String actualbigboxtext= framespage.gettextinBigframe();
        String expectedbignoxtext = "This is a sample page";
        Assert.assertEquals(actualbigboxtext,expectedbignoxtext, "Actual big box text is incorrect.");
        String actualHeaderText = framespage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText, "Actual Header Text is incorrect.");

    }


    @Test
    public void testframesmallbox(){
        var framespage= homePage.gotoalertsframeswindowscard().clickFrames();
        String actualsmallboxtext = framespage.gettextinsmallframe();
        String expectedsmallboxtext = "This is a sample page";
        Assert.assertEquals(actualsmallboxtext, expectedsmallboxtext, "Actual and expected do not match");
        String actualHeaderText = framespage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText, "Actual Header Text is incorrect.");



    }
}
