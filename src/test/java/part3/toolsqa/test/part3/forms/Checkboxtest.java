package part3.toolsqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3.toolsqa.base.BaseTest;

public class Checkboxtest extends BaseTest {

    @Test
    public void checkboxTest(){
        var formspage = homePage.gotoForms().clickPracticeForm();
        formspage.clicksSportsHobbyCheckbox();
        formspage.clicksReadingHobbyCheckbox();
        formspage.clicksmusicHobbyCheckbox();
        formspage.unclicksReadingHobbyCheckbox();

        boolean isreadingselected = formspage.isReadingHobbyCheckboxSelected();
        Assert.assertFalse(isreadingselected, "Reading hobby checkbox is selected");
    }
}
