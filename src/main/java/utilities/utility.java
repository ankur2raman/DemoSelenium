package utilities;

import com.Base.BasePage;
import org.openqa.selenium.WebDriver;

public class utility {
    public static WebDriver driver;

    public static void setutilitydriver(){
        driver = BasePage.driver;
    }
}
//generate random numbers
// return string to uppercase