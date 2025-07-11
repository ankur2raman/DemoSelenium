package part3.toolsqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

import java.util.List;

import static com.Base.BasePage.delay;

public class scrollselectdropowntest extends BaseTest {
    @Test
    public void testmultiselectdropdown(){
       var selectmenu =  homePage.gotowidgets().clickSelectMenu();
        selectmenu.selectstandardmulti("Volvo");
        selectmenu.selectstandardmulti(1);
        selectmenu.selectstandardmulti("Audi");
        selectmenu.selectstandardmulti(2);
        delay(2000);

        selectmenu.delectstandardmulti("saab");
        delay(2000);

        List<String> actualselectedoptions = selectmenu.getallSelectedmultiOptions();
        Assert.assertTrue(actualselectedoptions.contains("Volvo"));
        Assert.assertTrue(actualselectedoptions.contains("Opel"));
        Assert.assertFalse(actualselectedoptions.contains("Saab"), "Saab is selected as an option");
        Assert.assertTrue(actualselectedoptions.contains("Audi"));


    }
}
