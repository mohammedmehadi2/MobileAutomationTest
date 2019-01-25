package iPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pagefactory.ControlsPage.Controls;

public class TestButton extends Controls {
    @Test
    public void buttonClickTest() throws InterruptedException {
        Controls controlsobj = PageFactory.initElements(ad, Controls.class);
        controlsobj.buttonClick();
    }
}
