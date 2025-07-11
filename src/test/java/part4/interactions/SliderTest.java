package part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class SliderTest extends BaseTest {
    @Test
    public void testSliderresult(){
        int x=180;
        int y=0;
        var sliderPage = homePage.gotowidgets().clickslider();
        sliderPage.moveslider(x, y);
        String actualvalue = sliderPage.getSlidervalue();
        String expectedvalue = "89";
        Assert.assertEquals(actualvalue, expectedvalue, "Actual and expected value do not match");

    }
}
