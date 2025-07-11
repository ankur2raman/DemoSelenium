package utilities;

import com.toolsqa.pages.Widgets.SelectMenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtlity extends utility{

    private static Select finddropdown(By locator){
        return new Select(driver.findElement(locator));

    }

    public static void selectbyvisibletext(By locator, String text){
        finddropdown(locator).selectByVisibleText(text);

    }
    public static void selectbyIndex(By locator, int index){
        finddropdown(locator).selectByIndex(index);

    }
    public static void selectbyvalue(By locator, String value){
        finddropdown(locator).selectByValue(value);

    }
    public static void deselectbyvalue(By locator, String value){
        finddropdown(locator).deselectByValue(value);

    }

    public static List<String> getallSelectedOptions(By locator){
        finddropdown(locator).isMultiple();
       List<WebElement> allselectedoptions =  finddropdown(locator).getAllSelectedOptions();
       return allselectedoptions.stream().map(WebElement::getText).collect(Collectors.toList());

    }

}
