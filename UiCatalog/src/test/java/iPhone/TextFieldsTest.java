package iPhone;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactory.TextFieldsPage.TextFields;

public class TextFieldsTest extends MobileAPI {

    TextFields textFields;

    @BeforeMethod
    public void initializing(){
        textFields = PageFactory.initElements(ad, TextFields.class);
        textFields.goToTextFildsTab();
    }
    @Test
    public void textFieldPageValidation(){
        Assert.assertEquals(textFields.goToTextFields(),true);
    }
    @Test
    public void firstTextFieldsTest(){
        Assert.assertEquals(textFields.firstTextFields(),true);
    }
    @Test
    public void secondTextFieldsTest(){
        Assert.assertEquals(textFields.secondTextFields(),true);
    }
    @Test
    public void thirdTextFieldsTest(){
        Assert.assertEquals(textFields.thirdTextFields(),true);
    }
    @Test
    public void fourthTextFieldsTest(){
        Assert.assertEquals(textFields.fourthTextFields(),true);
    }
}
