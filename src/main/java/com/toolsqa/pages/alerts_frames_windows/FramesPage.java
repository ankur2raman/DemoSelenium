package com.toolsqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static utilities.switchToUtility.*;

public class FramesPage extends Alerts_fremes_windowsPage{
    private By textinframe = By.id("sampleHeading");
    private String iFrameBigbox = "frame1";
    private By headerframestext = By.xpath("//div[@id='app']//h1[text()='Frames']");
    //private By iframesmallbox = By.xpath("//div[@id='frame2Wrapper']/iframe");
    private By iframesmallbox = By.id("frame2");

    public String getHeaderFramesText(){
        return find(headerframestext).getText();
    }

    private void switchtoBigBox(){
        //driver.switchTo().frame(iFrameBigbox);
        switchtoframeString(iFrameBigbox);
    }

    private void switchtosmallBox(){
//        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
//        System.out.println("Total frames: " + frames.size());
          //switchtoFrameIndex(5);
          switchtoFrameWebElement(find(iframesmallbox));

    }

    public String gettextinBigframe(){
        switchtoDefaultContent();
        switchtoBigBox();
        String bigframetext = find(textinframe).getText();
        System.out.println("Big frame text:"+bigframetext);
        //driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent(); //Switch to parent frame and switchto defaultcontent ..Always suggested
        switchtoDefaultContent();
        return bigframetext;

    }

    public String gettextinsmallframe(){
//        switchtosmallBox();
//        String smallframetext = find(textinframe).getText();
//        System.out.println("Small frame text:"+smallframetext);
//        switchtoDefaultContent();
//        return smallframetext;


            switchtoDefaultContent();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(iframesmallbox));
            switchtoFrameWebElement(iframe);

            WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(textinframe));
            String smallframetext = heading.getText();
            System.out.println("Small frame text: " + smallframetext);

            switchtoDefaultContent();
            return smallframetext;


    }

}
