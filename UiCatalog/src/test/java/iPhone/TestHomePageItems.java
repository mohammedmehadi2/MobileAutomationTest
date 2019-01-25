package iPhone;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagefactory.ControlsPage.Controls;
import pagefactory.homePage.HomePageItems;

public class TestHomePageItems extends MobileAPI {
    HomePageItems objHomePageItems;
    @BeforeMethod
    public void initializationOfElements(){
        objHomePageItems=PageFactory.initElements(ad,HomePageItems.class);
    }
    @Test
    public void buttonIconCheckTest() throws InterruptedException {
        objHomePageItems.buttonIconCheck();
    }
    @Test
    public void controlsButtonCheckTest() throws InterruptedException {
        objHomePageItems.controlsButtonCheck();
    }
    @Test
    public void controlsIconCheckTest() throws InterruptedException {
        objHomePageItems.controlsIconCheck();
    }
    @Test
    public void textFieldsCheckTest() throws InterruptedException {
        objHomePageItems.textFieldsCheck();
    }
    @Test
    public void textFieldsIconCheckTest() throws InterruptedException {
        objHomePageItems.textFieldsIconCheck();
    }
    @Test
    public void searchBarIconCheckTest() throws InterruptedException {
        objHomePageItems.searchBarIconCheck();
    }
    @Test
    public void textViewIconCheckTest() throws InterruptedException {
        objHomePageItems.textViewIconCheck();
    }
    @Test
    public void pickersIconCheckText() throws InterruptedException{
        objHomePageItems.pickersIconCheck();
    }
}
