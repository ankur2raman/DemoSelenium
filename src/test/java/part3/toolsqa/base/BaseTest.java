package part3.toolsqa.base;

import com.Base.BasePage;
import com.toolsqa.pages.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static utilities.utility.setutilitydriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String toolsqa_url = "https://demoqa.com/";

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
       // driver.manage().timeouts().scripxtTimeout(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void loadapplication() {
        driver.get(toolsqa_url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setutilitydriver();
        homePage = new HomePage();
    }

    @AfterMethod
    public void takefailedResultScreenshot(ITestResult testresult) {
        if(ITestResult.FAILURE == testresult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir")+"/resources/screenshots/("+
                    java.time.LocalDate.now()+testresult.getName()+").png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot takes screenshot at " + destination.getAbsolutePath());
        }

    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
