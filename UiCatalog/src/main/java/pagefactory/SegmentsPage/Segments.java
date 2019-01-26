package pagefactory.SegmentsPage;


import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Segments extends MobileAPI {
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Segments']")
    WebElement segments;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Segments']")
    WebElement uisegmentedcontrol;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Check']")
    WebElement firstleft;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Search']")
    WebElement firstmiddle;
    @FindBy(xpath = "//XCUIElementTypeButton[@name='Tools']")
    WebElement firstright;
    @FindBy (xpath = "//XCUIElementTypeButton[@name='Check']")
    WebElement secondleft;
    @FindBy (xpath = "//XCUIElementTypeButton[@name='Search']")
    WebElement secondmid;
    @FindBy (xpath = "//XCUIElementTypeButton[@name='Tools']")
    WebElement secondright;

    //Methods/Action
    public void goToSegmentsFildsTab(){
        segments.click();
    }
    public boolean goToSegments(){
        segments.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean firstSegemntControlleft(){
       firstleft.click();
       return uisegmentedcontrol.isDisplayed();
    }
    public boolean firstSegemntControlmid(){
        firstmiddle.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean firstSegemntControlright(){
        firstright.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean secondSegemntControlleft(){
        secondleft.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean secondSegemntControlmid(){
        secondmid.click();
        return uisegmentedcontrol.isDisplayed();
    }
    public boolean secondSegemntControlright(){
        secondright.click();
        return uisegmentedcontrol.isDisplayed();
    }
}
