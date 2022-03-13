package tests.rahulshettyacademyPageTests;

import base.SeleniumBase;
import org.testng.annotations.Test;
import pages.homework.practicePage.RahulshettyacademyPage;

public class TestRahulshettyacademy extends SeleniumBase {
    RahulshettyacademyPage rahulshettyacademyPage;
    @Test
    public void check(){
        rahulshettyacademyPage = new RahulshettyacademyPage(driver);
        driver.get(getBaseUrl3());
        rahulshettyacademyPage.setRadioButton();
        rahulshettyacademyPage.fillSuggession("esiminch");
        rahulshettyacademyPage.setDropDown("option2");
        rahulshettyacademyPage.selectCheckBox();
        rahulshettyacademyPage.openNewTab();
        rahulshettyacademyPage.openNewWindow();
        rahulshettyacademyPage.alertAccept();
        rahulshettyacademyPage.alertConfirm("Gago");
        rahulshettyacademyPage.isElementDisplayed();
        rahulshettyacademyPage.checkWebTable();
        //rahulshettyacademyPage.mouseHoverAction();
    }







}
