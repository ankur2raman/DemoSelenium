package part3.toolsqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class LinksTest extends BaseTest {
    @Test
    public void testLinks(){
        var linkspage = homePage.gotoElements().clicklinks();
        linkspage.clickbadrequestlink();
        String actualresponse = linkspage.getresponse();
        Assert.assertTrue(actualresponse.contains("400") &&  actualresponse.contains("Bad Request"),
                "Actual response ("+actualresponse+") does not contain 400 and Bad Request");

    }
}
