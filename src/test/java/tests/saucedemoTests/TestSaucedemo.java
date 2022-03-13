package tests.saucedemoTests;

import base.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.homework.saucedemoCom.SaucedemoPage;

public class TestSaucedemo extends SeleniumBase {
    SaucedemoPage saucedemoPage;

    @Test
    public void test1() {
        saucedemoPage = new SaucedemoPage(driver);
        driver.get(getBaseUrl4());
        saucedemoPage.fillUserName();
        saucedemoPage.fillPassword();
        saucedemoPage.loginButtonClick();
        saucedemoPage.checkLocation();
        saucedemoPage.setFilter();
        saucedemoPage.checkFilter();
        saucedemoPage.addToCardButtonClick();
        saucedemoPage.cartClick();
        saucedemoPage.checkItemInCard();
        saucedemoPage.checkoutClick();
        saucedemoPage.fillCheckoutInfo("a", "aa", "aaa");
        saucedemoPage.continueButtonClick();
        saucedemoPage.checkPrice();
        saucedemoPage.finishButtonClick();
        saucedemoPage.checkFinalHeaderText();


    }
}
