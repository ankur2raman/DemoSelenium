package part3.toolsqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class RadioButton extends BaseTest {

    @Test
    public void testRadioButton(){
        var formspage = homePage.gotoForms().clickPracticeForm();
        formspage.clickfemaleRadioButton();
        boolean isfemaleRadioButtonSelected = formspage.isfemaleRadioButtonSelected();
        Assert.assertTrue(isfemaleRadioButtonSelected, "Female radio button is not selected");
    }
}
