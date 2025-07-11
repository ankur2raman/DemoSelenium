package part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

import static com.Base.BasePage.delay;
import static utilities.switchToUtility.*;



@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlerts() {
        String expectedalertText= "You clicked a button";
        var alertspage = homePage.gotoalertsframeswindowscard().clickalerts();
        alertspage.clickInformationButoon();
        Assert.assertEquals(getAlertText(), expectedalertText,
                "Actual and expected do not match"
        );
        delay(2000);
        acceptAlert();
        //alertspage.clickInformationButoon();

    }
    public void testConfirmationAlerts() {
        String expectedalertText= "You selected Cancel";
        var alertspage= homePage.gotoalertsframeswindowscard().clickalerts();
        alertspage.clickConfirmationButton();
        delay(2000);
        dismissalert();
        String actualalertText = alertspage.getConfirmationresult();
        Assert.assertEquals(actualalertText, expectedalertText, "You did not select cancel");


    }
    public void testPromptAlerts() {
        String alertText= "Hanuman ji ki Jay";
        String expectedalertText= "You entered "+ alertText;
        var alertspage= homePage.gotoalertsframeswindowscard().clickalerts();
        alertspage.clickPromptButton();
        setalerttext(alertText);
        acceptAlert();
        String actualResult = alertspage.getPromptResult();
        Assert.assertEquals(actualResult, expectedalertText, "Actual and Expected results don't match");

    }
}
