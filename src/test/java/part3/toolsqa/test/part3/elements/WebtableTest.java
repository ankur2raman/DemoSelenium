package part3.toolsqa.test.part3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class WebtableTest extends BaseTest {
    @Test
    public void testWebtable(){
        String email = "kierra@example.com";
        String expectedage = "34";
        var webtablepage = homePage.gotoElements().clickwebtable();
        webtablepage.clickEdit(email);
        webtablepage.setage("34");
        webtablepage.clicksubbutton();
        String actualage = webtablepage.getagefromtable(email);
        Assert.assertEquals(actualage, expectedage, "actual age does not match with expected");
    }
}
