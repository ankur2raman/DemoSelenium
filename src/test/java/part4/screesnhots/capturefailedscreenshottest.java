package part4.screesnhots;

import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class capturefailedscreenshottest extends BaseTest {
    @Test
    public void testclickingsubmitbuttonwithoutJSExecutor(){
        var parcticeformpage = homePage.gotoForms().clickPracticeForm();
        parcticeformpage.clicksubmitbutton();
    }
}

