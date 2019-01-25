package pagefactory.homePage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageItems extends MobileAPI {

    @FindBy(xpath = "//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    public WebElement buttonTab;
    @FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Buttons\"]")
    public WebElement buttonText;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[1]")
    public WebElement buttonIcon;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Various uses of UIButton\"]")
    public WebElement subButton;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Controls\"]")
    public WebElement controlsButton;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[2]")
    public WebElement controlsIcon;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Various uses of UIControl\"]")
    public WebElement subControls;
    @FindBy(xpath="//XCUIElementTypeApplication[@name=\"UICatalog\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    public WebElement textFieldsButton;
    @FindBy (xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[3]")
    public WebElement textFieldsIcon;
    @FindBy(xpath ="(//XCUIElementTypeButton[@name=\"More Info\"])[4]" )
    public WebElement searchBarIcon;
    @FindBy(xpath="(//XCUIElementTypeButton[@name=\"More Info\"])[5]")
    public WebElement textViewIcon;
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"More Info\"])[6]")
    public WebElement pickersIcon;

    public void buttonTabCheck(){
        buttonTab.click();
    }
    public void buttonIconCheck(){
        buttonIcon.click();
    }
    public void controlsButtonCheck(){
        controlsButton.click();
    }
    public void controlsIconCheck(){
        controlsIcon.click();
    }
    public void textFieldsCheck(){
        textFieldsButton.click();
    }
    public void textFieldsIconCheck(){
        textFieldsIcon.click();
    }
    public void searchBarIconCheck(){
        searchBarIcon.click();
    }
    public void textViewIconCheck(){
        textViewIcon.click();
    }
    public void pickersIconCheck(){
        pickersIcon.click();
    }




}
