package part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void Testmodaldialog() {
        var afwpage = homePage.gotoalertsframeswindowscard();
        var modalDialogpage = afwpage.clickModalDialog();
        modalDialogpage.clicksmallmodalButton();
        String actualtext= modalDialogpage.getsmallmodaltext();
        Assert.assertTrue(actualtext.contains("small modal"), "the message does not contain small modal");
        modalDialogpage.clickCloseButton();
    }

}
