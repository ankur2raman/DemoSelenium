package part4.windows;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

import static utilities.GetUtility.getURl;

public class windowsTest extends BaseTest {
    @Test
    public void testWindowURL(){
        var WindowsPage = homePage.gotoalertsframeswindowscard().clickBrowserWindows();
        WindowsPage.clicknewWindowbutton();
        WindowsPage.switchtonewwindow();
        String actual_URL = getURl();
        String expected_URL = "https://demoqa.com/sample";
        Assert.assertEquals(actual_URL, expected_URL, "Actual URL doesn't match expected URL");


    }
}
