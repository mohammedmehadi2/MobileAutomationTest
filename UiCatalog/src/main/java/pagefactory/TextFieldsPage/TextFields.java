package pagefactory.TextFieldsPage;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextFields extends MobileAPI {
    @FindBy(xpath = "//XCUIElementTypeApplication[@name='UICatalog']/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]")
    WebElement textfields;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='UITextField']")
    WebElement uitextfield;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Normal']")
    WebElement firsttextfield;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Rounded']")
    WebElement secondtextfields;
    @FindBy(xpath = "//XCUIElementTypeSecureTextField[@name='Secure']")
    WebElement thirdtextfields;
    @FindBy(xpath = "//XCUIElementTypeTextField[@name='Check']")
    WebElement fourthtextFields;
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='UITextField Secure']")
    WebElement uitextfieldsecure;

    //Methods/Action
    public void goToTextFildsTab(){
        textfields.click();
    }
    public boolean goToTextFields(){
        textfields.click();
        return uitextfield.isDisplayed();
    }
    public boolean firstTextFields(){
        firsttextfield.click();
        firsttextfield.sendKeys("1st text");
        firsttextfield.clear();
        return uitextfield.isDisplayed();
    }
    public boolean secondTextFields(){
        secondtextfields.sendKeys("2nd text");
        secondtextfields.clear();
        return uitextfield.isDisplayed();
    }
    public boolean thirdTextFields(){
        thirdtextfields.sendKeys("3rd text");
        thirdtextfields.clear();
        return uitextfieldsecure.isDisplayed();
    }
    public boolean fourthTextFields(){
        fourthtextFields.sendKeys("4th text");
        fourthtextFields.clear();
        return uitextfieldsecure.isDisplayed();
    }

}
