package iPhone;

import ExtentReport.TestLogger;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pagefactory.AlertsPage.Alerts;
import pagefactory.UiCatalogPage.UiCatalog;


public class AlertsTest extends MobileAPI {
    public Alerts alerts(){
        UiCatalog uiCatalog = PageFactory.initElements(ad,UiCatalog.class);
        uiCatalog.getAlerts();
        return PageFactory.initElements(ad,Alerts.class);
    }
    @Test
    public void testActionSheetSimple() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        alerts().showActionSheetSimple();
        sleep(2);
    }
    @Test
    public void testActionSheetOkCancel() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        alerts().showActionSheetOkCancel();
        sleep(2);
    }
    @Test
    public void testActionSheetCustom() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        alerts().showActionSheetCustom();
        sleep(2);
    }
    @Test
    public void testAlertSimple() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        alerts().showAlertSimple();
        sleep(2);
    }
    @Test
    public void testAlertOkCancel() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        alerts().showAlertOkCancel();
        sleep(2);
    }
    @Test
    public void testAlertCustom() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        alerts().showAlertCustom();
        sleep(2);
    }
    @Test
    public void testSecureInput() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        alerts().showSecureTextInput();
        sleep(2);
    }

}
