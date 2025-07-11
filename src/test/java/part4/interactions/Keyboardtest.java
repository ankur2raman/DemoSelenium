package part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class Keyboardtest extends BaseTest {
    @Test
    public void enterbykeyboard(){
        var textboxpage = homePage.gotoElements().clicktextbox();
        textboxpage.setfullname("Ankur Raman");
        textboxpage.setemail("abdjandsj@gmail.com");
        textboxpage.setcurrentaddress("1234 address");
        textboxpage.setcurrentaddress("satyam shivam");
        textboxpage.setcurrentaddress("Pune");
        textboxpage.clickSubmitButton();
        String actualaddress = textboxpage.getCurrentaddress();
        Assert.assertTrue(actualaddress.contains("1234 address"), "address is incorrect");

    }
}
